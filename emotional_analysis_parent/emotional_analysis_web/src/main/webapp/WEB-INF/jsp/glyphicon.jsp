<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
<title>Glyphicons</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style-responsive.css" rel="stylesheet"/>
<!-- font-awesome icons -->
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
<!-- //font-awesome icons -->
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">

    <a href="index.html" class="logo">
        VISITORS
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
                                <p>25% , Deadline  12 Juneâ13</p>
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
                                <p>45% , Deadline  12 Juneâ13</p>
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
                                <p>87% , Deadline  12 Juneâ13</p>
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
                                <p>33% , Deadline  12 Juneâ13</p>
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
        <li>
            <input type="text" class="form-control search" placeholder=" Search">
        </li>
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
                    <a href="index.html">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                
                <li class="sub-menu">
                    <a class="active" href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>UI Elements</span>
                    </a>
                    <ul class="sub">
						<li><a href="typography.html">Typography</a></li>
						<li><a class="active" href="glyphicon.html">glyphicon</a></li>
                        <li><a href="grids.html">Grids</a></li>
                    </ul>
                </li>
                <li>
                    <a href="fontawesome.html">
                        <i class="fa fa-bullhorn"></i>
                        <span>Font awesome </span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-th"></i>
                        <span>Data Tables</span>
                    </a>
                    <ul class="sub">
                        <li><a href="basic_table.html">Basic Table</a></li>
                        <li><a href="responsive_table.html">Responsive Table</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span>Form Components</span>
                    </a>
                    <ul class="sub">
                        <li><a href="form_component.html">Form Elements</a></li>
                        <li><a href="form_validation.html">Form Validation</a></li>
						<li><a href="dropzone.html">Dropzone</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-envelope"></i>
                        <span>Mail </span>
                    </a>
                    <ul class="sub">
                        <li><a href="mail.html">Inbox</a></li>
                        <li><a href="mail_compose.html">Compose Mail</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>Charts</span>
                    </a>
                    <ul class="sub">
                        <li><a href="chartjs.html">Chart js</a></li>
                        <li><a href="flot_chart.html">Flot Charts</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>Maps</span>
                    </a>
                    <ul class="sub">
                        <li><a href="google_map.html">Google Map</a></li>
                        <li><a href="vector_map.html">Vector Map</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-glass"></i>
                        <span>Extra</span>
                    </a>
                    <ul class="sub">
                        <li><a href="gallery.html">Gallery</a></li>
						<li><a href="404.html">404 Error</a></li>
                        <li><a href="registration.html">Registration</a></li>
                    </ul>
                </li>
                <li>
                    <a href="login.html">
                        <i class="fa fa-user"></i>
                        <span>Login Page</span>
                    </a>
                </li>
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
		<div class="w3layouts-glyphicon">		
		<div class="grid_3 grid_4">
				<h2 class="w3ls_head">Bootstrap Glyphicons</h2>
				<h3 class="page-header icon-subheading">Glyphicons</h3>
				<div class="bs-glyphicons"> <ul class="bs-glyphicons-list"> <li> <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-asterisk</span> </li> <li> <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-plus</span> </li> <li> <span class="glyphicon glyphicon-euro" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-euro</span> </li> <li> <span class="glyphicon glyphicon-eur" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-eur</span> </li> <li> <span class="glyphicon glyphicon-minus" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-minus</span> </li> <li> <span class="glyphicon glyphicon-cloud" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-cloud</span> </li> <li> <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-envelope</span> </li> <li> <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-pencil</span> </li> <li> <span class="glyphicon glyphicon-glass" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-glass</span> </li> <li> <span class="glyphicon glyphicon-music" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-music</span> </li> <li> <span class="glyphicon glyphicon-search" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-search</span> </li> <li> <span class="glyphicon glyphicon-heart" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-heart</span> </li> <li> <span class="glyphicon glyphicon-star" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-star</span> </li> <li> <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-star-empty</span> </li> <li> <span class="glyphicon glyphicon-user" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-user</span> </li> <li> <span class="glyphicon glyphicon-film" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-film</span> </li> <li> <span class="glyphicon glyphicon-th-large" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-th-large</span> </li> <li> <span class="glyphicon glyphicon-th" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-th</span> </li> <li> <span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-th-list</span> </li> <li> <span class="glyphicon glyphicon-ok" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ok</span> </li> <li> <span class="glyphicon glyphicon-remove" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-remove</span> </li> <li> <span class="glyphicon glyphicon-zoom-in" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-zoom-in</span> </li> <li> <span class="glyphicon glyphicon-zoom-out" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-zoom-out</span> </li> <li> <span class="glyphicon glyphicon-off" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-off</span> </li> <li> <span class="glyphicon glyphicon-signal" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-signal</span> </li> <li> <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-cog</span> </li> <li> <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-trash</span> </li> <li> <span class="glyphicon glyphicon-home" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-home</span> </li> <li> <span class="glyphicon glyphicon-file" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-file</span> </li> <li> <span class="glyphicon glyphicon-time" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-time</span> </li> <li> <span class="glyphicon glyphicon-road" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-road</span> </li> <li> <span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-download-alt</span> </li> <li> <span class="glyphicon glyphicon-download" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-download</span> </li> <li> <span class="glyphicon glyphicon-upload" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-upload</span> </li> <li> <span class="glyphicon glyphicon-inbox" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-inbox</span> </li> <li> <span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-play-circle</span> </li> <li> <span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-repeat</span> </li> <li> <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-refresh</span> </li> <li> <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-list-alt</span> </li> <li> <span class="glyphicon glyphicon-lock" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-lock</span> </li> <li> <span class="glyphicon glyphicon-flag" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-flag</span> </li> <li> <span class="glyphicon glyphicon-headphones" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-headphones</span> </li> <li> <span class="glyphicon glyphicon-volume-off" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-volume-off</span> </li> <li> <span class="glyphicon glyphicon-volume-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-volume-down</span> </li> <li> <span class="glyphicon glyphicon-volume-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-volume-up</span> </li> <li> <span class="glyphicon glyphicon-qrcode" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-qrcode</span> </li> <li> <span class="glyphicon glyphicon-barcode" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-barcode</span> </li> <li> <span class="glyphicon glyphicon-tag" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tag</span> </li> <li> <span class="glyphicon glyphicon-tags" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tags</span> </li> <li> <span class="glyphicon glyphicon-book" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-book</span> </li> <li> <span class="glyphicon glyphicon-bookmark" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bookmark</span> </li> <li> <span class="glyphicon glyphicon-print" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-print</span> </li> <li> <span class="glyphicon glyphicon-camera" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-camera</span> </li> <li> <span class="glyphicon glyphicon-font" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-font</span> </li> <li> <span class="glyphicon glyphicon-bold" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bold</span> </li> <li> <span class="glyphicon glyphicon-italic" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-italic</span> </li> <li> <span class="glyphicon glyphicon-text-height" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-text-height</span> </li> <li> <span class="glyphicon glyphicon-text-width" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-text-width</span> </li> <li> <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-align-left</span> </li> <li> <span class="glyphicon glyphicon-align-center" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-align-center</span> </li> <li> <span class="glyphicon glyphicon-align-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-align-right</span> </li> <li> <span class="glyphicon glyphicon-align-justify" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-align-justify</span> </li> <li> <span class="glyphicon glyphicon-list" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-list</span> </li> <li> <span class="glyphicon glyphicon-indent-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-indent-left</span> </li> <li> <span class="glyphicon glyphicon-indent-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-indent-right</span> </li> <li> <span class="glyphicon glyphicon-facetime-video" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-facetime-video</span> </li> <li> <span class="glyphicon glyphicon-picture" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-picture</span> </li> <li> <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-map-marker</span> </li> <li> <span class="glyphicon glyphicon-adjust" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-adjust</span> </li> <li> <span class="glyphicon glyphicon-tint" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tint</span> </li> <li> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-edit</span> </li> <li> <span class="glyphicon glyphicon-share" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-share</span> </li> <li> <span class="glyphicon glyphicon-check" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-check</span> </li> <li> <span class="glyphicon glyphicon-move" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-move</span> </li> <li> <span class="glyphicon glyphicon-step-backward" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-step-backward</span> </li> <li> <span class="glyphicon glyphicon-fast-backward" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-fast-backward</span> </li> <li> <span class="glyphicon glyphicon-backward" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-backward</span> </li> <li> <span class="glyphicon glyphicon-play" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-play</span> </li> <li> <span class="glyphicon glyphicon-pause" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-pause</span> </li> <li> <span class="glyphicon glyphicon-stop" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-stop</span> </li> <li> <span class="glyphicon glyphicon-forward" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-forward</span> </li> <li> <span class="glyphicon glyphicon-fast-forward" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-fast-forward</span> </li> <li> <span class="glyphicon glyphicon-step-forward" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-step-forward</span> </li> <li> <span class="glyphicon glyphicon-eject" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-eject</span> </li> <li> <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-chevron-left</span> </li> <li> <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-chevron-right</span> </li> <li> <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-plus-sign</span> </li> <li> <span class="glyphicon glyphicon-minus-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-minus-sign</span> </li> <li> <span class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-remove-sign</span> </li> <li> <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ok-sign</span> </li> <li> <span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-question-sign</span> </li> <li> <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-info-sign</span> </li> <li> <span class="glyphicon glyphicon-screenshot" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-screenshot</span> </li> <li> <span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-remove-circle</span> </li> <li> <span class="glyphicon glyphicon-ok-circle" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ok-circle</span> </li> <li> <span class="glyphicon glyphicon-ban-circle" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ban-circle</span> </li> <li> <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-arrow-left</span> </li> <li> <span class="glyphicon glyphicon-arrow-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-arrow-right</span> </li> <li> <span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-arrow-up</span> </li> <li> <span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-arrow-down</span> </li> <li> <span class="glyphicon glyphicon-share-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-share-alt</span> </li> <li> <span class="glyphicon glyphicon-resize-full" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-resize-full</span> </li> <li> <span class="glyphicon glyphicon-resize-small" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-resize-small</span> </li> <li> <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-exclamation-sign</span> </li> <li> <span class="glyphicon glyphicon-gift" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-gift</span> </li> <li> <span class="glyphicon glyphicon-leaf" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-leaf</span> </li> <li> <span class="glyphicon glyphicon-fire" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-fire</span> </li> <li> <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-eye-open</span> </li> <li> <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-eye-close</span> </li> <li> <span class="glyphicon glyphicon-warning-sign" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-warning-sign</span> </li> <li> <span class="glyphicon glyphicon-plane" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-plane</span> </li> <li> <span class="glyphicon glyphicon-calendar" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-calendar</span> </li> <li> <span class="glyphicon glyphicon-random" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-random</span> </li> <li> <span class="glyphicon glyphicon-comment" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-comment</span> </li> <li> <span class="glyphicon glyphicon-magnet" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-magnet</span> </li> <li> <span class="glyphicon glyphicon-chevron-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-chevron-up</span> </li> <li> <span class="glyphicon glyphicon-chevron-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-chevron-down</span> </li> <li> <span class="glyphicon glyphicon-retweet" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-retweet</span> </li> <li> <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-shopping-cart</span> </li> <li> <span class="glyphicon glyphicon-folder-close" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-folder-close</span> </li> <li> <span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-folder-open</span> </li> <li> <span class="glyphicon glyphicon-resize-vertical" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-resize-vertical</span> </li> <li> <span class="glyphicon glyphicon-resize-horizontal" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-resize-horizontal</span> </li> <li> <span class="glyphicon glyphicon-hdd" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hdd</span> </li> <li> <span class="glyphicon glyphicon-bullhorn" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bullhorn</span> </li> <li> <span class="glyphicon glyphicon-bell" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bell</span> </li> <li> <span class="glyphicon glyphicon-certificate" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-certificate</span> </li> <li> <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-thumbs-up</span> </li> <li> <span class="glyphicon glyphicon-thumbs-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-thumbs-down</span> </li> <li> <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hand-right</span> </li> <li> <span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hand-left</span> </li> <li> <span class="glyphicon glyphicon-hand-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hand-up</span> </li> <li> <span class="glyphicon glyphicon-hand-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hand-down</span> </li> <li> <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-right</span> </li> <li> <span class="glyphicon glyphicon-circle-arrow-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-left</span> </li> <li> <span class="glyphicon glyphicon-circle-arrow-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-up</span> </li> <li> <span class="glyphicon glyphicon-circle-arrow-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-down</span> </li> <li> <span class="glyphicon glyphicon-globe" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-globe</span> </li> <li> <span class="glyphicon glyphicon-wrench" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-wrench</span> </li> <li> <span class="glyphicon glyphicon-tasks" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tasks</span> </li> <li> <span class="glyphicon glyphicon-filter" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-filter</span> </li> <li> <span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-briefcase</span> </li> <li> <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-fullscreen</span> </li> <li> <span class="glyphicon glyphicon-dashboard" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-dashboard</span> </li> <li> <span class="glyphicon glyphicon-paperclip" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-paperclip</span> </li> <li> <span class="glyphicon glyphicon-heart-empty" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-heart-empty</span> </li> <li> <span class="glyphicon glyphicon-link" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-link</span> </li> <li> <span class="glyphicon glyphicon-phone" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-phone</span> </li> <li> <span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-pushpin</span> </li> <li> <span class="glyphicon glyphicon-usd" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-usd</span> </li> <li> <span class="glyphicon glyphicon-gbp" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-gbp</span> </li> <li> <span class="glyphicon glyphicon-sort" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort</span> </li> <li> <span class="glyphicon glyphicon-sort-by-alphabet" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort-by-alphabet</span> </li> <li> <span class="glyphicon glyphicon-sort-by-alphabet-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort-by-alphabet-alt</span> </li> <li> <span class="glyphicon glyphicon-sort-by-order" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort-by-order</span> </li> <li> <span class="glyphicon glyphicon-sort-by-order-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort-by-order-alt</span> </li> <li> <span class="glyphicon glyphicon-sort-by-attributes" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort-by-attributes</span> </li> <li> <span class="glyphicon glyphicon-sort-by-attributes-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sort-by-attributes-alt</span> </li> <li> <span class="glyphicon glyphicon-unchecked" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-unchecked</span> </li> <li> <span class="glyphicon glyphicon-expand" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-expand</span> </li> <li> <span class="glyphicon glyphicon-collapse-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-collapse-down</span> </li> <li> <span class="glyphicon glyphicon-collapse-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-collapse-up</span> </li> <li> <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-log-in</span> </li> <li> <span class="glyphicon glyphicon-flash" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-flash</span> </li> <li> <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-log-out</span> </li> <li> <span class="glyphicon glyphicon-new-window" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-new-window</span> </li> <li> <span class="glyphicon glyphicon-record" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-record</span> </li> <li> <span class="glyphicon glyphicon-save" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-save</span> </li> <li> <span class="glyphicon glyphicon-open" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-open</span> </li> <li> <span class="glyphicon glyphicon-saved" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-saved</span> </li> <li> <span class="glyphicon glyphicon-import" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-import</span> </li> <li> <span class="glyphicon glyphicon-export" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-export</span> </li> <li> <span class="glyphicon glyphicon-send" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-send</span> </li> <li> <span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-floppy-disk</span> </li> <li> <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-floppy-saved</span> </li> <li> <span class="glyphicon glyphicon-floppy-remove" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-floppy-remove</span> </li> <li> <span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-floppy-save</span> </li> <li> <span class="glyphicon glyphicon-floppy-open" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-floppy-open</span> </li> <li> <span class="glyphicon glyphicon-credit-card" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-credit-card</span> </li> <li> <span class="glyphicon glyphicon-transfer" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-transfer</span> </li> <li> <span class="glyphicon glyphicon-cutlery" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-cutlery</span> </li> <li> <span class="glyphicon glyphicon-header" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-header</span> </li> <li> <span class="glyphicon glyphicon-compressed" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-compressed</span> </li> <li> <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-earphone</span> </li> <li> <span class="glyphicon glyphicon-phone-alt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-phone-alt</span> </li> <li> <span class="glyphicon glyphicon-tower" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tower</span> </li> <li> <span class="glyphicon glyphicon-stats" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-stats</span> </li> <li> <span class="glyphicon glyphicon-sd-video" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sd-video</span> </li> <li> <span class="glyphicon glyphicon-hd-video" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hd-video</span> </li> <li> <span class="glyphicon glyphicon-subtitles" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-subtitles</span> </li> <li> <span class="glyphicon glyphicon-sound-stereo" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sound-stereo</span> </li> <li> <span class="glyphicon glyphicon-sound-dolby" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sound-dolby</span> </li> <li> <span class="glyphicon glyphicon-sound-5-1" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sound-5-1</span> </li> <li> <span class="glyphicon glyphicon-sound-6-1" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sound-6-1</span> </li> <li> <span class="glyphicon glyphicon-sound-7-1" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sound-7-1</span> </li> <li> <span class="glyphicon glyphicon-copyright-mark" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-copyright-mark</span> </li> <li> <span class="glyphicon glyphicon-registration-mark" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-registration-mark</span> </li> <li> <span class="glyphicon glyphicon-cloud-download" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-cloud-download</span> </li> <li> <span class="glyphicon glyphicon-cloud-upload" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-cloud-upload</span> </li> <li> <span class="glyphicon glyphicon-tree-conifer" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tree-conifer</span> </li> <li> <span class="glyphicon glyphicon-tree-deciduous" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tree-deciduous</span> </li> <li> <span class="glyphicon glyphicon-cd" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-cd</span> </li> <li> <span class="glyphicon glyphicon-save-file" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-save-file</span> </li> <li> <span class="glyphicon glyphicon-open-file" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-open-file</span> </li> <li> <span class="glyphicon glyphicon-level-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-level-up</span> </li> <li> <span class="glyphicon glyphicon-copy" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-copy</span> </li> <li> <span class="glyphicon glyphicon-paste" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-paste</span> </li> <li> <span class="glyphicon glyphicon-alert" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-alert</span> </li> <li> <span class="glyphicon glyphicon-equalizer" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-equalizer</span> </li> <li> <span class="glyphicon glyphicon-king" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-king</span> </li> <li> <span class="glyphicon glyphicon-queen" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-queen</span> </li> <li> <span class="glyphicon glyphicon-pawn" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-pawn</span> </li> <li> <span class="glyphicon glyphicon-bishop" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bishop</span> </li> <li> <span class="glyphicon glyphicon-knight" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-knight</span> </li> <li> <span class="glyphicon glyphicon-baby-formula" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-baby-formula</span> </li> <li> <span class="glyphicon glyphicon-tent" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-tent</span> </li> <li> <span class="glyphicon glyphicon-blackboard" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-blackboard</span> </li> <li> <span class="glyphicon glyphicon-bed" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bed</span> </li> <li> <span class="glyphicon glyphicon-apple" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-apple</span> </li> <li> <span class="glyphicon glyphicon-erase" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-erase</span> </li> <li> <span class="glyphicon glyphicon-hourglass" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-hourglass</span> </li> <li> <span class="glyphicon glyphicon-lamp" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-lamp</span> </li> <li> <span class="glyphicon glyphicon-duplicate" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-duplicate</span> </li> <li> <span class="glyphicon glyphicon-piggy-bank" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-piggy-bank</span> </li> <li> <span class="glyphicon glyphicon-scissors" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-scissors</span> </li> <li> <span class="glyphicon glyphicon-bitcoin" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-bitcoin</span> </li> <li> <span class="glyphicon glyphicon-btc" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-btc</span> </li> <li> <span class="glyphicon glyphicon-xbt" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-xbt</span> </li> <li> <span class="glyphicon glyphicon-yen" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-yen</span> </li> <li> <span class="glyphicon glyphicon-jpy" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-jpy</span> </li> <li> <span class="glyphicon glyphicon-ruble" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ruble</span> </li> <li> <span class="glyphicon glyphicon-rub" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-rub</span> </li> <li> <span class="glyphicon glyphicon-scale" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-scale</span> </li> <li> <span class="glyphicon glyphicon-ice-lolly" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ice-lolly</span> </li> <li> <span class="glyphicon glyphicon-ice-lolly-tasted" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-ice-lolly-tasted</span> </li> <li> <span class="glyphicon glyphicon-education" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-education</span> </li> <li> <span class="glyphicon glyphicon-option-horizontal" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-option-horizontal</span> </li> <li> <span class="glyphicon glyphicon-option-vertical" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-option-vertical</span> </li> <li> <span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-menu-hamburger</span> </li> <li> <span class="glyphicon glyphicon-modal-window" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-modal-window</span> </li> <li> <span class="glyphicon glyphicon-oil" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-oil</span> </li> <li> <span class="glyphicon glyphicon-grain" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-grain</span> </li> <li> <span class="glyphicon glyphicon-sunglasses" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-sunglasses</span> </li> <li> <span class="glyphicon glyphicon-text-size" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-text-size</span> </li> <li> <span class="glyphicon glyphicon-text-color" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-text-color</span> </li> <li> <span class="glyphicon glyphicon-text-background" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-text-background</span> </li> <li> <span class="glyphicon glyphicon-object-align-top" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-object-align-top</span> </li> <li> <span class="glyphicon glyphicon-object-align-bottom" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-object-align-bottom</span> </li> <li> <span class="glyphicon glyphicon-object-align-horizontal" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-object-align-horizontal</span> </li> <li> <span class="glyphicon glyphicon-object-align-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-object-align-left</span> </li> <li> <span class="glyphicon glyphicon-object-align-vertical" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-object-align-vertical</span> </li> <li> <span class="glyphicon glyphicon-object-align-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-object-align-right</span> </li> <li> <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-triangle-right</span> </li> <li> <span class="glyphicon glyphicon-triangle-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-triangle-left</span> </li> <li> <span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-triangle-bottom</span> </li> <li> <span class="glyphicon glyphicon-triangle-top" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-triangle-top</span> </li> <li> <span class="glyphicon glyphicon-console" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-console</span> </li> <li> <span class="glyphicon glyphicon-superscript" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-superscript</span> </li> <li> <span class="glyphicon glyphicon-subscript" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-subscript</span> </li> <li> <span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-menu-left</span> </li> <li> <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-menu-right</span> </li> <li> <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-menu-down</span> </li> <li> <span class="glyphicon glyphicon-menu-up" aria-hidden="true"></span> <span class="glyphicon-class">glyphicon glyphicon-menu-up</span> </li> </ul> </div>
			<div class="clearfix"></div>
			</div>
		</div>
</section>
 <!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>Copyright &copy; 2017.Company name All rights reserved.</p>
			</div>
		  </div>
  <!-- / footer -->
</section>

<!--main content end-->
</section>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/scripts.js"></script>
<script src="js/jquery.slimscroll.js"></script>
<script src="js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="js/jquery.scrollTo.js"></script>
</body>
</html>
