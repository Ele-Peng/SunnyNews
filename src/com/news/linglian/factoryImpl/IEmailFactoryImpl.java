/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.factoryImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.news.linglian.entity.Email;
import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IEmailService;
import com.news.linglian.serviceImpl.IEmailServiceImpl;
import db.DBUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.MapUtil;
import util.ServletCheckBuilder;
import util.ServletUtil;

/**
 *
 * @author lol
 */
public class IEmailFactoryImpl implements IServletFactory {

    private IEmailService ies = null;

    public IEmailFactoryImpl() {
        ies = new IEmailServiceImpl();
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet, String method) throws ServletException, IOException {
        // TODO Auto-generated method stub
        switch (method) {
            case "look":
                doLook(request, response, servlet);
                break;
            case "lookAll":
                doLookAll(request, response, servlet);
                break;
            case "getEmail":
                doGetEmail(request, response, servlet);
                break;
            case "getEmailNumber":
                doGetEmailNumber(request, response, servlet);
                break;
        }
    }

    protected void doGetEmailNumber(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Email e = new Email();
            e.setToUserId(user.getUserId());
            e.setStatus("0");
            List<Email> list = ies.getEmails(e);
            PrintWriter out = response.getWriter();
            class SS {

                public int size;
                public Email email;
            }
            SS s = new SS();
            s.size = 0;
            if (list != null && !list.isEmpty()) {
                List<Email> tList = DBUtil.getObjectLimit("email", "emailId", "DESC", e, 0, 1);
                if (tList.size() != 0) {
                    s.size = list.size();
                }
                s.email = tList.get(0);
            }
            out.println(JSON.toJSON(s));
            out.close();
        }
    }

    /**
     * 获取消息列表
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doGetEmail(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Email e = new Email();
            e.setStatus("0");
            e.setToUserId(user.getUserId());
            int page = 1;
            int limit = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            request.getSession().setAttribute("emailPage", page);
            List<Email> tList = ies.getEmailsOfToUserIdAndStatus(user.getUserId(), "0");
            if (tList != null) {
                request.getSession().setAttribute("emailSize", tList.size());
            }
            List<Email> list = DBUtil.getObjectLimit("email", "emailId", "DESC", e, (page - 1) * limit, limit);
            if (list != null) {
                DateFormat dateFormat = new SimpleDateFormat();
                // 转换消息发布时间
                for (Email n : list) {
                    try {
                        Date date = dateFormat.parse(n.getTime());
                        long time = new Date().getTime() - date.getTime();
                        if (time <= 1000 * 60) {
                            n.setTime("刚刚");
                        } else if (time <= 1000 * 60 * 60) {
                            n.setTime(String.valueOf(new Date(time).getMinutes()) + "分前");
                        }
                    } catch (ParseException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            ServletUtil.dataOfSetSesForward(request, response, servlet, "email_to", "email_from", "获取", list, "emailList");
        }
    }

    /**
     * 将所有的消息设置为已经查看
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doLookAll(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "email_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = (User) tMap.get("ses_identity");
            Email e = new Email();
            e.setStatus("1");
            ServletUtil.checkdata(request, response, "EmailAction.do?method=getEmail", "删除", ies.updateOfToUserId(e, user.getUserId()));
        }
    }

    /**
     * 将消息设置为已经查看
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doLook(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "email_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("emailId", "消息id不能为空")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            Email e = new Email();
            e.setStatus("1");
            ServletUtil.checkdata(request, response, "EmailAction.do?method=getEmail", "删除", ies.updateOfEmailId(e, m.get("par_emailId")));
        }
    }
}
