<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>用户主页</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}', {
                            time: 1500
                        })
                    </script>
                    <c:remove var="info" />
                </c:if>

                <c:if test="${not empty identity}">
                    <script>
                        $(document).ready(function () {
                            var emailNumber = ${emailSize};
                            // 检测有没有新的消息
                            myrefreshEmail();
                            function myrefreshEmail()
                            {
                                $.get("${pageContext.request.contextPath}/EmailAction.do?method=getEmailNumber&size=" + emailNumber).done(function (data) {
                                    data = JSON.parse(data);
                                    if (emailNumber != data.size) {
                                        emailNumber = data.size;
                                        if (emailNumber != 0) {
                                            layer.tips("有人跟你说:" + data.email.body, '#emailSizeSpan', {
                                                tips: [3, '#78BA32'],
                                                time: 5000,
                                                tipsMore: true
                                            });
                                        }
                                    }
                                    if (emailNumber == 0) {
                                        $("#emailSizeSpan").html("通知");
                                    } else {
                                        $("#emailSizeSpan").html("通知<span class='layui-badge'>" + emailNumber + "</span>");
                                    }
                                });
                            }
                            setInterval(myrefreshEmail, 1000);
                        });
                    </script>
                </c:if>
        </head>
        <body style="margin-top: 65px;">
                <div class="fly-header layui-bg-black">
                        <div class="layui-container">
                                <a class="fly-logo" href="${pageContext.request.contextPath}/NewsAction.do?method=queryAll">
                                        <img src="${pageContext.request.contextPath}/img/logo4.png" style="height: 38px;padding-left:-10px;" alt="logo">
                                </a>
                                <c:if test="${not empty sessionScope.identity}">
                                    <ul class="layui-nav fly-nav layui-hide-xs">
                                            <li class="layui-nav-item layui-this">
                                                    <a href="${pageContext.request.contextPath}/EmailAction.do?method=getEmail">
                                                            <i class="iconfont icon-jiaoliu"></i>
                                                            <span id="emailSizeSpan">通知</span>
                                                    </a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/UserAction.do?method=index">
                                                            <i class="layui-icon">&#xe705;</i>我发布的
                                                    </a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/NewsAction.do?method=readyPost" target="_blank"><i class="layui-icon">&#xe609;</i>写新闻</a>
                                            </li>
                                    </ul>
                                </c:if>

                                <ul class="layui-nav fly-nav-user">

                                        <c:if test="${empty sessionScope.identity}">
                                            <!-- 未登入的状态 -->

                                            <li class="layui-nav-item">
                                                    <a class="iconfont icon-touxiang layui-hide-xs" href="${pageContext.request.contextPath}/user/login.jsp"></a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/user/login.jsp">登入</a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/user/reg.jsp">注册</a>
                                            </li>
                                            <li class="layui-nav-item layui-hide-xs">
                                                    <a href="/app/qq/" onclick="layer.msg('正在通过QQ登入', {icon: 16, shade: 0.1, time: 0})" title="QQ登入" class="iconfont icon-qq"></a>
                                            </li>
                                            <li class="layui-nav-item layui-hide-xs">
                                                    <a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon: 16, shade: 0.1, time: 0})" title="微博登入" class="iconfont icon-weibo"></a>
                                            </li>
                                        </c:if>
                                        <c:if test="${not empty sessionScope.identity}">
                                            <!-- 登入后的状态 -->

                                            <li class="layui-nav-item">
                                                    <a class="fly-nav-avatar" href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${identity.userId}">
                                                            <cite class="layui-hide-xs">${identity.name}</cite>
                                                            <i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：layui 作者"></i>
                                                            <c:if test="${sessionScope.identity.lvl >= 1}">
                                                                <i class="layui-badge fly-badge-vip">VIP${sessionScope.identity.lvl}</i>
                                                            </c:if>
                                                            <c:if test="${sessionScope.identity.lvl == -99}">
                                                                <span style="color:#c00;">（管理员）</span>
                                                            </c:if>
                                                            <c:if test="${empty sessionScope.identity.image}">
                                                                <img id="touxiang" src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg">
                                                            </c:if>
                                                            <c:if test="${not empty sessionScope.identity.image}">
                                                                <img id="touxiang" src="${pageContext.request.contextPath}/${sessionScope.identity.image}">
                                                            </c:if>

                                                    </a>
                                                    <dl class="layui-nav-child">
                                                            <dd><a href="${pageContext.request.contextPath}/user/set.jsp"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
                                                            <dd><a href="${pageContext.request.contextPath}/EmailAction.do?method=getEmail"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
                                                            <dd><a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${identity.userId}"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
                                                            <hr style="margin: 5px 0;">
                                                            <dd><a href="${pageContext.request.contextPath}/UserAction.do?method=logout" style="text-align: center;">退出</a></dd>
                                                    </dl>
                                            </li>
                                        </c:if>
                                </ul>
                        </div>
                </div>
        </body>
</html>