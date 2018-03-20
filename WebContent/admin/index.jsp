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

                <c:if test="${empty identity || identity.lvl != '-99'}">
                    <c:redirect url="/user/login.jsp" />
                </c:if>
                <script>
                    function getNews(method, id) {
                        htmlobj = $.ajax({url: "${pageContext.request.contextPath}/NewsAction.do?method=" + method
                                    + "&newsId=" + id,
                            async: false,
                            success: function (data) {
                                location.href = location.href;
                            }
                        });
                    }
                    function getAdmin(method, id) {
                        if (method == 'notReviewNews') {
                            layer.prompt({
                                maxlength: 25,
                                value: '',
                                title: '请输入不通过理由',
                            }, function (val, index) {
                                htmlobj = $.ajax({url: "${pageContext.request.contextPath}/AdminAction.do?method=" + method
                                            + "&newsId=" + id + "&body=" + val,
                                    async: false,
                                    success: function (data) {
                                        location.href = location.href;
                                    }
                                });
                                ayer.close(index);
                            });
                        } else {
                            htmlobj = $.ajax({url: "${pageContext.request.contextPath}/AdminAction.do?method=" + method
                                        + "&newsId=" + id,
                                async: false,
                                success: function (data) {
                                    location.href = location.href;
                                }
                            });
                        }
                    }
                </script>
        </head>
        <body>
                <c:import url="/user/top.jsp" />
                <div style="margin-top: 0px; width: 2000px;">
                        <c:import url="${pageContext.request.contextPath}/admin/left.jsp" />
                        <div style="float:left; margin-left: 3px; margin-top: -10px; width: 1000px;">
                                <c:if test="${not empty adminNewsList}">
                                    <table class="layui-table">
                                            <colgroup>
                                                    <col>
                                                    <col width="100">
                                                    <col width="200">
                                                    <col width="300">
                                            </colgroup>
                                            <thead>
                                                    <tr>
                                                            <th>标题</th>
                                                            <th>发布人</th>
                                                            <th>发布时间</th>
                                                            <th>操作</th>
                                                    </tr> 
                                            </thead>
                                            <tbody>
                                                    <c:forEach items="${adminNewsList}" var="n">
                                                        <tr>
                                                                <td><a href="${pageContext.request.contextPath}/NewsAction.do?method=queryOfId&newsId=${n.newsId}">${n.title}</a></td>
                                                                <td><a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.userId}">${allUsers[n.userId].name}</a></td>
                                                                <td>${n.time}</td>
                                                                <td>
                                                                        <c:if test="${n.status != '通过'}">
                                                                            <a class="layui-btn layui-btn-xs layui-bg-green" href="javascript:;" onclick="getAdmin('reviewNews', '${n.newsId}')">通过</a>
                                                                        </c:if>
                                                                        <c:if test="${n.status != '未通过'}">
                                                                            <a class="layui-btn layui-btn-xs layui-bg-red" href="javascript:;" onclick="getAdmin('notReviewNews', '${n.newsId}')">不通过</a>
                                                                        </c:if>
                                                                        <c:if test="${n.status != '已删除'}">
                                                                            <a class="layui-btn layui-btn-xs layui-bg-orange" href="javascript:;" onclick="getNews('remove', '${n.newsId}')">删除</a>
                                                                        </c:if>
                                                                        <c:if test="${n.status == '已删除'}">
                                                                            <a class="layui-btn layui-btn-xs layui-bg-orange" href="javascript:;" onclick="getAdmin('adminRemove', '${n.newsId}')">彻底删除</a>
                                                                        </c:if>
                                                                </td>
                                                        </tr>
                                                    </c:forEach>
                                            </tbody>
                                    </table>
                                </c:if>
                                <c:if test="${empty adminNewsList}">
                                    <div class="fly-none">
                                            没有相关数据
                                    </div> 
                                </c:if>
                                <!-- 分頁 -->
                                <c:if test="${not empty adminNewsList}">
                                    <div id="pageDiv" align="center"></div>
                                </c:if>
                        </div>
                </div>
                <script>
//注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;
                        //…
                    });
                        <c:if test="${not empty adminNewsList}">
                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${adminNewsSize}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'skip']
                            , limit: ${adminNewsLimit}
                            , curr: ${adminNewsPage}
                            , jump: function (obj) {
                                if (obj.curr != ${adminNewsPage}) {
                                    location.href = "${pageContext.request.contextPath}/AdminAction.do?method=queryAll&page=" + obj.curr + "&status=${adminNewsStatus}&limit=" + obj.limit;
                                }
                            }
                        });
                    });
                        </c:if>
                </script>
        </body>
</html>
