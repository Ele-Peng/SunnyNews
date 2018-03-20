<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>我的消息</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
        </head>
        <body>

                <c:import url="/user/top.jsp" />

                <div class="layui-container fly-marginTop fly-user-main">
                        <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${identity.userId}">
                                                <i class="layui-icon">&#xe609;</i>
                                                我的主页
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=index">
                                                <i class="layui-icon">&#xe612;</i>
                                                用户中心
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/user/set.jsp">
                                                <i class="layui-icon">&#xe620;</i>
                                                基本设置
                                        </a>
                                </li>
                                <li class="layui-nav-item layui-this">
                                        <a href="${pageContext.request.contextPath}/EmailAction.do?method=getEmail">
                                                <i class="layui-icon">&#xe611;</i>
                                                我的消息
                                        </a>
                                </li>
                        </ul>

                        <div class="site-tree-mobile layui-hide">
                                <i class="layui-icon">&#xe602;</i>
                        </div>  
                        <div class="site-mobile-shade"></div>

                        <div class="site-tree-mobile layui-hide">
                                <i class="layui-icon">&#xe602;</i>
                        </div>
                        <div class="site-mobile-shade"></div>

                        <div style="width:955px;height:600px;padding-left:215px;">
                                <div class="fly-panel fly-panel-user" pad20>
                                        <div class="layui-tab layui-tab-brief" lay-filter="user" id="LAY_msg" style="margin-top: 15px;">
                                                <c:if test="${not empty emailList}"><a href="${pageContext.request.contextPath}/EmailAction.do?method=lookAll">
                                                            <button class="layui-btn layui-btn-danger" id="LAY_delallmsg">清空全部消息</button></a>
                                                    </c:if>
                                                <div  id="LAY_minemsg" style="margin-top: 10px;">
                                                        <c:if test="${empty emailList}">
                                                            <div class="fly-none">您暂时没有最新消息</div>
                                                        </c:if>
                                                        <c:if test="${not empty emailList}">
                                                            <ul class="mine-msg">
                                                                    <c:forEach items="${emailList}" var="e">
                                                                        <li data-id="123">
                                                                                <blockquote class="layui-elem-quote">
                                                                                        <c:if test="${not empty e.fromUserId}">
                                                                                            <c:if test="${not empty e.newsId}">
                                                                                                <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${e.fromUserId}" target="_blank">
                                                                                                        <cite>${allUsers[e.fromUserId].name}</cite>
                                                                                                </a>
                                                                                                评论了您的新闻
                                                                                                <a target="_blank" href="${pageContext.request.contextPath}/NewsAction.do?method=queryOfId&newsId=${e.newsId}"><cite>${allNews[e.newsId].title}</cite>
                                                                                                </a>
                                                                                            </c:if>
                                                                                            <c:if test="${empty e.newsId}">
                                                                                                <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${e.fromUserId}" target="_blank">
                                                                                                        <cite>${allUsers[e.fromUserId].name}</cite>
                                                                                                </a>
                                                                                                对你说: ${e.body}
                                                                                            </c:if>
                                                                                        </c:if>
                                                                                        <c:if test="${empty e.fromUserId}">
                                                                                            系统信息: ${e.body}
                                                                                        </c:if>
                                                                                </blockquote>
                                                                                <p><span>${e.time}</span><a href="${pageContext.request.contextPath}/EmailAction.do?method=look&emailId=${e.emailId}" class="layui-btn layui-btn-small layui-btn-danger fly-delete">删除</a></p>
                                                                        </li>
                                                                    </c:forEach>
                                                            </ul>
                                                        </c:if>
                                                </div>
                                                <c:if test="${not empty emailList}">
                                                    <div id="pageDiv" align="center"></div>
                                                </c:if>
                                        </div>
                                </div>
                        </div>
                </div>


                <div class="fly-footer">
                        <p><a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy; <a href="https://github.com/xyxd0522" target="_blank">向阳出品</a></p>
                        <p>
                                <a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
                        </p>
                </div>

                <script src="${pageContext.request.contextPath}/comm/layui/layui.js"></script>
                <script>
                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${emailSize}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'skip']
                            , limit: 3
                            , curr: ${emailPage}
                            , jump: function (obj) {
                                if (obj.curr != ${emailPage}) {
                                    location.href = "${pageContext.request.contextPath}/EmailAction.do?method=getEmail&page=" + obj.curr;
                                }
                            }
                        });
                    });
                    //注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;

                        //…
                    });
                </script>
        </body>
</html>