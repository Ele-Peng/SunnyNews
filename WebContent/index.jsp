<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>SunnyNews</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>  
                <script src="${pageContext.request.contextPath}/comm/echarts.js" type="text/javascript"></script>
                <c:if test="${empty newsList && info != '当前没有这些新闻'}">
                    <c:redirect url="/NewsAction.do?method=queryAll" />
                </c:if>
                <script>
                    function qd() {
                        htmlobj = $.ajax({url: "${pageContext.request.contextPath}/UserAction.do?method=qd",
                            async: false,
                            success: function (data) {
                                location.href = location.href;
                            }
                        });
                    }
                    $(document).ready(function () {
                        var myChart = echarts.init(document.getElementById('main'));
                        // 显示标题，图例和空的坐标轴
                        myChart.setOption({
                            title: {
                                text: '统计'
                            },
                            tooltip: {},
                            legend: {
                                data: ['发布数', '点赞数(百)']
                            },
                            xAxis: {
                                data: []
                            },
                            yAxis: {},
                            series: [{
                                    name: "发布数",
                                    type: 'bar',
                                    data: []
                                },
                                {
                                    name: "点赞数(百)",
                                    type: 'bar',
                                    data: []
                                }]
                        });
                        myChart.showLoading();
                        myrefresh();
                        myChart.hideLoading();
                        function myrefresh()
                        {
                            $.get("${pageContext.request.contextPath}/NewsAction.do?method=getNewsTypeExChart").done(function (data) {
                                data = JSON.parse(data);
                                myChart.setOption({
                                    xAxis: {
                                        data: data.categories
                                    },
                                    series: [
                                        {
                                            type: 'bar',
                                            name: '发布数',
                                            data: data.data
                                        },
                                        {
                                            type: 'bar',
                                            name: '点赞数(百)',
                                            data: data.data2
                                        },
                                    ]
                                });
                            });
                        }
                        setInterval(myrefresh, 1000);
                    });
                </script>
        </head>
        <body>
                <c:import url="/user/top.jsp" />
                <c:import url="/other/botton.jsp" /> 
                <div style="width:1170px;padding-left:250px;">
                        <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
                                <ul class="layui-tab-title"><li><a href="${pageContext.request.contextPath}/NewsAction.do?method=queryAll">全部</a></li>
                                                <c:if test="${not empty newstypeList}">
                                                    <c:forEach items="${newstypeList}" var="t">
                                                    <li><a href="${pageContext.request.contextPath}/NewsAction.do?method=queryAll&newsTypeId=${t.newsTypeId}">${t.name}</a></li>
                                                    </c:forEach>
                                                </c:if>
                                </ul>
                                <div class="layui-tab-content"></div>
                        </div>
                        <div class="layui-container">
                                <div class="layui-row layui-col-space15">
                                        <div class="layui-col-md8">
                                                <c:if test="${not empty zdNewsList}">
                                                    <div class="fly-panel">
                                                            <div class="fly-panel-title fly-filter">
                                                                    <a>置顶新闻</a>
                                                                    <a href="#signin" class="layui-hide-sm layui-show-xs-block fly-right" id="LAY_goSignin" style="color: #FF5722;">去签到</a>
                                                            </div>
                                                            <ul class="fly-list">
                                                                    <c:if test="${not empty zdNewsList}">
                                                                        <c:forEach items="${zdNewsList}" var="n">
                                                                            <li>
                                                                                    <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.userId}" class="fly-avatar">
                                                                                            <c:if test="${empty allUsers[n.userId].image}">
                                                                                                <img src="${pageContext.request.contextPath}/img/logo.png" alt="${allUsers[n.userId].name}">
                                                                                            </c:if>
                                                                                            <c:if test="${not empty allUsers[n.userId].image}">
                                                                                                <img src="${pageContext.request.contextPath}/${allUsers[n.userId].image}" alt="${allUsers[n.userId].name}">
                                                                                            </c:if>
                                                                                    </a>
                                                                                    <h2>
                                                                                            <a class="layui-badge">${allNewstypes[n.newsTypeId].name}</a>
                                                                                            <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryOfId&newsId=${n.newsId}">${n.title}</a>
                                                                                    </h2>
                                                                                    <div class="fly-list-info">
                                                                                            <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.userId}" link>
                                                                                                    <cite>${allUsers[n.userId].name}</cite>
                                                                                            </a>
                                                                                            <span>${n.time}</span>
                                                                                            <span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> ${n.money}</span>
                                                                                            <!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
                                                                                            <span class="fly-list-nums"> 
                                                                                                    <i class="layui-icon" title="点赞量">&#xe6c6;</i>  ${n.good}
                                                                                            </span>
                                                                                    </div>
                                                                                    <div class="fly-list-badge">
                                                                                            <c:if test="${not empty n.buff}">
                                                                                                <c:set value="${ fn:split(n.buff, ',') }" var="names" />
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
                                                                                    </div>
                                                                            </li>
                                                                        </c:forEach>
                                                                    </c:if>
                                                            </ul>
                                                    </div>
                                                </c:if>
                                                <div class="layui-container">
                                                        <div class="layui-row layui-col-space15">
                                                                <div class="layui-col-md8">
                                                                        <div class="fly-panel" style="margin-bottom: 0;">
                                                                                <div class="fly-panel-title fly-filter">
                                                                                        <a href="" class="layui-this">综合</a>
                                                                                        <span class="fly-filter-right layui-hide-xs">
                                                                                                <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryAll&orderBy=time" <c:if test="${orderBy == 'time'}"> class="layui-this" </c:if>>按最新</a>
                                                                                                    <span class="fly-mid"></span>
                                                                                                    <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryAll&orderBy=search" <c:if test="${orderBy == 'search'}"> class="layui-this" </c:if>>按热搜</a>
                                                                                                    <span class="fly-mid"></span>
                                                                                                    <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryAll&orderBy=good" <c:if test="${orderBy == 'good'}"> class="layui-this" </c:if>>按点赞</a>
                                                                                                </span>
                                                                                        </div>

                                                                                        <ul class="fly-list">
                                                                                        <c:if test="${not empty newsList}">
                                                                                            <c:forEach items="${newsList}" var="n">
                                                                                                <li>
                                                                                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.userId}" class="fly-avatar">
                                                                                                                <c:if test="${empty allUsers[n.userId].image}">
                                                                                                                    <img src="${pageContext.request.contextPath}/img/logo.png" alt="${allUsers[n.userId].name}">
                                                                                                                </c:if>
                                                                                                                <c:if test="${not empty allUsers[n.userId].image}">
                                                                                                                    <img src="${pageContext.request.contextPath}/${allUsers[n.userId].image}" alt="${allUsers[n.userId].name}">
                                                                                                                </c:if>
                                                                                                        </a>
                                                                                                        <h2>
                                                                                                                <a class="layui-badge">${allNewstypes[n.newsTypeId].name}</a>
                                                                                                                <a href="${pageContext.request.contextPath}/NewsAction.do?method=queryOfId&newsId=${n.newsId}">${n.title}</a>
                                                                                                        </h2>
                                                                                                        <div class="fly-list-info">
                                                                                                                <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.userId}" link>
                                                                                                                        <cite>${allUsers[n.userId].name}</cite>
                                                                                                                </a>
                                                                                                                <span>${n.time}</span>
                                                                                                                <span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> ${n.money}</span>
                                                                                                                <!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
                                                                                                                <span class="fly-list-nums"> 
                                                                                                                        <i class="layui-icon" title="点赞量">&#xe6c6;</i>  ${n.good}
                                                                                                                </span>
                                                                                                        </div>
                                                                                                        <div class="fly-list-badge">
                                                                                                                <!--<span class="layui-badge layui-bg-red">精帖</span>-->
                                                                                                        </div>
                                                                                                </li>
                                                                                            </c:forEach>
                                                                                        </c:if>
                                                                                </ul>        
                                                                                <c:if test="${empty newsList}">
                                                                                    <div class="fly-none">没有相关数据</div> 
                                                                                </c:if>
                                                                                <!-- 分頁 -->
                                                                                <c:if test="${not empty newsList}">
                                                                                    <div id="pageDiv" align="center"></div>
                                                                                </c:if>
                                                                        </div>
                                                                </div>
                                                        </div>
                                                </div>
                                        </div>
                                        <div class="layui-col-md4">
                                                <div class="fly-panel fly-signin">
                                                        <div class="fly-panel-title">
                                                                签到
                                                                <i class="fly-mid"></i>
                                                                <c:if test="${not empty identity}">
                                                                    <span class="fly-signin-days">已连续签到<cite>${identity.days}</cite>天</span>
                                                                </c:if>
                                                        </div>
                                                        <div class="fly-panel-main fly-signin-main">
                                                                <c:if test="${not empty identity}">
                                                                    <c:if test="${empty isQd}">
                                                                        <button class="layui-btn layui-btn-danger" onclick="qd()" >今日签到</button>
                                                                        <span>可获得<cite>5</cite><i class="layui-icon">&#xe65e;</i>阳光值</span>
                                                                    </c:if>
                                                                    <c:if test="${not empty isQd}">
                                                                        <!-- 已签到状态 -->
                                                                        <button class="layui-btn layui-btn-disabled">今日已签到</button>
                                                                        <span>获得了<cite>5</cite>阳光值</span>
                                                                    </c:if>
                                                                </c:if>
                                                                <c:if test="${empty identity}">
                                                                    <button class="layui-btn layui-btn-disabled">请先登录</button>
                                                                    <span>签到可获得<cite>5</cite>阳光值</span>
                                                                </c:if>

                                                        </div>
                                                </div>
                                                <div class="fly-panel fly-signin">
                                                        <div id="main" style="height: 400px;">
                                                        </div>
                                                </div>
                                                <div class="fly-panel fly-rank fly-rank-reply" id="LAY_replyRank">
                                                        <h3 class="fly-panel-title">财富榜</h3>
                                                        <dl>
                                                                <c:if test="${not empty cfList}">
                                                                    <c:forEach items="${cfList}" var="n">
                                                                        <!--<i class="layui-icon fly-loading">&#xe63d;</i>-->
                                                                        <dd>
                                                                                <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${n.userId}">   
                                                                                        <c:if test="${empty n.image}">
                                                                                            <img src="${pageContext.request.contextPath}/img/logo.png" alt="${n.name}">
                                                                                        </c:if>
                                                                                        <c:if test="${not empty n.image}">
                                                                                            <img src="${pageContext.request.contextPath}/${n.image}" alt="${n.name}">
                                                                                        </c:if>
                                                                                        <cite>${n.name}</cite><i>${n.money}</i>
                                                                                </a>
                                                                        </dd>
                                                                    </c:forEach>
                                                                </c:if>
                                                                <c:if test="${ empty cfList}">
                                                                    <dd><div class="fly-none">没有数据</div></dd>
                                                                </c:if>
                                                        </dl>
                                                </div>

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

                                                <div class="fly-panel">
                                                        <div class="fly-panel-main">
                                                                <a href="https://github.com/xyxd0522" target="_blank" class="fly-zanzhu" time-limit="2017.09.25-2099.01.01" style="background-color: #5FB878;">SunnyNews 向阳小队旗舰之作</a>
                                                        </div>
                                                        <div class="fly-panel" style="padding: 20px 0; text-align: center;">
                                                                <img src="http://img.blog.csdn.net/20170410111808727?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbGluZ2xpYW4wNTIy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" style="max-width: 100%;" alt="layui">
                                                                <p style="position: relative; color: #666;">微信扫码关注 向阳小队 公众号</p>
                                                        </div>
                                                </div>

                                                <div class="fly-panel fly-link">
                                                        <h3 class="fly-panel-title">友情链接</h3>
                                                        <dl class="fly-panel-main">
                                                                <dd>
                                                                        <a href="https://ele-peng.github.io/" target="_blank">Ele-Peng's Blog</a>
                                                                </dd>
                                                                <dd>
                                                                        <a href="https://github.com/linglian" target="_blank">Lee's GitHub</a>
                                                                </dd>
                                                                <dd>
                                                                        <a href="http://blog.csdn.net/linglian0522" target="_blank">Lee's CSDN</a>
                                                                </dd>
                                                                <dd>
                                                                        <a href="http://blog.csdn.net/elle_peng" target="_blank">Ele-Peng's CSDN</a>
                                                                </dd>
                                                                <dd>
                                                                        <a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews开发代码管理</a>
                                                                </dd>
                                                                <dd>
                                                                        <a href="mailto:xianxin@layui-inc.com?subject=%E7%94%B3%E8%AF%B7Fly%E7%A4%BE%E5%8C%BA%E5%8F%8B%E9%93%BE" class="fly-link">申请友链</a>
                                                                </dd>
                                                        </dl>
                                                </div>
                                        </div>
                                </div>
                        </div>
                </div>

                <div class="fly-footer">
                        <p>
                                <a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy;
                                <a href="https://github.com/xyxd0522" target="_blank">向阳出品</a>
                        </p>
                        <p>
                                <a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
                                <c:if test="${identity.lvl == '-99'}">
                                    <a href="${pageContext.request.contextPath}/admin/index.jsp" target="_blank">后台入口</a>
                                </c:if>
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
                                                                            //注意：导航 依赖 element 模块，否则无法进行功能性操作
                                                                            layui.use('element', function () {
                                                                                var element = layui.element;

                                                                                //…
                                                                            });
                                                                            layui.use('carousel', function () {
                                                                                var carousel = layui.carousel;
                                                                                //建造实例
                                                                                carousel.render({
                                                                                    elem: '#test1'
                                                                                    , width: '100%' //设置容器宽度
                                                                                    , arrow: 'always' //始终显示箭头
                                                                                            //,anim: 'updown' //切换动画方式
                                                                                });
                                                                            });
                        <c:if test="${not empty newsList}">
                                                                            layui.use(['laypage', 'layer'], function () {
                                                                                var laypage = layui.laypage
                                                                                        , layer = layui.layer;
                                                                                laypage.render({
                                                                                    elem: 'pageDiv'
                                                                                    , count: ${newsSize}
                                                                                    , theme: '#1E9FFF'
                                                                                    , layout: ['count', 'prev', 'page', 'next', 'skip']
                                                                                    , limit: 15
                                                                                    , curr: ${newsPage}
                                                                                    , jump: function (obj) {
                                                                                        if (obj.curr != ${newsPage}) {
                                                                                            location.href = "${pageContext.request.contextPath}/NewsAction.do?method=queryAll&page=" + obj.curr <c:if test="${not empty likeStr}"> + "&likeStr=${likeStr}"</c:if> <c:if test="${not empty likeWord}"> + "&likeWord=${likeWord}"</c:if>;
                                                                                        }
                                                                                    }
                                                                                });
                                                                            });
                        </c:if>
                </script>
        </body>
</html>