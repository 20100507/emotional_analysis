<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<title>网易云音乐数据分析报告web展现平台</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="${pageContext.request.contextPath}/page/js/jquery.min.js"></script>
<!-- bootstrap-css -->
<!-- scripts -->
<script src="${pageContext.request.contextPath }/js/list.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
<link href="${pageContext.request.contextPath }/search/js/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="${pageContext.request.contextPath }/search/js/font-awesome.min.css" rel="stylesheet" media="screen">
<link href="${pageContext.request.contextPath }/search/js/my.css" rel="stylesheet" media="screen">
<script src="${pageContext.request.contextPath }/search/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/search/js/bootstrap.min.js"></script>
<link rel="preload" href="${pageContext.request.contextPath }/search/js/integrator.js" as="script">
<script type="text/javascript" src="${pageContext.request.contextPath }/search/js/integrator.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/search/js/m.js" charset="gbk"></script>
 <script src="${pageContext.request.contextPath }/search/js/bbau.js"></script>
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath }/css/style.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath }/css/style-responsive.css" rel="stylesheet"/>
<!-- font-awesome icons -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/font.css" type="text/css"/>
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/morris.css" type="text/css"/>
<!-- calendar -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/monthly.css">
<!-- //calendar -->
<!-- //font-awesome icons -->
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="${pageContext.request.contextPath }/js/raphael-min.js"></script>
<script src="${pageContext.request.contextPath }/js/morris.js"></script>
</head>
<style>
.m, .mn {
	margin-top: 455px
}

.banner {
	height: 404px
}

.nav-bg, .nav-bgn {
	top: 455px
}

.banseo {
	top: 126px
}

.ifbk {
	height: 172px;
	overflow: hidden;
}

.ifbk iframe {
	width: 200%;
	height: 200%;
	background: white;
	border: 0;
	overflow: hidden;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	-webkit-transform: scale(0.5);
	-webkit-transform-origin: top left;
	-moz-transform: scale(0.5);
	-moz-transform-origin: top left;
	-ms-transform: scale(0.5);
	-ms-transform-origin: top left;
	-o-transform: scale(0.5);
	-o-transform-origin: top left;
	transform: scale(0.5);
	transform-origin: top left;
}

.posts-nav .next a {
	background: #ffffff url(../img/ico-pagination-arrow-next.png) no-repeat
		center;
	width: 144px;
	height: 53px;
	line-height: 53px;
}

.navbar-inverse {
	background-color: #000;
	border-bottom: 1px solid #212121;
}

.zhe {
	color: #262626;
	font-family: Vrinda
}

.wh {
	height: 10px
}

.banseo2 {
	width: 728px;
	height: 15px;
	left: 0;
	right: 0;
	margin: auto;
	position: absolute;
	top: 190px;
	border-radius: 15px;
	z-index: 99;
}

.banseo {
	width: 728px;
}

.bantxt {
	width: 100%;
	height: 60px;
	opacity: 1;
	background-color: #eceff1;
	border-radius: 5px;
	border: 0px;
	padding-left: 50px;
	color: #000
}

.banbutt {
	height: 60px;
	width: 173px;
	background-color: #ec4d1c;
	border: 0px;
	color: #fff;
	border-top-left-radius: 0px;
	border-bottom-left-radius: 0px;
	transition: all .7s ease 0s;
	font-size: 15px;
	background: -webkit-linear-gradient(top, #f4511e 0, #d84315 100%);
	background: linear-gradient(to bottom, #f4511e 0, #d84315 100%);
}

.banbutt:hover {
	background-color: #ed3800;
	background: -webkit-linear-gradient(top, #f03900 0, #bb2c00 100%);
	background: linear-gradient(to bottom, #f03900 0, #bb2c00 100%);
}

.seoicn {
	position: absolute;
	left: 20px;
	bottom: -96px;
	color: #b0bec5;
	font-size: 18px
}

.banjz {
	padding-bottom: 20px;
}

input::-webkit-input-placeholder {
	color: #b0bec5;
	opacity: 1;
}

@media screen and (max-width:770px) {
	.banseo {
		width: 85%;
	}
	.banbutt {
		width: 123px
	}
}

.bjtx {
	position: absolute;
	right: 10px;
	bottom: 10px;
	background-color: rgba(255, 255, 255, 0.13);
	padding: 3px;
	font-size: 12px;
	color: #656565;
	border-radius: 5px;
	cursor: pointer
}

.banjz {
	padding-bottom: 40px;
}

.banseo {
	top: 126px;
}

.banseo2 {
	text-align: right
}

.banseo2 a {
	color: #fff;
	opacity: .7
}
</style>
<style type="text/css">
a:hover, a:focus {
	text-decoration: none;
	outline: none;
}

#accordion {
	padding-right: 24px;
	padding-left: 24px;
	z-index: 1;
}

#accordion .panel {
	border: none;
	box-shadow: none;
}

#accordion .panel-heading {
	padding: 0;
	border-radius: 0;
	border: none;
}

#accordion .panel-title {
	padding: 0;
}

#accordion .panel-title a {
	display: block;
	font-size: 16px;
	font-weight: bold;
	background: #e16b47;
	color: #f7c59f;
	padding: 15px 25px;
	position: relative;
	margin-left: -24px;
	transition: all 0.3s ease 0s;
}

#accordion .panel-title a.collapsed {
	background: #f7c59f;
	color: #e16b47;
	margin-left: 0;
	transition: all 0.3s ease 0s;
}

#accordion .panel-title a:before {
	content: "";
	border-left: 24px solid #e16b47;
	border-top: 24px solid transparent;
	border-bottom: 24px solid transparent;
	position: absolute;
	top: 0;
	right: -24px;
	transition: all 0.3s ease 0s;
}

#accordion .panel-title a.collapsed:before {
	border-left-color: #f7c59f;
}

#accordion .panel-title a:after {
	content: "\f106";
	font-family: 'FontAwesome';
	position: absolute;
	top: 30%;
	right: 15px;
	font-size: 18px;
	color: #f7c59f;
}

#accordion .panel-title a.collapsed:after {
	content: "\f107";
	color: #e16b47;
}

#accordion .panel-collapse {
	position: relative;
}

#accordion .panel-collapse.in:before {
	content: "";
	border-right: 24px solid #f7c59f;
	border-bottom: 18px solid transparent;
	position: absolute;
	top: 0;
	left: -24px;
}

#accordion .panel-body {
	font-size: 14px;
	color: #333;
	background: #e4e4e4;
	border-top: none;
	z-index: 1;
}

.jq22-header h1 {
	text-align: center
}
</style>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">
    <a href="${pageContext.request.contextPath }/index.html" class="logo">
       网易云音乐
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->
<div class="nav notify-row" id="top_menu">
    <!--  notification start -->
    <ul class="nav top-menu">
        <!-- settings start -->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <i class="fa fa-tasks"></i>
                <span class="badge bg-success">8</span>
            </a>
            <ul class="dropdown-menu extended tasks-bar">
                <li>
                    <p class="">You have 8 pending tasks</p>
                </li>
                <li>
                    <a href="#">
                        <div class="task-info clearfix">
                            <div class="desc pull-left">
                                <h5>Target Sell</h5>
                                <p>25% , Deadline  12 June’13</p>
                            </div>
                                    <span class="notification-pie-chart pull-right" data-percent="45">
                            <span class="percent"></span>
                            </span>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div class="task-info clearfix">
                            <div class="desc pull-left">
                                <h5>Product Delivery</h5>
                                <p>45% , Deadline  12 June’13</p>
                            </div>
                                    <span class="notification-pie-chart pull-right" data-percent="78">
                            <span class="percent"></span>
                            </span>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div class="task-info clearfix">
                            <div class="desc pull-left">
                                <h5>Payment collection</h5>
                                <p>87% , Deadline  12 June’13</p>
                            </div>
                                    <span class="notification-pie-chart pull-right" data-percent="60">
                            <span class="percent"></span>
                            </span>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div class="task-info clearfix">
                            <div class="desc pull-left">
                                <h5>Target Sell</h5>
                                <p>33% , Deadline  12 June’13</p>
                            </div>
                                    <span class="notification-pie-chart pull-right" data-percent="90">
                            <span class="percent"></span>
                            </span>
                        </div>
                    </a>
                </li>

                <li class="external">
                    <a href="#">See All Tasks</a>
                </li>
            </ul>
        </li>
        <!-- settings end -->
        <!-- inbox dropdown start-->
        <li id="header_inbox_bar" class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <i class="fa fa-envelope-o"></i>
                <span class="badge bg-important">4</span>
            </a>
            <ul class="dropdown-menu extended inbox">
                <li>
                    <p class="red">You have 4 Mails</p>
                </li>
                <li>
                    <a href="#">
                        <span class="photo"><img alt="avatar" src="images/3.png"></span>
                                <span class="subject">
                                <span class="from">Jonathan Smith</span>
                                <span class="time">Just now</span>
                                </span>
                                <span class="message">
                                    Hello, this is an example msg.
                                </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="photo"><img alt="avatar" src="images/1.png"></span>
                                <span class="subject">
                                <span class="from">Jane Doe</span>
                                <span class="time">2 min ago</span>
                                </span>
                                <span class="message">
                                    Nice admin template
                                </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="photo"><img alt="avatar" src="images/3.png"></span>
                                <span class="subject">
                                <span class="from">Tasi sam</span>
                                <span class="time">2 days ago</span>
                                </span>
                                <span class="message">
                                    This is an example msg.
                                </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="photo"><img alt="avatar" src="images/2.png"></span>
                                <span class="subject">
                                <span class="from">Mr. Perfect</span>
                                <span class="time">2 hour ago</span>
                                </span>
                                <span class="message">
                                    Hi there, its a test
                                </span>
                    </a>
                </li>
                <li>
                    <a href="#">See all messages</a>
                </li>
            </ul>
        </li>
        <!-- inbox dropdown end -->
        <!-- notification dropdown start-->
        <li id="header_notification_bar" class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">

                <i class="fa fa-bell-o"></i>
                <span class="badge bg-warning">3</span>
            </a>
            <ul class="dropdown-menu extended notification">
                <li>
                    <p>Notifications</p>
                </li>
                <li>
                    <div class="alert alert-info clearfix">
                        <span class="alert-icon"><i class="fa fa-bolt"></i></span>
                        <div class="noti-info">
                            <a href="#"> Server #1 overloaded.</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="alert alert-danger clearfix">
                        <span class="alert-icon"><i class="fa fa-bolt"></i></span>
                        <div class="noti-info">
                            <a href="#"> Server #2 overloaded.</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="alert alert-success clearfix">
                        <span class="alert-icon"><i class="fa fa-bolt"></i></span>
                        <div class="noti-info">
                            <a href="#"> Server #3 overloaded.</a>
                        </div>
                    </div>
                </li>

            </ul>
        </li>
        <!-- notification dropdown end -->
    </ul>
    <!--  notification end -->
</div>
<div class="top-nav clearfix">
    <!--search & user info start-->
    <ul class="nav pull-right top-menu">
        <!-- user login dropdown start-->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <img alt="" src="images/2.png">
                <span class="username">John Doe</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
                <li><a href="#"><i class=" fa fa-suitcase"></i>Profile</a></li>
                <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
                <li><a href="login.html"><i class="fa fa-key"></i> Log Out</a></li>
            </ul>
        </li>
        <!-- user login dropdown end -->
       
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<!--sidebar start-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a class="active" href="index.html">
                        <i class="fa fa-dashboard"></i>
                        <span>音乐数据分析平台</span>
                    </a>
                </li>
                
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>人物画像</span>
                    </a>
                    <ul class="sub">
						<li><a href="typography.html">人物画像</a></li>
                    </ul>
                </li>
                 <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span>图计算</span>
                    </a>
                    <ul class="sub">
                        <li><a href="form_component.html">用户PageRankTop榜</a></li>
                        <li><a href="form_validation.html">用户Triangle量</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span>音乐热听榜</span>
                    </a>
                    <ul class="sub">
                        <li><a href="${pageContext.request.contextPath }/song/songtop">歌曲排行榜</a></li>
                        <li><a href="form_validation.html">歌曲分类</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="active">
                        <i class="fa fa-envelope"></i>
                        <span>评论</span>
                    </a>
                    <ul class="sub">
                        <li><a href="mail.html">热歌评论时间段</a></li>
                        <li><a href="${pageContext.request.contextPath }/comment/wordcloud">评论词云</a></li>
                         <li><a href="mail_compose.html">评论排行榜</a></li>
                          <li><a href="${pageContext.request.contextPath }/comment/search" class="active" >热评搜索</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>用户分布</span>
                    </a>
                    <ul class="sub">
                        <li><a href="${pageContext.request.contextPath }/person/map">全国地理分布</a></li>
                        <li><a href="${pageContext.request.contextPath }/person/gender">性别比例</a></li>
                        <li><a href="${pageContext.request.contextPath }/person/constel">星座</a></li>
                        <li><a href="${pageContext.request.contextPath }/person/age">年龄分布</a></li>
                    </ul>
                </li>
                 <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span>机器学习[分类]</span>
                    </a>
                    <ul class="sub">
                        <li><a href="form_component.html">文本分类</a></li>
                    </ul>
                </li>
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
   <div class="container-fluid banner banbk">
	<div class="banseo">
        <div class="banjz"><img src=""></div>
    	<input type="text" class="bantxt" id="searchtxt" placeholder="输入热评关键字.." onkeyup="autoComplete.start(event)" value="${content}"><button class="btn banbutt" type="button" id="seobut"><i class="fa fa-chevron-circle-right"></i>搜索</button>
    </div>
	<iframe class="baniframe" sandbox="allow-scripts allow-same-origin" id="mh" src="${pageContext.request.contextPath }/js/a3.html"></iframe>
    </div>
 <div class="clearfix"> </div>
  <div class="row" style="padding: 1em 0;"  >
    <div class="container" style="z-index: 9999px;">
      <div class="row">
        <div class="col-md-offset-4 col-lg-4" >
          <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
        
           <c:forEach items="${pageBean.list }" var="comment" varStatus="status">
              <div class="panel panel-default">
              <div class="panel-heading" role="tab" 
               <c:choose>
              	  <c:when test="${status.index eq 0}">
              	      id="headingOne"
              	  </c:when>
              	  <c:when test="${status.index eq 1}">
              	      id="headingTwo"
              	  </c:when>
				  <c:otherwise>
				  	id="headingThree"
				  </c:otherwise>
              </c:choose>
              >
                <h4 class="panel-title">
                 <a role="button" url="${comment.songUrl }" onclick="appendSong(this);"
                data-toggle="collapse" 
                data-parent="#accordion" 
                 <c:choose>
              	  <c:when test="${status.index eq 0}">
              	   href="#collapseOne" 
              	  </c:when>
              	  <c:when test="${status.index eq 1}">
              	    href="#collapseTwo"
              	  </c:when>
				  <c:otherwise>
				  	 href="#collapseThree"
				  </c:otherwise>
              </c:choose>
                aria-expanded="false" 
                 <c:choose>
              	  <c:when test="${status.index eq 0}">
              	    aria-controls="collapseOne"
              	  </c:when>
              	  <c:when test="${status.index eq 1}">
              	    aria-controls="collapseTwo"
              	  </c:when>
				  <c:otherwise>
				  	 aria-controls="collapseThree"
				  </c:otherwise>
              </c:choose>> 
		                  ${comment.songName}
              </a>
                 </h4>
              </div>
              <div 
               <c:choose>
              	  <c:when test="${status.index eq 0}">
              	     id="collapseOne"
              	  </c:when>
              	  <c:when test="${status.index eq 1}">
              	    id="collapseTwo"
              	  </c:when>
				  <c:otherwise>
				  	id="collapseThree"
				  </c:otherwise>
              </c:choose>
               class="panel-collapse collapse" 
               role="tabpanel" 
                <c:choose>
              	  <c:when test="${status.index eq 0}">
              	       aria-labelledby="headingOne"
              	  </c:when>
              	  <c:when test="${status.index eq 1}">
              	    aria-labelledby="headingTwo"
              	  </c:when>
				  <c:otherwise>
				  	aria-labelledby="headingThr"
				  </c:otherwise>
              </c:choose>>
                <div class="panel-body">
                  <p >
					${comment.content}<br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					------点赞量<font color="red">${comment.count}</font>
                  </p>
                </div>
              </div>
            </div>
           </c:forEach>
        </div>
         </div>
      </div>
         <div style="margin-left: 940px;">
            <button class="btn btn-danger" id="previous" style="cursor: pointer;" <c:if test="${page eq 1}">disabled="disabled"</c:if> >上一页</button>
            <button class="btn btn-danger" id="next" tyle="cursor: pointer;" <c:if test="${page eq pageBean.totalPage}">disabled="disabled"</c:if>  >下一页</button>
        </div>
    </div>
  </div>
  <script type="text/javascript">
    $("#previous").click(function() {
			 window.location.href = "${pageContext.request.contextPath}/comment/search?content=${content}&page="+${page-1}
	});
  
    $("#next").click(function() {
			 window.location.href = "${pageContext.request.contextPath}/comment/search?content=${content}&page="+${page+1}
	});
  </script>
  <style>
  	.panel-group .panel {
  	margin-top:5px;
    margin-bottom: 0;
    border-radius: 4px;
    width: 1050px;
    margin-left: -390px;
    z-index: 9999999;
    }
  	.row {
    margin-left: -8px;
    margin-top: 220px;
    margin-right: 20px;
   }
  </style>
</div>
</section>

<!--main content end-->
</section>
<script src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="${pageContext.request.contextPath }/js/scripts.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.slimscroll.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.nicescroll.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.scrollTo.js"></script>
<p id="BQQ">
<audio id="audio"></audio>
</p>
<script type="text/javascript">

function appendSong(comment){
   $("#audio").attr("src",comment.attributes.url.nodeValue)
   document.getElementById("audio").play();	
}
</script>
</body>
<script type="text/javascript">
				$("#seobut").click(function() {
					var seo = $("#searchtxt").val();
					if (seo.length > 1) {
						window.location.href = "${pageContext.request.contextPath}/comment/search?content=" + seo + "&page=1"
					}
				}); $('#searchtxt').bind('keypress', function(event) {
					if (event.keyCode == "13") {
						var seo = $("#searchtxt").val();
						if (seo.length > 1) {
							window.location.href = "${pageContext.request.contextPath}/comment/search?content=" + seo + "&page=1"
						}
					}
				});
			</script>
			<script>
				var _hmt = _hmt || [];
				(function() {
					var hm = document.createElement("script");
					hm.src = "//hm.baidu.com/hm.js?b3a3fc356d0af38b811a0ef8d50716b8";
					var s = document.getElementsByTagName("script")[0];
					s.parentNode.insertBefore(hm, s);
				})();
			</script>
			
</html>
