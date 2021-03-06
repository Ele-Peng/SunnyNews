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
                <script>
                    function getAdmin(method, id) {
                        if (method == 'adminRemoveEmail') {
                            layer.prompt({
                                maxlength: 25,
                                value: '',
                                title: '请输入理由',
                            }, function (val, index) {
                                htmlobj = $.ajax({url: "${pageContext.request.contextPath}/AdminAction.do?method=" + method
                                            + "&emailId=" + id + "&body=" + val,
                                    async: false,
                                    success: function (data) {
                                        location.href = location.href;
                                    }
                                });
                                ayer.close(index);
                            });
                        } else {
                            htmlobj = $.ajax({url: "${pageContext.request.contextPath}/AdminAction.do?method=" + method
                                        + "&emailId=" + id,
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
                                <c:if test="${not empty adminCommentList}">
                                    <table class="layui-table">
                                            <colgroup>
                                                    <col>
                                                    <col width="100">
                                                    <col width="100">
                                                    <col width="200">
                                                    <col width="70">
                                                    <col width="100">
                                            </colgroup>
                                            <thead>
                                                    <tr>
                                                            <th>内容</th>
                                                            <th>发布人</th>
                                                            <th>接收人</th>
                                                            <th>发布时间</th>
                                                            <th>状态</th>
                                                            <th>操作</th>
                                                    </tr> 
                                            </thead>
                                            <tbody>
                                                    <c:forEach items="${adminCommentList}" var="n">
                                                        <tr>
                                                                <td>${n.body}</td>
                                                                <td>
                                                                        <c:if test="${empty n.fromUserId}">
                                                                            系统
                                                                        </c:if>
                                                                        <c:if test="${not empty n.fromUserId}">
                                                                            <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.fromUserId}">${allUsers[n.fromUserId].name}</a>
                                                                        </c:if>
                                                                </td>
                                                                <td><a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.toUserId}">${allUsers[n.toUserId].name}</a></td>
                                                                <td>${n.time}</td>
                                                                <td>
                                                                        <c:if test="${n.status == '1'}">
                                                                            <span class="layui-bg-green">已读</span>
                                                                        </c:if>
                                                                        <c:if test="${n.status != '1'}">
                                                                            <span class="layui-bg-red">未读</span>
                                                                        </c:if>
                                                                </td>
                                                                <td>
                                                                        <a class="layui-btn layui-btn-xs layui-bg-orange" href="javascript:;" onclick="getAdmin('adminRemoveEmail', '${n.emailId}')">删除</a>
                                                                </td>
                                                        </tr>
                                                    </c:forEach>
                                            </tbody>
                                    </table>
                                </c:if>
                                <c:if test="${empty adminCommentList}">
                                    <div class="fly-none">
                                            没有相关数据
                                    </div> 
                                </c:if>
                                <!-- 分頁 -->
                                <c:if test="${not empty adminCommentList}">
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
                        <c:if test="${not empty adminCommentList}">
                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${adminCommentSize}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'skip']
                            , limit: ${adminCommentLimit}
                            , curr: ${adminCommentPage}
                            , jump: function (obj) {
                                if (obj.curr != ${adminCommentPage}) {
                                    location.href = "${pageContext.request.contextPath}/AdminAction.do?method=queryAllEmail&page=" + obj.curr + "&limit=" + obj.limit;
                                }
                            }
                        });
                    });
                        </c:if>
                </script>
        </body>
</html>
