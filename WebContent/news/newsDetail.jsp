<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>新闻详情</title>
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
                    function dz(id) {
                        htmlobj = $.ajax({url: "${pageContext.request.contextPath}/NewsAction.do?method=dz"
                                    + "&newsId=" + id,
                            async: false,
                            success: function (data) {
                                location.href = location.href;
                            }
                        });
                    }
                    function add(id, val) {
                        htmlobj = $.ajax({url: "${pageContext.request.contextPath}/NewsAction.do?method=add"
                                    + "&newsId=" + id + "&par=buff&parVal=" + val,
                            async: false,
                            success: function (data) {
                                location.href = location.href;
                            }
                        });
                    }
                    function del(id, val) {
                        htmlobj = $.ajax({url: "${pageContext.request.contextPath}/NewsAction.do?method=del"
                                    + "&newsId=" + id + "&par=buff&parVal=" + val,
                            async: false,
                            success: function (data) {
                                location.href = location.href;
                            }
                        });
                    }
                </script>
        </head>
        <body>

                <c:import url="/user/top.jsp" />
                <c:import url="/other/botton.jsp" />
                <div class="layui-container">
                        <div class="layui-row layui-col-space15">
                                <div class="layui-col-md8 content detail">
                                        <div class="fly-panel detail-box">
                                                <h1>${news.title}</h1>
                                                <div class="fly-detail-info">
                                                        <div class="fly-admin-box" data-id="123">
                                                                <c:if test="${not empty news.buff}">
                                                                    <c:set value="${ fn:split(news.buff, ',') }" var="names" />
                                                                    <c:remove var="jiajing" />
                                                                    <c:remove var="guanfang" />
                                                                    <c:remove var="bidu" />
                                                                    <c:remove var="zhiding" />
                                                                    <c:forEach items="${names}" var="name">
                                                                        <c:if test="${name == '精'}">
                                                                            <c:set value="${true}" var="jiajing" />
                                                                            <span class="layui-badge layui-bg-red">${name}</span>
                                                                        </c:if>
                                                                        <c:if test="${name == '官方'}">
                                                                            <c:set value="${true}" var="guanfang" />
                                                                            <span class="layui-badge" style="background-color: #999;">官方</span>
                                                                        </c:if>
                                                                        <c:if test="${name == '必读'}">
                                                                            <c:set value="${true}" var="bidu" />
                                                                            <span class="layui-badge layui-bg-green fly-detail-column">必读</span>
                                                                        </c:if>
                                                                        <c:if test="${name == '置顶'}">
                                                                            <c:set value="${true}" var="zhiding" />
                                                                            <span class="layui-badge layui-bg-black">${name}</span>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </c:if>
                                                                <c:if test="${news.status == '待审核'}">
                                                                    <span class="layui-badge" title="请耐心等待管理员审核">${news.status}</span>
                                                                </c:if>
                                                                <c:if test="${news.status == '未通过'}">
                                                                    <span class="layui-badge layui-bg-red" title="请前往[我的消息]查看未通过原因">${news.status}</span>
                                                                </c:if>
                                                                <c:if test="${identity.userId == news.userId || identity.lvl == -99}">
                                                                    <a class="mine-edit" href="${pageContext.request.contextPath}/NewsAction.do?method=readyUpdate&newsId=${news.newsId}"><span class="layui-btn layui-btn-xs jie-admin" type="del">编辑</span></a>
                                                                    <a class="mine-edit layui-bg-red" href="${pageContext.request.contextPath}/NewsAction.do?method=remove&newsId=${news.newsId}"><span class="layui-btn layui-btn-xs jie-admin" type="del">删除</span></a>

                                                                </c:if>
                                                                <c:if test="${identity.lvl == -99}">
                                                                    <c:if test="${empty zhiding}">
                                                                        <a href="javascript:void(0);" onclick="add(${news.newsId}, '置顶')">
                                                                                <span class="layui-btn layui-btn-xs jie-admin" type="set" field="stick" rank="1">
                                                                                        置顶
                                                                                </span>
                                                                        </a>
                                                                    </c:if>
                                                                    <c:if test="${zhiding}">
                                                                        <a  href="javascript:void(0);" onclick="del(${news.newsId}, '置顶')">
                                                                                <span class="layui-btn layui-btn-xs jie-admin" type="set" field="stick" rank="0" style="background-color:#ccc;">
                                                                                        取消置顶
                                                                                </span>
                                                                        </a>
                                                                    </c:if>
                                                                    <c:if test="${empty jiajing}">
                                                                        <a  href="javascript:void(0);" onclick="add(${news.newsId}, '精')">
                                                                                <span class="layui-btn layui-btn-xs jie-admin" type="set" field="stick" rank="1">
                                                                                        加精
                                                                                </span>
                                                                        </a>
                                                                    </c:if>
                                                                    <c:if test="${jiajing}">
                                                                        <a  href="javascript:void(0);" onclick="del(${news.newsId}, '精')">
                                                                                <span class="layui-btn layui-btn-xs jie-admin" type="set" field="stick" rank="0" style="background-color:#ccc;">
                                                                                        取消加精
                                                                                </span>
                                                                        </a>
                                                                    </c:if>
                                                                </c:if>
                                                        </div>
                                                        <span class="fly-list-nums"> 
                                                                <a href="#comment"><i class="iconfont" title="评论">&#xe60c;</i>${fn:length(commentList)}</a>
                                                                <a href="javascript:void(0);" onclick="dz(${news.newsId})"><i class="layui-icon" title="人气">&#xe6c6;</i> ${news.good}</a>
                                                        </span>
                                                </div>
                                                <div class="detail-about">
                                                        <a class="fly-avatar" href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${user.userId}">
                                                                <c:if test="${empty user.image}">
                                                                    <img src="${pageContext.request.contextPath}/img/logo.png" alt="${user.name}">
                                                                </c:if>
                                                                <c:if test="${not empty user.image}">
                                                                    <img src="${pageContext.request.contextPath}/${user.image}" alt="${user.name}">
                                                                </c:if>
                                                        </a>
                                                        <div class="fly-detail-user">
                                                                <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${user.userId}" class="fly-link">
                                                                        <cite>${user.name}</cite>
                                                                        <c:if test="${sessionScope.user.lvl >= 1}">
                                                                            <i class="layui-badge fly-badge-vip">VIP${sessionScope.user.lvl}</i>
                                                                        </c:if>
                                                                        <c:if test="${sessionScope.user.lvl == -99}">
                                                                            <span style="color:#c00;">（管理员）</span>
                                                                        </c:if>
                                                                </a>
                                                                <span>${news.time}</span>
                                                        </div>
                                                        <div class="detail-hits" id="LAY_jieAdmin" data-id="123">
                                                                <span style="padding-right: 10px; color: #FF7200">悬赏：${news.money}阳光值</span>  
                                                                <span class="layui-btn layui-btn-xs jie-admin" type="edit"><a href="#comment">评论此新闻</a></span>
                                                        </div>
                                                </div>
                                                <div class="detail-body photos">
                                                        ${news.body}
                                                </div>
                                        </div>

                                        <div class="fly-panel detail-box" id="flyReply">
                                                <fieldset class="layui-elem-field layui-field-title" style="text-align: center;">
                                                        <legend>评论</legend>
                                                </fieldset>

                                                <ul class="jieda" id="jieda">
                                                        <c:if test="${not empty commentList}">
                                                            <c:forEach items="${commentList}" var="comment">
                                                                <li data-id="111" class="jieda-daan">
                                                                        <a name="item-1111111111"></a>
                                                                        <div class="detail-about detail-about-reply">
                                                                                <a class="fly-avatar" href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${comment.userId}">
                                                                                        <c:if test="${empty allUsers[comment.userId].image}">
                                                                                            <img src="${pageContext.request.contextPath}/img/logo.png" alt="${allUsers[comment.userId].name}">
                                                                                        </c:if>
                                                                                        <c:if test="${not empty allUsers[comment.userId].image}">
                                                                                            <img src="${pageContext.request.contextPath}/${allUsers[comment.userId].image}" alt="${allUsers[comment.userId].name}">
                                                                                        </c:if>
                                                                                </a>
                                                                                <div class="fly-detail-user">
                                                                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${comment.userId}" class="fly-link">
                                                                                                <cite>${allUsers[comment.userId].name}</cite> 
                                                                                                <c:if test="${allUsers[comment.userId].lvl >= 1}">
                                                                                                    <i class="layui-badge fly-badge-vip">VIP${allUsers[comment.userId].lvl}</i>
                                                                                                </c:if>
                                                                                                <c:if test="${allUsers[comment.userId].lvl == -99}">
                                                                                                    <span style="color:#c00;">（管理员）</span>
                                                                                                </c:if>    
                                                                                        </a>
                                                                                </div>

                                                                                <div class="detail-hits">
                                                                                        <span>${comment.time}</span>
                                                                                </div>

                                                                                <!--<i class="iconfont icon-caina" title="最佳评论"></i>-->
                                                                        </div>
                                                                        <div class="detail-body jieda-body photos">
                                                                                ${comment.body}
                                                                        </div>
                                                                        <div class="jieda-reply">
                                                                                <span class="jieda-zan zanok" type="zan">
                                                                                </span>
                                                                        </div>
                                                                </li>
                                                            </c:forEach>
                                                        </c:if>
                                                        <c:if test="${empty commentList}">
                                                            <!-- 无数据时 -->
                                                            <li class="fly-none">消灭零回复</li> 
                                                            </c:if>
                                                </ul>

                                                <div class="layui-form layui-form-pane">
                                                        <form action="NewsAction.do?method=pushComment&newsId=${news.newsId}" method="post">
                                                                <div class="layui-form-item layui-form-text">
                                                                        <a name="comment"></a>
                                                                        <div class="layui-input-block">
                                                                                <textarea id="L_content" name="content" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <button class="layui-btn" lay-submit>提交回复</button>
                                                                </div>
                                                        </form>
                                                </div>
                                        </div>
                                </div>
                                <div class="layui-col-md4">
                                        <dl class="fly-panel fly-list-one">
                                                <dt class="fly-panel-title">热搜榜</dt>
                                                <c:if test="${not empty rsList}">
                                                    <c:forEach items="${rsList}" var="n">
                                                        <dd>
                                                                <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryOfId&newsId=${n.newsId}">${n.title}</a>
                                                                <span><i class="layui-icon">&#xe615;</i>${n.search}</span>
                                                        </dd>
                                                    </c:forEach>
                                                </c:if>
                                                <c:if test="${ empty rsList}">
                                                    <div class="fly-none">没有相关数据</div>
                                                </c:if>
                                        </dl>

                                        <div class="fly-panel" >
                                                <div class="fly-panel-main">
                                                        <a href="http://layim.layui.com/?from=fly" target="_blank" class="fly-zanzhu" time-limit="2017.09.25-2099.01.01" style="background-color: #5FB878;">SunnyNews 向阳小队旗舰之作</a>
                                                </div>
                                                <div class="fly-panel" style="padding: 20px 0; text-align: center;">
                                                        <img src="http://img.blog.csdn.net/20170410111808727?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbGluZ2xpYW4wNTIy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" style="max-width: 100%;" alt="layui">
                                                        <p style="position: relative; color: #666;">微信扫码关注 向阳小队 公众号</p>
                                                </div>
                                        </div>
                                </div>
                        </div>
                </div>

                <div class="fly-footer">
                        <p><a href="http://fly.layui.com/" target="_blank">SunnyNews</a> 2018 &copy; <a href="http://www.layui.com/" target="_blank">向阳出品</a></p>
                        <p>
                                <a href="http://fly.layui.com/jie/2461/" target="_blank">微信公众号</a>
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