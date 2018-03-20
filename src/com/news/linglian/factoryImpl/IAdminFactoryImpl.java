/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.factoryImpl;

import com.news.linglian.entity.Comment;
import com.news.linglian.entity.Email;
import com.news.linglian.entity.News;
import com.news.linglian.entity.Newstype;
import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import static com.news.linglian.factoryImpl.IUserFactoryImpl.speed;
import static com.news.linglian.factoryImpl.IUserFactoryImpl.time;
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
import db.DBUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.MapUtil;
import util.ServletCheckBuilder;
import util.ServletUtil;

public class IAdminFactoryImpl implements IServletFactory {

    private INewsService ias = null;
    private INewstypeService its = null;
    private IUserService ius = null;
    private ICommentService ics = null;
    private IEmailService ies = null;

    public IAdminFactoryImpl() {
        ias = new INewsServiceImpl();
        its = new INewstypeServiceImpl();
        ius = new IUserServiceImpl();
        ics = new ICommentServiceImpl();
        ies = new IEmailServiceImpl();
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet, String method) throws ServletException, IOException {
        // TODO Auto-generated method stub
        getAll(request, response);
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if (!"-99".equals(user.getLvl())) {
                request.getSession().setAttribute("info", "你不是管理员");
                ServletUtil.redirect(request, response, "index.jsp");
                return;
            }
            switch (method) {
                case "change":
                    doChange(request, response, servlet);
                    break;
                case "add":
                    doAdd(request, response, servlet);
                    break;
                case "del":
                    doDel(request, response, servlet);
                    break;
                case "reviewNews":
                    doReviewNews(request, response, servlet);
                    break;
                case "notReviewNews":
                    doNotReviewNews(request, response, servlet);
                    break;
                case "adminRemove":
                    doAdminRemove(request, response, servlet);
                    break;
                case "adminRemoves":
                    doAdminRemoves(request, response, servlet);
                    break;
                case "queryAll":
                    doQueryAll(request, response, servlet);
                    break;
                case "queryAllComment":
                    queryAllComment(request, response, servlet);
                    break;
                case "adminRemoveComment":
                    doAdminRemoveComment(request, response, servlet);
                    break;
                case "queryAllEmail":
                    queryAllEmail(request, response, servlet);
                    break;
                case "adminRemoveEmail":
                    doAdminRemoveComment(request, response, servlet);
                    break;
                case "queryAllUser":
                    queryAllUser(request, response, servlet);
                    break;
                case "adminBadUser":
                    doAdminBadUser(request, response, servlet);
                    break;
                case "adminInsertNewsTypeId":
                    doAdminInsertNewsTypeId(request, response, servlet);
                    break;
                case "adminRemoveNewsType":
                    doAdminRemoveNewsType(request, response, servlet);
                    break;
                case "queryAllNewsType":
                    queryAllNewsType(request, response, servlet);
                    break;
            }
        }
    }

    /**
     * 获得所有类别
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void queryAllNewsType(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        int page = 1;
        int limit = 15;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page").toString());
        }
        if (request.getParameter("limit") != null) {
            limit = Integer.parseInt(request.getParameter("limit").toString());
        }
        Newstype com = new Newstype();
        List<Newstype> tList = its.getNewstypes(com);
        int size = 0;
        if (tList != null) {
            size = tList.size();
        }
        List<Newstype> pageNews = DBUtil.getObjectLimit("newstype", "newsTypeId", com, (page - 1) * limit, limit);
        request.getSession().setAttribute("adminCommentSize", size);
        request.getSession().setAttribute("adminCommentList", pageNews);
        request.getSession().setAttribute("adminCommentPage", page);
        request.getSession().setAttribute("adminCommentLimit", limit);
        ServletUtil.forward(request, response, "admin/newsType.jsp");
    }

    /**
     * 插入类别
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminRemoveNewsType(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNp("newsTypeId", "类型名不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            its.removeOfNewsTypeId(m.get("par_newsTypeId"));
        }
    }

    /**
     * 插入类别
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminInsertNewsTypeId(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNp("name", "类型名不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            Newstype t = new Newstype();
            t.setName(m.get("par_name"));
            t.setBody(request.getParameter("body"));
            its.insert(t);
        }
    }

    /**
     * 封号
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminBadUser(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNp("userId", "消息id不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User c = ius.getUserOfUserId(m.get("par_userId"));
            c.setLvl("-98");
            ius.updateOfUserId(c, c.getUserId());
        }
    }

    /**
     * 获得所有用户
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void queryAllUser(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        int page = 1;
        int limit = 15;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page").toString());
        }
        if (request.getParameter("limit") != null) {
            limit = Integer.parseInt(request.getParameter("limit").toString());
        }
        User com = new User();
        List<User> tList = ius.getUsers(com);
        int size = 0;
        if (tList != null) {
            size = tList.size();
        }
        List<User> pageNews = DBUtil.getObjectLimit("user", "userId", com, (page - 1) * limit, limit);
        request.getSession().setAttribute("adminCommentSize", size);
        request.getSession().setAttribute("adminCommentList", pageNews);
        request.getSession().setAttribute("adminCommentPage", page);
        request.getSession().setAttribute("adminCommentLimit", limit);
        ServletUtil.forward(request, response, "admin/user.jsp");
    }

    /**
     * 删除消息
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminRemoveEmail(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNp("emailId", "消息id不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            Email c = ies.getEmailOfEmailId(m.get("par_emailId"));
            Email e = new Email();
            if (c.getFromUserId() != null) {
                e.setBody("您的消息" + c.getBody() + "被删除，理由为" + request.getParameter("body"));
                e.setToUserId(c.getFromUserId());
                e.setTime(new Date().toLocaleString());
                ies.insert(e);
            }
            if (c.getToUserId() != null) {
                e = new Email();
                e.setBody("您的消息" + c.getBody() + "被删除，理由为" + request.getParameter("body"));
                e.setToUserId(c.getToUserId());
                e.setTime(new Date().toLocaleString());
                ies.insert(e);
            }
            ies.removeOfEmailId(m.get("par_emailId"));
        }
    }

    /**
     * 获得所有消息
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void queryAllEmail(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        int page = 1;
        int limit = 15;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page").toString());
        }
        if (request.getParameter("limit") != null) {
            limit = Integer.parseInt(request.getParameter("limit").toString());
        }
        Email com = new Email();
        List<Email> tList = ies.getEmails(com);
        int size = 0;
        if (tList != null) {
            size = tList.size();
        }
        List<Email> pageNews = DBUtil.getObjectLimit("email", "emailId", com, (page - 1) * limit, limit);
        request.getSession().setAttribute("adminCommentSize", size);
        request.getSession().setAttribute("adminCommentList", pageNews);
        request.getSession().setAttribute("adminCommentPage", page);
        request.getSession().setAttribute("adminCommentLimit", limit);
        ServletUtil.forward(request, response, "admin/email.jsp");
    }

    /**
     * 删除评论
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminRemoveComment(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNp("commentId", "评论id不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            Comment c = ics.getCommentOfCommentId(m.get("par_commentId"));
            Email e = new Email();
            e.setBody("您的评论" + c.getBody() + "被删除，理由为" + request.getParameter("body"));
            e.setToUserId(c.getUserId());
            e.setTime(new Date().toLocaleString());
            ies.insert(e);
            ics.removeOfCommentId(m.get("par_commentId"));
        }
    }

    /**
     * 获得所有评论
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void queryAllComment(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        int page = 1;
        int limit = 15;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page").toString());
        }
        if (request.getParameter("limit") != null) {
            limit = Integer.parseInt(request.getParameter("limit").toString());
        }
        Comment com = new Comment();
        List<Comment> tList = ics.getComments(com);
        int size = 0;
        if (tList != null) {
            size = tList.size();
        }
        List<Comment> pageNews = DBUtil.getObjectLimit("comment", "commentId", com, (page - 1) * limit, limit);
        request.getSession().setAttribute("adminCommentSize", size);
        request.getSession().setAttribute("adminCommentList", pageNews);
        request.getSession().setAttribute("adminCommentPage", page);
        request.getSession().setAttribute("adminCommentLimit", limit);
        ServletUtil.forward(request, response, "admin/comment.jsp");
    }

    /**
     * 获得新闻列表
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doQueryAll(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        String status = "待审核";
        int page = 1;
        int limit = 15;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page").toString());
        }
        if (request.getParameter("limit") != null) {
            limit = Integer.parseInt(request.getParameter("limit").toString());
        }
        if (request.getParameter("status") != null) {
            status = request.getParameter("status");
        }
        News news = new News();
        news.setStatus(status);
        List<News> tList = ias.getNewss(news);
        int size = 0;
        if (tList != null) {
            size = tList.size();
        }
        List<News> pageNews = DBUtil.getObjectLimit("news", "newsId", news, (page - 1) * limit, limit);
        request.getSession().setAttribute("adminNewsSize", size);
        request.getSession().setAttribute("adminNewsList", pageNews);
        request.getSession().setAttribute("adminNewsPage", page);
        request.getSession().setAttribute("adminNewsLimit", limit);
        request.getSession().setAttribute("adminNewsStatus", status);
        ServletUtil.forward(request, response, "admin/index.jsp");
    }

    /**
     * 审核新闻
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doNotReviewNews(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "reviewNews_from")
                .addNp("newsId", "新闻id不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            News news = ias.getNewsOfNewsId(m.get("par_newsId"));
            news.setStatus("未通过");
            Email e = new Email();
            e.setBody("您的新闻" + news.getTitle() + "未通过审核，理由为：" + request.getParameter("body"));
            e.setToUserId(news.getUserId());
            e.setTime(new Date().toLocaleString());
            ies.insert(e);
            ias.updateOfNewsId(news, m.get("par_newsId"));
        }
    }

    protected void doReviewNews(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "reviewNews_from")
                .addNp("newsId", "新闻id不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            News news = ias.getNewsOfNewsId(m.get("par_newsId"));
            news.setStatus("通过");
            Email e = new Email();
            e.setBody("您的新闻" + news.getTitle() + "通过了审核");
            e.setToUserId(news.getUserId());
            e.setTime(new Date().toLocaleString());
            ies.insert(e);
            ias.updateOfNewsId(news, m.get("par_newsId"));
        }

    }

    /**
     * 管理员删除单个新闻
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminRemove(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
                .addNp("newsId", "新闻id不能为空")
                //.addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            ies.removeOfNewsId(m.get("par_newsId"));
            ics.removeOfNewsId(m.get("par_newsId"));
            ias.removeOfNewsId(m.get("par_newsId"));
        }
    }

    /**
     * 管理员批量删除新闻
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdminRemoves(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String[] newsIds = request.getParameterValues("newsIds");
        for (int i = 0; i < newsIds.length; i++) {
            int isRemove = ias.removeOfNewsId(newsIds[i]);
            if (isRemove == 0) {
                request.getSession().setAttribute("info", "删除失败");
                ServletUtil.redirect(request, response, servlet, "adminRemoves_from");
            }
        }
        request.getSession().setAttribute("info", "删除成功");
    }

    /**
     * 删除属性
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doDel(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("par", "请选择要删除的属性")
                .addNp("parVal", "请选择要删除的值")
                .addNp("newsId", "请选择要删除的新闻编号")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                String par = m.get("par_par");
                if ("buff".equals(par)) {
                    String newsId = m.get("par_newsId");
                    String val = m.get("par_parVal");
                    News news = ias.getNewsOfNewsId(newsId);
                    String strs = news.getBuff();
                    if (strs != null) {
                        news.setBuff("");
                        List<String> tStrList = new ArrayList();
                        String[] stra = strs.split(",");
                        for (String s : stra) {
                            if (!val.equals(s)) {
                                tStrList.add(s);
                            }
                        }
                        System.out.println(tStrList);
                        for (String s : tStrList) {
                            news.setBuff(news.getBuff() + "," + s);
                        }
                    }
                    ias.updateOfNewsId(news, newsId);
                }
            }
        }
    }

    /**
     * 追加属性
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdd(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("par", "请选择要追加的属性")
                .addNp("parVal", "请选择要追加的值")
                .addNp("newsId", "请选择要追加的新闻编号")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                String par = m.get("par_par");
                if ("buff".equals(par)) {
                    String newsId = m.get("par_newsId");
                    String val = m.get("par_parVal");
                    News news = ias.getNewsOfNewsId(newsId);
                    String strs = news.getBuff();
                    if (strs != null && !"".equals(strs)) {
                        String[] stra = strs.split(",");
                        boolean flag = true;
                        for (String s : stra) {
                            if (val.equals(s)) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) { // 不存在此buff的时候
                            news.setBuff(strs + "," + val);
                        }
                    } else { // 没有buff是的时候
                        news.setBuff(val);
                    }
                    ias.updateOfNewsId(news, newsId);
                }
            }
        }
    }

    /**
     * 更改属性
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doChange(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("par", "请选择要修改的属性")
                .addNp("parVal", "请选择要修改的值")
                .addNp("newsId", "请选择要修改的新闻编号")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                String par = m.get("par_par");
                if ("status".equals(par)) {
                    String newsId = m.get("par_newsId");
                    String val = m.get("par_parVal");
                    News news = new News();
                    news.setStatus(val);
                    ias.updateOfNewsId(news, newsId);
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
            getAllNewstypes(request, response);
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
        List<User> list = ius.getUsers(new User());
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
        List<News> list = ias.getNewss(new News());
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
