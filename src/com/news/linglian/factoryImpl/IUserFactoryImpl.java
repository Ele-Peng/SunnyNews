package com.news.linglian.factoryImpl;

import com.alibaba.fastjson.JSON;
import com.news.linglian.entity.Comment;
import com.news.linglian.entity.Email;
import com.news.linglian.entity.News;
import com.news.linglian.entity.Newstype;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ServletCheckBuilder;
import util.ServletUtil;
import util.StringArrayListBuilder;

import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.ICommentService;
import com.news.linglian.service.IEmailService;
import com.news.linglian.service.INewsService;
import com.news.linglian.service.INewstypeService;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.ICommentServiceImpl;
import com.news.linglian.serviceImpl.IEmailServiceImpl;
import com.news.linglian.serviceImpl.INewsServiceImpl;
import com.news.linglian.serviceImpl.INewstypeServiceImpl;
import com.news.linglian.serviceImpl.IUserServiceImpl;
import com.news.linglian.serviceN.INewsServiceN;
import com.news.linglian.serviceN.IUserServiceN;
import com.news.linglian.serviceNImpl.INewsServiceNImpl;
import com.news.linglian.serviceNImpl.IUserServiceNImpl;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MapUtil;
import util.Response;
import util.StringUtil;

/**
 *
 * IUserFactoryImpl.java
 *
 * @author wcx
 *
 * @Date: 2018年1月12日 下午12:53:55
 *
 */
public class IUserFactoryImpl implements IServletFactory {

    private IUserServiceN ias = null;
    private INewsServiceN ins = null;
    private ICommentService ics = null;
    private IEmailService ies = null;
    private INewstypeService its = null;

    public static long time = 0;
    public static long speed = 1000;

    public IUserFactoryImpl() {
        its = new INewstypeServiceImpl();
        ias = new IUserServiceNImpl();
        ins = new INewsServiceNImpl();
        ics = new ICommentServiceImpl();
        ies = new IEmailServiceImpl();
    }

    /**
     * 接受页面请求
     */
    @Override
    public void doThing(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String method) throws ServletException, IOException {
        getAll(request, response);
        // TODO Auto-generated method stub
        switch (method) {
            case "login":
                doLogin(request, response, servlet);
                break;
            case "remove":
                doRemove(request, response, servlet);
                break;
            case "insert":
                doInsert(request, response, servlet);
                break;
            case "update":
                doUpdate(request, response, servlet);
                break;
            case "query":
                doQuery(request, response, servlet);
                break;
            case "insertFriend":
                doInsertFriend(request, response, servlet);
                break;
            case "index":
                doIndex(request, response, servlet);
                break;
            case "logout":
                doLogout(request, response, servlet);
                break;
            case "updatePassword":
                doUpdatePassword(request, response, servlet);
                break;
            case "updateImg":
                doUpdateImg(request, response, servlet);
                break;
            case "sendMessage":
                doSendMessage(request, response, servlet);
                break;
            case "qd":
                doQd(request, response, servlet);
                break;
        }
    }

    // 签到
    protected void doQd(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_to")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if (!ServletUtil.equalOfObject(new Date().getDate(), user.getNowDays())) {
                user.setNowDays(String.valueOf(new Date().getDate()));
                user.setDays(StringUtil.addInt(user.getDays(), "1"));
                user.setMoney(StringUtil.addInt(user.getMoney(), "5"));
                ias.updateOfUserId(user, user.getUserId());
                request.getSession().setAttribute("isQd", true);
                request.getSession().setAttribute("info", "签到成功");
            } else {
                request.getSession().setAttribute("isQd", true);
                request.getSession().setAttribute("info", "今日已经签到");
            }
        }
    }

    protected void doSendMessage(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_to")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("body", "消息不能为空")
                .addNp("userId", "用户编号不能为空")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = (User) tMap.get("ses_identity");
            Email e = new Email();
            e.setFromUserId(user.getUserId());
            e.setToUserId(m.get("par_userId"));
            e.setBody(m.get("par_body"));
            e.setTime(new Date().toLocaleString());
            ServletUtil.checkdata(request, response, "UserAction.do?method=query&userId=" + m.get("par_userId"), "发送", ies.insert(e));
        }
    }

    /**
     * 上传图片
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doUpdateImg(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            String fileName = ServletUtil.updateFile(request, response, "img/" + user.getUserId() + "/", "png,PNG,JPG,jpg,gif,GIF");
            Response res = new Response();
            if (fileName == null) {
                res.setCode(-1);
                res.setMsg("上传失败");
                res.addDate("src", fileName);
            } else {
                res.setCode(1);
                res.setMsg("上传成功");
                user.setImage(fileName.substring(fileName.indexOf("img")));
                ias.updateOfUserId(user, user.getUserId());
                res.addDate("src", fileName.substring(fileName.indexOf("img")));
            }
            PrintWriter out = response.getWriter();
            out.println(JSON.toJSON(res));
            out.close();
        }
    }

    /**
     * 更新密码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doUpdatePassword(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNp("nowpass", "当前密码不能为空")
                .addNp("pass", "新密码不能为空")
                .addNp("repass", "确认密码不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .addEpp("pass", "repass", "二次密码不一样", false)
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = (User) tMap.get("ses_identity");
            if (ias.getUserOfUserIdAndPassword(user.getUserId(), m.get("par_nowpass")) == null) {
                request.getSession().setAttribute("info", "当前密码错误");
                ServletUtil.redirect(request, response, servlet, "update_from");
            } else {
                user.setPassword(m.get("par_pass"));
                ias.updateOfUserId(user, user.getUserId());
                request.getSession().setAttribute("info", "修改成功");
                ServletUtil.redirect(request, response, "UserAction.do?method=logout");
            }
        }
    }

    protected void doLogout(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        request.getSession().removeAttribute("identity");
        response.sendRedirect("user/login.jsp");
    }

    /**
     * 获取用户中心
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doIndex(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            List<News> tList = ins.getNewssOfUserId(user.getUserId());
            List<News> newsList = new ArrayList();
            if (tList != null) {
                for (News s : tList) {
                    if (!"已删除".equals(s.getStatus())) {
                        newsList.add(s);
                    }
                }
            }
            String str = user.getNewIds();
            String[] strs = new String[0];
            List<News> scList = null;
            if (str != null && !"".equals(str)) {
                strs = str.split(",");
                scList = ins.getNewssOfNewsIds(strs);
            }
            String gz = user.getUserIds();
            List<User> gzList = null;
            if (str != null && !"".equals(str)) {
                strs = gz.split(",");
                gzList = ias.getUsersOfUsersIds(strs);
            }
            request.getSession().setAttribute("newsList", newsList);
            request.getSession().setAttribute("scList", scList);
            request.getSession().setAttribute("gzList", gzList);
            ServletUtil.forward(request, response, "user/index.jsp");
        }
    }

    /**
     * 加为好友（关注）
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doInsertFriend(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_to")
                .addNp("userId", "需要填写需要添加的用户id")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = (User) tMap.get("ses_identity");
            String str = user.getUserIds();
            boolean isInsert = true;
            if (str != null) {
                String[] userIds = str.split(",");
                for (String id : userIds) {
                    if (id.equals(m.get("par_userId")) || user.getUserId().equals(m.get("par_userId"))) {
                        isInsert = false;
                        break;
                    }
                }
            } else {
                str = "";
            }
            if (isInsert) {
                user.setUserIds(str + "," + m.get("par_userId"));
                ias.updateOfUserId(user, user.getUserId());
                ServletUtil.dataOfSetSesForward(request, response, servlet,
                        "query_to", "query_to", "关注",
                        user, "identity");
            }
            if (!isInsert) {
                request.getSession().setAttribute("info", "你已经关注了该用户");
                ServletUtil.forward(request, response, servlet, "query_to");
            }
        }
    }

    /**
     * 获取admin信息
     *
     */
    protected void doQuery(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_from")
                .addNp("userId", "需要填写需要查看的用户id")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            String userId = m.get("par_userId");
            User user = ias.getUserOfUserId(userId);
            user.setPassword(null);
            // 获取发布新闻列表
            int page = 1;
            int limit = 10;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            if (request.getParameter("limit") != null) {
                limit = Integer.parseInt(request.getParameter("limit"));
            }
            List<News> newsList = ins.queryOfUserIdNewssLimit(userId, page - 1, limit);
            if (newsList != null) {
                DateFormat dateFormat = new SimpleDateFormat();
                // 转换新闻发布时间
                for (News n : newsList) {
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
            request.getSession().setAttribute("newsList", newsList);
            // 获取评论列表
            List<Comment> commentList = ics.getCommentsOfUserId(userId);
            if (commentList != null) {
                String[] strs = new String[commentList.size()];
                DateFormat dateFormat = new SimpleDateFormat();
                for (int i = 0; i < commentList.size(); i++) {
                    Comment n = commentList.get(i);
                    try {
                        Date date = dateFormat.parse(n.getTime());
                        long time = new Date().getTime() - date.getTime();
                        if (time <= 1000 * 60) {
                            n.setTime("刚刚");
                        } else if (time <= 1000 * 60 * 60) {
                            n.setTime(String.valueOf(new Date(time).getMinutes()) + "分前");
                        }
                        strs[i] = n.getNewsId();
                    } catch (ParseException ex) {
                        System.out.println(ex.getMessage());
                        strs[i] = n.getNewsId();
                    }
                }
                List<News> comNewsList = null;
                Map<String, News> map = new HashMap();
                if (strs == null || strs.length == 0) {
                    comNewsList = ins.getNewssOfNewsIds(strs);
                    if (comNewsList != null) {
                        for (News news : comNewsList) {
                            if (!map.containsKey(news.getNewsId())) {
                                map.put(news.getNewsId(), news);
                            }
                        }
                    }
                }
                request.getSession().setAttribute("comNewsList", map);
                request.getSession().setAttribute("commentList", commentList);
            } else {
                request.getSession().setAttribute("comNewsList", null);
                request.getSession().setAttribute("commentList", null);
            }
            request.getSession().setAttribute("user", user);
            ServletUtil.forward(request, response, servlet, "query_to");
        }
    }

    /**
     * 修改
     *
     */
    protected void doUpdate(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNp("email", "邮箱不能为空")
                .addNp("username", "昵称不能为空")
                .addNp("sex", "性别不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = (User) tMap.get("ses_identity");
            user.setEmail(m.get("par_email"));
            user.setName(m.get("par_username"));
            user.setSex(m.get("par_sex"));
            user.setSignature(request.getParameter("sign"));
            int status = ias.updateOfUserId(user, user.getUserId());
            ServletUtil.checkdata(request, response, servlet, "update_to", "更新", status);
        }
    }

    protected void doInsert(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "insert_from")
                .addNp("email", "邮箱不能为空")
                .addNp("username", "昵称不能为空")
                .addNp("pass", "密码不能为空")
                .addNp("repass", "确认密码不能为空")
                .addNp("quiz1", "省份不能为空")
                .addNp("vercode", "验证码不能为空")
                .addEpp("pass", "repass", "二次密码不相同", false)
                .addEps("vercode", "token", "验证码错误", false)
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = new User();
            user.setName(m.get("par_username"));
            user.setEmail(m.get("par_email"));
            user.setPassword(m.get("par_pass"));
            user.setRegisterDate(new Date().toLocaleString());
            user.setPath(m.get("par_quiz1") + "," + m.get("par_quiz2") + "," + m.get("par_quiz3"));
            ServletUtil.checkdata(request, response, servlet, "insert_from", "插入", ias.insert(user));
        }
    }

    /**
     * 删除
     *
     */
    protected void doRemove(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String userId = request.getParameter("userId");
        if (ServletUtil.checkIdentity(request, response, servlet, "remove_from")) {
            List<String[]> list = new StringArrayListBuilder()
                    .addString(userId, "用户id")
                    .build();
            if (ServletUtil.isNull(request, response, servlet, "remove_from", list)) {
                ServletUtil.checkdata(request, response, servlet, "remove_from", "删除", ias.removeOfBUserIds(userId));
            }
        }
    }

    /**
     * 登录
     *
     */
    protected void doLogin(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_from")
                .addNp("email", "邮箱")
                .addNp("pass", "密码")
                .addNp("vercode", "验证码")
                .addEps("vercode", "token", "验证码错误", false)
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = ias.getUserOfPasswordAndEmail(m.get("par_pass"), m.get("par_email"));
            if (user == null) {
                request.getSession().setAttribute("info", "当前密码错误");
                ServletUtil.redirect(request, response, servlet, "login_from");
            } else {
                if ("-98".equals(user.getLvl())) {
                    request.getSession().setAttribute("info", "该账号已被封号");
                    ServletUtil.redirect(request, response, servlet, "login_from");
                } else {
                    user.setLoginDate(new Date().toLocaleString());
                    ias.updateOfUserId(user, user.getUserId());
                    ServletUtil.dataOfSetSesRredirect(request, response, servlet,
                            "login_to", "login_from", "登录",
                            user, "identity");
                }
            }
        }
    }

    /**
     * 获得全部信息
     *
     * @param request
     * @param response
     */
    protected synchronized void getAll(HttpServletRequest request,
            HttpServletResponse response) {
        if (new Date().getTime() - time >= speed) {
            time = new Date().getTime();
            getAllComment(request, response);
            getAllUser(request, response);
            getAllNews(request, response);
        }
    }

    private synchronized void getAllComment(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, Comment> m = new HashMap();
        List<Comment> list = ics.getComments(new Comment());
        if (list != null) {
            for (Comment c : list) {
                m.put(c.getCommentId(), c);
            }
        }
        request.getServletContext().setAttribute("allComments", m);
    }

    private synchronized void getAllUser(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, User> m = new HashMap();
        List<User> list = ias.getUsers(new User());
        if (list != null) {
            for (User c : list) {
                m.put(c.getUserId(), c);
            }
        }
        request.getServletContext().setAttribute("allUsers", m);
    }

    private synchronized void getAllNews(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, News> m = new HashMap();
        List<News> list = ins.getNewss(new News());
        if (list != null) {
            for (News c : list) {
                m.put(c.getNewsId(), c);
            }
        }
        request.getServletContext().setAttribute("allNews", m);
    }

    private synchronized void getAllNewstypes(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, Newstype> m = new HashMap();
        List<Newstype> list = its.getNewstypes(new Newstype());
        if (list != null) {
            for (Newstype c : list) {
                m.put(c.getNewsTypeId(), c);
            }
        }
        request.getServletContext().setAttribute("allNewstypes", m);
    }
}
