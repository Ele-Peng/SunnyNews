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
                <script>
                    function message22() {
                        layer.prompt({
                            maxlength: 25,
                            value: '',
                            title: '你想发送什么信息',
                        }, function (val, index) {
                            location.href = '${pageContext.request.contextPath}/UserAction.do?method=sendMessage&userId=${user.userId}&body=' + val;
                            ayer.close(index);
                        });
                    }
                </script>
        </head>
        <body style="margin-top: 65px;">
                <c:import url="/user/top.jsp" />
                <div class="fly-home fly-panel" style="background-image: url();">
                        <c:if test="${empty sessionScope.user.image}">
                            <img id="touxiang" src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg">
                        </c:if>
                        <c:if test="${not empty sessionScope.user.image}">
                            <img id="touxiang" src="${pageContext.request.contextPath}/${sessionScope.user.image}">
                        </c:if>
                        <!--<i class="iconfont icon-renzheng" title="SunnyNews认证"></i>-->
                        <h1>
                                ${sessionScope.user.name}
                                <c:if test="${sessionScope.user.sex == '男'}">
                                    <i class="iconfont icon-nan"></i>
                                </c:if>
                                <c:if test="${sessionScope.user.sex == '女'}">
                                    <i class="iconfont icon-nv"></i>
                                </c:if>
                                <c:if test="${sessionScope.user.lvl >= 1}">
                                    <i class="layui-badge fly-badge-vip">VIP${sessionScope.user.lvl}</i>
                                </c:if>
                                <c:if test="${sessionScope.user.lvl == -99}">
                                    <span style="color:#c00;">（管理员）</span>
                                </c:if>
                                <!--
                                <span style="color:#5FB878;">（社区之光）</span>
                                <span>（该号已被封）</span>
                                -->
                        </h1>
                        <!--
                            <p style="padding: 10px 0; color: #5FB878;">${sessionScope.user.signature}</p>
                        -->
                        <p class="fly-home-info">
                                <i class="iconfont" title="阳光值"><i class="layui-icon">&#xe65e;</i></i><span style="color: #FF7200;">${sessionScope.user.money}</span>
                                <i class="iconfont icon-shijian"></i><span>${sessionScope.user.registerDate} 加入</span>
                                <i class="iconfont icon-chengshi"></i><span>来自${sessionScope.user.path}</span>
                        </p>

                        <p class="fly-home-sign">${sessionScope.user.signature}</p>

                        <c:if test="${sessionScope.identity.userId != sessionScope.user.userId}">
                            <div class="fly-sns" data-user="">
                                    <a href="${pageContext.request.contextPath}/UserAction.do?method=insertFriend&userId=${sessionScope.user.userId}" class="layui-btn layui-btn-primary fly-imActive" data-type="addFriend">加为好友</a>

                                    <a href="javascript:;" onclick="message22()" class="layui-btn layui-btn-normal fly-imActive" data-type="chat">发送信息</a>
                            </div>
                        </c:if>

                </div>

                <div class="layui-container">
                        <div class="layui-row layui-col-space15">
                                <div class="layui-col-md6 fly-home-jie">
                                        <div class="fly-panel">
                                                <h3 class="fly-panel-title">${user.name} 最近的新闻</h3>
                                                <ul class="jie-row">
                                                        <c:if test="${not empty newsList}">
                                                            <c:forEach items="${newsList}" var="n">
                                                                <li>
                                                                        <c:if test="${not empty n.buff}">
                                                                            <span class="fly-jing" title="精品新闻">${n.buff}</span>
                                                                        </c:if>
                                                                        <c:if test="${n.status == '待审核'}">
                                                                            <span class="fly-grey" title="请耐心等待管理员审核">${n.status}</span>
                                                                        </c:if>
                                                                        <c:if test="${n.status == '通过'}">
                                                                            <span class="fly-grey layui-bg-green" title="审核成功">${n.status}</span>
                                                                        </c:if>
                                                                        <c:if test="${n.status == '未通过'}">
                                                                            <span class="fly-grey layui-bg-red" title="请前往[我的消息]查看未通过原因">${n.status}</span>
                                                                        </c:if>
                                                                        <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryOfId&newsId=${n.newsId}" class="jie-title">${n.title}</a>
                                                                        <i>${n.time}</i>
                                                                        <em class="layui-hide-xs">
                                                                                ${n.good}<i class="layui-icon" style="font-size: 24px; color: green;">&#xe6c6;</i>
                                                                                /
                                                                                ${n.bad}<i class="layui-icon" style="font-size: 24px; color: red;">&#xe6c5;</i>
                                                                        </em>
                                                                </li>
                                                            </c:forEach>
                                                        </c:if>
                                                        <c:if test="${ empty newsList}">
                                                            <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有发表任何求解</i></div>
                                                        </c:if>
                                                </ul>
                                        </div>
                                </div>

                                <div class="layui-col-md6 fly-home-da">
                                        <div class="fly-panel">
                                                <h3 class="fly-panel-title">${user.name} 最近的讨论</h3>
                                                <ul class="home-jieda">
                                                        <c:if test="${not empty commentList}">
                                                            <c:forEach items="${commentList}" var="comment" varStatus="status">
                                                                <li>
                                                                        <p>
                                                                                <span>${comment.time}</span>
                                                                                <a href="${pageContext.request.contextPath}/news/newsDetail.jsp" target="_blank">${comNewsList[comment.newsId].title}</a>中回答：
                                                                        </p>
                                                                        <div class="home-dacontent detail-body jieda-body photos">
                                                                                ${allUsers[comment.userId].name}: ${comment.body}
                                                                                <c:if test="${not empty comment.ccommentId}">
                                                                                    <pre>${allUsers[allComments[comment.ccommentId].userId].name}: ${allComments[comment.ccommentId].body}</pre>
                                                                                </c:if>
                                                                        </div>
                                                                </li>
                                                            </c:forEach>
                                                        </c:if>
                                                        <c:if test="${empty commentList}">
                                                            <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><span>没有回答任何问题</span></div>
                                                        </c:if>
                                                </ul>
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
                                        layui.cache.page = '';
                                        layui.cache.user = {
                                            username: '游客'
                                            , uid: -1
                                            , avatar: '${pageContext.request.contextPath}/img/logo.jpg'
                                            , experience: 83
                                            , sex: '男'
                                        };
                                        layui.config({
                                            version: "3.0.0"
                                            , base: '${pageContext.request.contextPath}/comm/mods/'
                                        }).extend({
                                            fly: 'index'
                                        }).use(['fly', 'face'], function () {
                                            var $ = layui.$
                                                    , fly = layui.fly;
                                            //如果你是采用模版自带的编辑器，你需要开启以下语句来解析。

                                            $('.detail-body').each(function () {
                                                var othis = $(this), html = othis.html();
                                                othis.html(fly.content(html));
                                            });

                                        });
                </script>

        </body>
</html>