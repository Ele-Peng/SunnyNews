<%-- 
    Document   : index
    Created on : 2018-1-17, 9:17:58
    Author     : lol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>后台管理</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>  

                <c:if test="${empty identity && identity.lvl != -99 && false}">
                    <c:redirect url="/user/login.jsp" />
                </c:if>
        </head>
        <body>
                <div style="float:left; width: 200px; margin-left: 100px;">
                        <ul class="layui-nav layui-nav-tree" lay-filter="test">
                                <!-- 侧边导航: <ul class="layui-nav layui-nav-tree layui-nav-side"> -->
                                <li class="layui-nav-item">
                                        <a href="javascript:;">新闻管理</a>
                                        <dl class="layui-nav-child">
                                                <dd><a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAll">待审核列表</a></dd>
                                                <dd><a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAll&status=通过">已审核列表</a></dd>
                                                <dd><a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAll&status=未通过">不通过列表</a></dd>
                                                <dd><a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAll&status=已删除">已删除列表</a></dd>
                                        </dl>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAllComment">评论管理</a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAllEmail">消息管理</a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAllUser">用户管理</a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAllNewsType">新闻类别管理</a>
                                </li>
                        </ul>
                </div>
        </body>
</html>
