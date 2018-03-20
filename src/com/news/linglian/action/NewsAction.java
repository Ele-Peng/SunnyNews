package com.news.linglian.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.linglian.factory.IServletFactory;

/**
 * Servlet implementation class NewsAction
 */
@WebServlet(name = "NewsAction", urlPatterns = "/NewsAction.do", initParams = {
    @WebInitParam(name = "action_factory", value = "com.news.linglian.factoryImpl.INewsFactoryImpl"),
    @WebInitParam(name = "login_from", value = "user/login.jsp"),
    @WebInitParam(name = "login_to", value = "user/index.jsp"),
    @WebInitParam(name = "queryOfId_from", value = "user/login.jsp"),
    @WebInitParam(name = "queryOfId_to", value = "news/newsDetail.jsp"),
    @WebInitParam(name = "remove_from", value = "UserAction.do?method=index"),
    @WebInitParam(name = "remove_to", value = "UserAction.do?method=index"),
    @WebInitParam(name = "update_from", value = "NewsAction.do?method=readyPost"),
    @WebInitParam(name = "update_to", value = "UserAction.do?method=index"),
    @WebInitParam(name = "queryAll_from", value = "index.jsp"),
    @WebInitParam(name = "queryAll_to", value = "index.jsp"),
    @WebInitParam(name = "insert_to", value = "UserAction.do?method=index"),
    @WebInitParam(name = "insert_from", value = "NewsAction.do?method=readyPost")})
public class NewsAction extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsAction() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doThing(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        IServletFactory isf;
        try {
            isf = (IServletFactory) Class.forName(
                    this.getServletConfig().getInitParameter("action_factory"))
                    .newInstance();
            isf.doThing(request, response, this, method);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doThing(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doThing(request, response);
    }

}
