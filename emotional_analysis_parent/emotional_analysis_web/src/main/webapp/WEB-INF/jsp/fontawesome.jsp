<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
<title>Fontawesome</title>
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
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>UI Elements</span>
                    </a>
                    <ul class="sub">
						<li><a href="typography.html">Typography</a></li>
						<li><a href="glyphicon.html">glyphicon</a></li>
                        <li><a href="grids.html">Grids</a></li>
                    </ul>
                </li>
                <li>
                    <a class="active" href="fontawesome.html">
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
		<div class="wthree-font-awesome">
			<div class="grid_3 grid_4 w3_agileits_icons_page">
						<div class="icons">
							<h2 class="w3ls_head">Font Awesome Icons</h2>
							<section id="new">
								<h3 class="page-header page-header icon-subheading">30 New Icons </h3>							  

								<div class="row fontawesome-icon-list">
									
									
									<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-asl-interpreting" aria-hidden="true"></i> fa-asl-interpreting <span class="text-muted">(alias)</span></a></div>
									
									
									
									<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-audio-description" aria-hidden="true"></i> fa-audio-description</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-blind" aria-hidden="true"></i> fa-blind</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-braille" aria-hidden="true"></i> fa-braille</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-deaf" aria-hidden="true"></i> fa-deaf</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-deafness" aria-hidden="true"></i> deafness <span class="text-muted">(alias)</span></a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-envira" aria-hidden="true"></i> fa-envira</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-fa" aria-hidden="true"></i> fa-fa <span class="text-muted">(alias)</span></a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-first-order" aria-hidden="true"></i> fa-first-order</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-font-awesome" aria-hidden="true"></i> fa-font-awesome</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-gitlab" aria-hidden="true"></i> fa-gitlab</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-glide" aria-hidden="true"></i> fa-glide</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-glide-g" aria-hidden="true"></i> fa-glide-g</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-google-plus-circle" aria-hidden="true"></i> fa-google-plus-circle <span class="text-muted">(alias)</span></a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-google-plus-official" aria-hidden="true"></i> fa-google-plus-official</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-hard-of-hearing" aria-hidden="true"></i> fa-hard-of-hearing <span class="text-muted">(alias)</span></a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-instagram" aria-hidden="true"></i> fa-instagram</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-low-vision" aria-hidden="true"></i> fa-low-vision</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-pied-piper" aria-hidden="true"></i> fa-pied-piper</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-question-circle-o" aria-hidden="true"></i> fa-question-circle-o</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-sign-language" aria-hidden="true"></i> fa-sign-language</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-signing" aria-hidden="true"></i> fa-signing <span class="text-muted">(alias)</span></a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-snapchat" aria-hidden="true"></i> fa-snapchat</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-snapchat-ghost" aria-hidden="true"></i> fa-snapchat-ghost</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-snapchat-square" aria-hidden="true"></i> fa-snapchat-square</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-themeisle" aria-hidden="true"></i> fa-themeisle</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-universal-access" aria-hidden="true"></i> fa-universal-access</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-viadeo" aria-hidden="true"></i> fa-viadeo</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-viadeo-square" aria-hidden="true"></i> fa-viadeo-square</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-volume-control-phone" aria-hidden="true"></i> fa-volume-control-phone</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-wheelchair-alt" aria-hidden="true"></i> fa-wheelchair-alt</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-wpbeginner" aria-hidden="true"></i> fa-wpbeginner</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-wpforms" aria-hidden="true"></i> fa-wpforms</a></div>
									
									  <div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-yoast" aria-hidden="true"></i> fa-yoast</a></div>
									
								  </div>

								</section>
							<div class="section group">
									<div class="box"> 
										<div class="title ">
											<h3 class="page-header icon-subheading">Web Application Icons</h3>
										</div>
										<div class="box_content"> 
											<div class="fontawesome-icon-list"> 
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-adjust"></i> fa-adjust</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-anchor"></i> fa-anchor</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-archive"></i> fa-archive</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-arrows"></i> fa-arrows</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-arrows-h"></i> fa-arrows-h</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-arrows-v"></i> fa-arrows-v</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-asterisk"></i> fa-asterisk</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-ban"></i> fa-ban</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bar-chart-o"></i> fa-bar-chart-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-barcode"></i> fa-barcode</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bars"></i> fa-bars</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-beer"></i> fa-beer</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bell"></i> fa-bell</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bell-o"></i> fa-bell-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bolt"></i> fa-bolt</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-book"></i> fa-book</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bookmark"></i> fa-bookmark</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bookmark-o"></i> fa-bookmark-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-briefcase"></i> fa-briefcase</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bug"></i> fa-bug</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-building-o"></i> fa-building-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bullhorn"></i> fa-bullhorn</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-bullseye"></i> fa-bullseye</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-calendar"></i> fa-calendar</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-calendar-o"></i> fa-calendar-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-camera"></i> fa-camera</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-camera-retro"></i> fa-camera-retro</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-caret-square-o-down"></i> fa-caret-square-o-down</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-caret-square-o-left"></i> fa-caret-square-o-left</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-caret-square-o-right"></i> fa-caret-square-o-right</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-caret-square-o-up"></i> fa-caret-square-o-up</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-certificate"></i> fa-certificate</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-check"></i> fa-check</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-check-circle"></i> fa-check-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-check-circle-o"></i> fa-check-circle-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-check-square"></i> fa-check-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-check-square-o"></i> fa-check-square-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-circle"></i> fa-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-circle-o"></i> fa-circle-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-clock-o"></i> fa-clock-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-cloud"></i> fa-cloud</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-cloud-download"></i> fa-cloud-download</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-cloud-upload"></i> fa-cloud-upload</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-code"></i> fa-code</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-code-fork"></i> fa-code-fork</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-coffee"></i> fa-coffee</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-cog"></i> fa-cog</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-cogs"></i> fa-cogs</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-comment"></i> fa-comment</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-comment-o"></i> fa-comment-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-comments"></i> fa-comments</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-comments-o"></i> fa-comments-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-compass"></i> fa-compass</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-credit-card"></i> fa-credit-card</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-crop"></i> fa-crop</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-crosshairs"></i> fa-crosshairs</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-cutlery"></i> fa-cutlery</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-dashboard"></i> fa-dashboard <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-desktop"></i> fa-desktop</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-dot-circle-o"></i> fa-dot-circle-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-download"></i> fa-download</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-edit"></i> fa-edit <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-ellipsis-h"></i> fa-ellipsis-h</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-ellipsis-v"></i> fa-ellipsis-v</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-envelope"></i> fa-envelope</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-envelope-o"></i> fa-envelope-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-eraser"></i> fa-eraser</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-exchange"></i> fa-exchange</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-exclamation"></i> fa-exclamation</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-exclamation-circle"></i> fa-exclamation-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-exclamation-triangle"></i> fa-exclamation-triangle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-external-link"></i> fa-external-link</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-external-link-square"></i> fa-external-link-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-eye"></i> fa-eye</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-eye-slash"></i> fa-eye-slash</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-female"></i> fa-female</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-fighter-jet"></i> fa-fighter-jet</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-film"></i> fa-film</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-filter"></i> fa-filter</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-fire"></i> fa-fire</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-fire-extinguisher"></i> fa-fire-extinguisher</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-flag"></i> fa-flag</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-flag-checkered"></i> fa-flag-checkered</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-flag-o"></i> fa-flag-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-flash"></i> fa-flash <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-flask"></i> fa-flask</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-folder"></i> fa-folder</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-folder-o"></i> fa-folder-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-folder-open"></i> fa-folder-open</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-folder-open-o"></i> fa-folder-open-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-frown-o"></i> fa-frown-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-gamepad"></i> fa-gamepad</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-gavel"></i> fa-gavel</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-gear"></i> fa-gear <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-gears"></i> fa-gears <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-gift"></i> fa-gift</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-glass"></i> fa-glass</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-globe"></i> fa-globe</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-group"></i> fa-group <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-hdd-o"></i> fa-hdd-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-headphones"></i> fa-headphones</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-heart"></i> fa-heart</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-heart-o"></i> fa-heart-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-home"></i> fa-home</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-inbox"></i> fa-inbox</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#"><i class="fa fa-info"></i> fa-info</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#info-circle"><i class="fa fa-info-circle"></i> fa-info-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#key"><i class="fa fa-key"></i> fa-key</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#keyboard-o"><i class="fa fa-keyboard-o"></i> fa-keyboard-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#laptop"><i class="fa fa-laptop"></i> fa-laptop</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#leaf"><i class="fa fa-leaf"></i> fa-leaf</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#gavel"><i class="fa fa-legal"></i> fa-legal <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#lemon-o"><i class="fa fa-lemon-o"></i> fa-lemon-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#level-down"><i class="fa fa-level-down"></i> fa-level-down</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#level-up"><i class="fa fa-level-up"></i> fa-level-up</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#lightbulb-o"><i class="fa fa-lightbulb-o"></i> fa-lightbulb-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#location-arrow"><i class="fa fa-location-arrow"></i> fa-location-arrow</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#lock"><i class="fa fa-lock"></i> fa-lock</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#magic"><i class="fa fa-magic"></i> fa-magic</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#magnet"><i class="fa fa-magnet"></i> fa-magnet</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#share"><i class="fa fa-mail-forward"></i> fa-mail-forward <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#reply"><i class="fa fa-mail-reply"></i> fa-mail-reply <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#mail-reply-all"><i class="fa fa-mail-reply-all"></i> fa-mail-reply-all</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#male"><i class="fa fa-male"></i> fa-male</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#map-marker"><i class="fa fa-map-marker"></i> fa-map-marker</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#meh-o"><i class="fa fa-meh-o"></i> fa-meh-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#microphone"><i class="fa fa-microphone"></i> fa-microphone</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#microphone-slash"><i class="fa fa-microphone-slash"></i> fa-microphone-slash</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#minus"><i class="fa fa-minus"></i> fa-minus</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#minus-circle"><i class="fa fa-minus-circle"></i> fa-minus-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#minus-square"><i class="fa fa-minus-square"></i> fa-minus-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#minus-square-o"><i class="fa fa-minus-square-o"></i> fa-minus-square-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#mobile"><i class="fa fa-mobile"></i> fa-mobile</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#mobile"><i class="fa fa-mobile-phone"></i> fa-mobile-phone <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#money"><i class="fa fa-money"></i> fa-money</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#moon-o"><i class="fa fa-moon-o"></i> fa-moon-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#music"><i class="fa fa-music"></i> fa-music</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pencil"><i class="fa fa-pencil"></i> fa-pencil</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pencil-square"><i class="fa fa-pencil-square"></i> fa-pencil-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pencil-square-o"><i class="fa fa-pencil-square-o"></i> fa-pencil-square-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#phone"><i class="fa fa-phone"></i> fa-phone</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#phone-square"><i class="fa fa-phone-square"></i> fa-phone-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#picture-o"><i class="fa fa-picture-o"></i> fa-picture-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plane"><i class="fa fa-plane"></i> fa-plane</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus"><i class="fa fa-plus"></i> fa-plus</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus-circle"><i class="fa fa-plus-circle"></i> fa-plus-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus-square"><i class="fa fa-plus-square"></i> fa-plus-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus-square-o"><i class="fa fa-plus-square-o"></i> fa-plus-square-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#power-off"><i class="fa fa-power-off"></i> fa-power-off</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#print"><i class="fa fa-print"></i> fa-print</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#puzzle-piece"><i class="fa fa-puzzle-piece"></i> fa-puzzle-piece</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#qrcode"><i class="fa fa-qrcode"></i> fa-qrcode</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#question"><i class="fa fa-question"></i> fa-question</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#question-circle"><i class="fa fa-question-circle"></i> fa-question-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#quote-left"><i class="fa fa-quote-left"></i> fa-quote-left</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#quote-right"><i class="fa fa-quote-right"></i> fa-quote-right</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#random"><i class="fa fa-random"></i> fa-random</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#refresh"><i class="fa fa-refresh"></i> fa-refresh</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#reply"><i class="fa fa-reply"></i> fa-reply</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#reply-all"><i class="fa fa-reply-all"></i> fa-reply-all</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#retweet"><i class="fa fa-retweet"></i> fa-retweet</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#road"><i class="fa fa-road"></i> fa-road</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#rocket"><i class="fa fa-rocket"></i> fa-rocket</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#rss"><i class="fa fa-rss"></i> fa-rss</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#rss-square"><i class="fa fa-rss-square"></i> fa-rss-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#search"><i class="fa fa-search"></i> fa-search</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#search-minus"><i class="fa fa-search-minus"></i> fa-search-minus</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#search-plus"><i class="fa fa-search-plus"></i> fa-search-plus</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#share"><i class="fa fa-share"></i> fa-share</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#share-square"><i class="fa fa-share-square"></i> fa-share-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#share-square-o"><i class="fa fa-share-square-o"></i> fa-share-square-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#shield"><i class="fa fa-shield"></i> fa-shield</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#shopping-cart"><i class="fa fa-shopping-cart"></i> fa-shopping-cart</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sign-in"><i class="fa fa-sign-in"></i> fa-sign-in</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sign-out"><i class="fa fa-sign-out"></i> fa-sign-out</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#signal"><i class="fa fa-signal"></i> fa-signal</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sitemap"><i class="fa fa-sitemap"></i> fa-sitemap</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#smile-o"><i class="fa fa-smile-o"></i> fa-smile-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort"><i class="fa fa-sort"></i> fa-sort</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-alpha-asc"><i class="fa fa-sort-alpha-asc"></i> fa-sort-alpha-asc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-alpha-desc"><i class="fa fa-sort-alpha-desc"></i> fa-sort-alpha-desc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-amount-asc"><i class="fa fa-sort-amount-asc"></i> fa-sort-amount-asc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-amount-desc"><i class="fa fa-sort-amount-desc"></i> fa-sort-amount-desc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-asc"><i class="fa fa-sort-asc"></i> fa-sort-asc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-desc"><i class="fa fa-sort-desc"></i> fa-sort-desc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-asc"><i class="fa fa-sort-down"></i> fa-sort-down <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-numeric-asc"><i class="fa fa-sort-numeric-asc"></i> fa-sort-numeric-asc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-numeric-desc"><i class="fa fa-sort-numeric-desc"></i> fa-sort-numeric-desc</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort-desc"><i class="fa fa-sort-up"></i> fa-sort-up <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#spinner"><i class="fa fa-spinner"></i> fa-spinner</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#square"><i class="fa fa-square"></i> fa-square</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#square-o"><i class="fa fa-square-o"></i> fa-square-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#star"><i class="fa fa-star"></i> fa-star</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#star-half"><i class="fa fa-star-half"></i> fa-star-half</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#star-half-o"><i class="fa fa-star-half-empty"></i> fa-star-half-empty <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#star-half-o"><i class="fa fa-star-half-full"></i> fa-star-half-full <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#star-half-o"><i class="fa fa-star-half-o"></i> fa-star-half-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#star-o"><i class="fa fa-star-o"></i> fa-star-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#subscript"><i class="fa fa-subscript"></i> fa-subscript</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#suitcase"><i class="fa fa-suitcase"></i> fa-suitcase</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sun-o"><i class="fa fa-sun-o"></i> fa-sun-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#superscript"><i class="fa fa-superscript"></i> fa-superscript</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tablet"><i class="fa fa-tablet"></i> fa-tablet</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tachometer"><i class="fa fa-tachometer"></i> fa-tachometer</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tag"><i class="fa fa-tag"></i> fa-tag</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tags"><i class="fa fa-tags"></i> fa-tags</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tasks"><i class="fa fa-tasks"></i> fa-tasks</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#terminal"><i class="fa fa-terminal"></i> fa-terminal</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#thumb-tack"><i class="fa fa-thumb-tack"></i> fa-thumb-tack</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#thumbs-down"><i class="fa fa-thumbs-down"></i> fa-thumbs-down</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#thumbs-o-down"><i class="fa fa-thumbs-o-down"></i> fa-thumbs-o-down</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#thumbs-o-up"><i class="fa fa-thumbs-o-up"></i> fa-thumbs-o-up</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#thumbs-up"><i class="fa fa-thumbs-up"></i> fa-thumbs-up</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#ticket"><i class="fa fa-ticket"></i> fa-ticket</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#times"><i class="fa fa-times"></i> fa-times</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#times-circle"><i class="fa fa-times-circle"></i> fa-times-circle</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#times-circle-o"><i class="fa fa-times-circle-o"></i> fa-times-circle-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tint"><i class="fa fa-tint"></i> fa-tint</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-down"><i class="fa fa-toggle-down"></i> fa-toggle-down <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-left"><i class="fa fa-toggle-left"></i> fa-toggle-left <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-right"><i class="fa fa-toggle-right"></i> fa-toggle-right <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-up"><i class="fa fa-toggle-up"></i> fa-toggle-up <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#trash-o"><i class="fa fa-trash-o"></i> fa-trash-o</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#trophy"><i class="fa fa-trophy"></i> fa-trophy</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#truck"><i class="fa fa-truck"></i> fa-truck</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#umbrella"><i class="fa fa-umbrella"></i> fa-umbrella</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#unlock"><i class="fa fa-unlock"></i> fa-unlock</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#unlock-alt"><i class="fa fa-unlock-alt"></i> fa-unlock-alt</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#sort"><i class="fa fa-unsorted"></i> fa-unsorted <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#upload"><i class="fa fa-upload"></i> fa-upload</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#user"><i class="fa fa-user"></i> fa-user</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#users"><i class="fa fa-users"></i> fa-users</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#video-camera"><i class="fa fa-video-camera"></i> fa-video-camera</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#volume-down"><i class="fa fa-volume-down"></i> fa-volume-down</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#volume-off"><i class="fa fa-volume-off"></i> fa-volume-off</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#volume-up"><i class="fa fa-volume-up"></i> fa-volume-up</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#exclamation-triangle"><i class="fa fa-warning"></i> fa-warning <span class="text-muted">(alias)</span></a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#wheelchair"><i class="fa fa-wheelchair"></i> fa-wheelchair</a></div>
										
												<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#wrench"><i class="fa fa-wrench"></i> fa-wrench</a></div>
												<div class="clearfix"></div>
											</div> 
											<div class="title margin-top">
												<h3 class="page-header icon-subheading">Form Control Icons</h3>
											</div>
											<div class="box_content">
												<div class="fontawesome-icon-list"> 
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#check-square"><i class="fa fa-check-square"></i> fa-check-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#check-square-o"><i class="fa fa-check-square-o"></i> fa-check-square-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#circle"><i class="fa fa-circle"></i> fa-circle</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#circle-o"><i class="fa fa-circle-o"></i> fa-circle-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#dot-circle-o"><i class="fa fa-dot-circle-o"></i> fa-dot-circle-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#minus-square"><i class="fa fa-minus-square"></i> fa-minus-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#minus-square-o"><i class="fa fa-minus-square-o"></i> fa-minus-square-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus-square"><i class="fa fa-plus-square"></i> fa-plus-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus-square-o"><i class="fa fa-plus-square-o"></i> fa-plus-square-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#square"><i class="fa fa-square"></i> fa-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#square-o"><i class="fa fa-square-o"></i> fa-square-o</a></div>
													<div class="clearfix"></div>
												</div>
											</div> 
											<div class="title  margin-top">
												<h3 class="page-header icon-subheading">Currency Icons</h3>
											</div>
											<div class="box_content">
												<div class="fontawesome-icon-list">
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#btc"><i class="fa fa-bitcoin"></i> fa-bitcoin <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#btc"><i class="fa fa-btc"></i> fa-btc</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#jpy"><i class="fa fa-cny"></i> fa-cny <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#usd"><i class="fa fa-dollar"></i> fa-dollar <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#eur"><i class="fa fa-eur"></i> fa-eur</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#eur"><i class="fa fa-euro"></i> fa-euro <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#gbp"><i class="fa fa-gbp"></i> fa-gbp</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#inr"><i class="fa fa-inr"></i> fa-inr</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#jpy"><i class="fa fa-jpy"></i> fa-jpy</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#krw"><i class="fa fa-krw"></i> fa-krw</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#money"><i class="fa fa-money"></i> fa-money</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#jpy"><i class="fa fa-rmb"></i> fa-rmb <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#rub"><i class="fa fa-rouble"></i> fa-rouble <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#rub"><i class="fa fa-rub"></i> fa-rub</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#rub"><i class="fa fa-ruble"></i> fa-ruble <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#inr"><i class="fa fa-rupee"></i> fa-rupee <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#try"><i class="fa fa-try"></i> fa-try</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#try"><i class="fa fa-turkish-lira"></i> fa-turkish-lira <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#usd"><i class="fa fa-usd"></i> fa-usd</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#krw"><i class="fa fa-won"></i> fa-won <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#jpy"><i class="fa fa-yen"></i> fa-yen <span class="text-muted">(alias)</span></a></div>
													<div class="clearfix"></div>
												</div>
											</div> 
											<div class="title margin-top">
												 <h3 class="page-header icon-subheading">Text Editor Icons</h3>
											</div>
											<div class="box_content">
												<div class="fontawesome-icon-list">
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#align-center"><i class="fa fa-align-center"></i> fa-align-center</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#align-justify"><i class="fa fa-align-justify"></i> fa-align-justify</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#align-left"><i class="fa fa-align-left"></i> fa-align-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#align-right"><i class="fa fa-align-right"></i> fa-align-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#bold"><i class="fa fa-bold"></i> fa-bold</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#link"><i class="fa fa-chain"></i> fa-chain <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chain-broken"><i class="fa fa-chain-broken"></i> fa-chain-broken</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#clipboard"><i class="fa fa-clipboard"></i> fa-clipboard</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#columns"><i class="fa fa-columns"></i> fa-columns</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#files-o"><i class="fa fa-copy"></i> fa-copy <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#scissors"><i class="fa fa-cut"></i> fa-cut <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#outdent"><i class="fa fa-dedent"></i> fa-dedent <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#eraser"><i class="fa fa-eraser"></i> fa-eraser</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#file"><i class="fa fa-file"></i> fa-file</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#file-o"><i class="fa fa-file-o"></i> fa-file-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#file-text"><i class="fa fa-file-text"></i> fa-file-text</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#file-text-o"><i class="fa fa-file-text-o"></i> fa-file-text-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#files-o"><i class="fa fa-files-o"></i> fa-files-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#floppy-o"><i class="fa fa-floppy-o"></i> fa-floppy-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#font"><i class="fa fa-font"></i> fa-font</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#indent"><i class="fa fa-indent"></i> fa-indent</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#italic"><i class="fa fa-italic"></i> fa-italic</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#link"><i class="fa fa-link"></i> fa-link</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#list"><i class="fa fa-list"></i> fa-list</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#list-alt"><i class="fa fa-list-alt"></i> fa-list-alt</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#list-ol"><i class="fa fa-list-ol"></i> fa-list-ol</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#list-ul"><i class="fa fa-list-ul"></i> fa-list-ul</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#outdent"><i class="fa fa-outdent"></i> fa-outdent</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#paperclip"><i class="fa fa-paperclip"></i> fa-paperclip</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#clipboard"><i class="fa fa-paste"></i> fa-paste <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#repeat"><i class="fa fa-repeat"></i> fa-repeat</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#undo"><i class="fa fa-rotate-left"></i> fa-rotate-left <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#repeat"><i class="fa fa-rotate-right"></i> fa-rotate-right <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#floppy-o"><i class="fa fa-save"></i> fa-save <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#scissors"><i class="fa fa-scissors"></i> fa-scissors</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#strikethrough"><i class="fa fa-strikethrough"></i> fa-strikethrough</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#table"><i class="fa fa-table"></i> fa-table</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#text-height"><i class="fa fa-text-height"></i> fa-text-height</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#text-width"><i class="fa fa-text-width"></i> fa-text-width</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#th"><i class="fa fa-th"></i> fa-th</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#th-large"><i class="fa fa-th-large"></i> fa-th-large</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#th-list"><i class="fa fa-th-list"></i> fa-th-list</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#underline"><i class="fa fa-underline"></i> fa-underline</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#undo"><i class="fa fa-undo"></i> fa-undo</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chain-broken"><i class="fa fa-unlink"></i> fa-unlink <span class="text-muted">(alias)</span></a></div>
													<div class="clearfix"></div>
												</div>
											</div> 
											<div class="title margin-top">
												<h3 class="page-header icon-subheading">Directional Icons</h3>
											</div>
											<div class="box_content">
												<div class="fontawesome-icon-list">
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-double-down"><i class="fa fa-angle-double-down"></i> fa-angle-double-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-double-left"><i class="fa fa-angle-double-left"></i> fa-angle-double-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-double-right"><i class="fa fa-angle-double-right"></i> fa-angle-double-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-double-up"><i class="fa fa-angle-double-up"></i> fa-angle-double-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-down"><i class="fa fa-angle-down"></i> fa-angle-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-left"><i class="fa fa-angle-left"></i> fa-angle-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-right"><i class="fa fa-angle-right"></i> fa-angle-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#angle-up"><i class="fa fa-angle-up"></i> fa-angle-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-down"><i class="fa fa-arrow-circle-down"></i> fa-arrow-circle-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-left"><i class="fa fa-arrow-circle-left"></i> fa-arrow-circle-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-o-down"><i class="fa fa-arrow-circle-o-down"></i> fa-arrow-circle-o-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-o-left"><i class="fa fa-arrow-circle-o-left"></i> fa-arrow-circle-o-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-o-right"><i class="fa fa-arrow-circle-o-right"></i> fa-arrow-circle-o-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-o-up"><i class="fa fa-arrow-circle-o-up"></i> fa-arrow-circle-o-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-right"><i class="fa fa-arrow-circle-right"></i> fa-arrow-circle-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-circle-up"><i class="fa fa-arrow-circle-up"></i> fa-arrow-circle-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-down"><i class="fa fa-arrow-down"></i> fa-arrow-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-left"><i class="fa fa-arrow-left"></i> fa-arrow-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-right"><i class="fa fa-arrow-right"></i> fa-arrow-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrow-up"><i class="fa fa-arrow-up"></i> fa-arrow-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrows"><i class="fa fa-arrows"></i> fa-arrows</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrows-alt"><i class="fa fa-arrows-alt"></i> fa-arrows-alt</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrows-h"><i class="fa fa-arrows-h"></i> fa-arrows-h</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrows-v"><i class="fa fa-arrows-v"></i> fa-arrows-v</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-down"><i class="fa fa-caret-down"></i> fa-caret-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-left"><i class="fa fa-caret-left"></i> fa-caret-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-right"><i class="fa fa-caret-right"></i> fa-caret-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-down"><i class="fa fa-caret-square-o-down"></i> fa-caret-square-o-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-left"><i class="fa fa-caret-square-o-left"></i> fa-caret-square-o-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-right"><i class="fa fa-caret-square-o-right"></i> fa-caret-square-o-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-up"><i class="fa fa-caret-square-o-up"></i> fa-caret-square-o-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-up"><i class="fa fa-caret-up"></i> fa-caret-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-circle-down"><i class="fa fa-chevron-circle-down"></i> fa-chevron-circle-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-circle-left"><i class="fa fa-chevron-circle-left"></i> fa-chevron-circle-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-circle-right"><i class="fa fa-chevron-circle-right"></i> fa-chevron-circle-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-circle-up"><i class="fa fa-chevron-circle-up"></i> fa-chevron-circle-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-down"><i class="fa fa-chevron-down"></i> fa-chevron-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-left"><i class="fa fa-chevron-left"></i> fa-chevron-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-right"><i class="fa fa-chevron-right"></i> fa-chevron-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#chevron-up"><i class="fa fa-chevron-up"></i> fa-chevron-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#hand-o-down"><i class="fa fa-hand-o-down"></i> fa-hand-o-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#hand-o-left"><i class="fa fa-hand-o-left"></i> fa-hand-o-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#hand-o-right"><i class="fa fa-hand-o-right"></i> fa-hand-o-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#hand-o-up"><i class="fa fa-hand-o-up"></i> fa-hand-o-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#long-arrow-down"><i class="fa fa-long-arrow-down"></i> fa-long-arrow-down</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#long-arrow-left"><i class="fa fa-long-arrow-left"></i> fa-long-arrow-left</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#long-arrow-right"><i class="fa fa-long-arrow-right"></i> fa-long-arrow-right</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#long-arrow-up"><i class="fa fa-long-arrow-up"></i> fa-long-arrow-up</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-down"><i class="fa fa-toggle-down"></i> fa-toggle-down <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-left"><i class="fa fa-toggle-left"></i> fa-toggle-left <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-right"><i class="fa fa-toggle-right"></i> fa-toggle-right <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#caret-square-o-up"><i class="fa fa-toggle-up"></i> fa-toggle-up <span class="text-muted">(alias)</span></a></div>
													<div class="clearfix"></div>
												</div>
											</div>	
										   
											<div class="title margin-top">
												 <h3 class="page-header icon-subheading">Video Player Icons</h3>
											</div>
										   <div class="box_content">
											<div class="fontawesome-icon-list">
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#arrows-alt"><i class="fa fa-arrows-alt"></i> fa-arrows-alt</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#backward"><i class="fa fa-backward"></i> fa-backward</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#compress"><i class="fa fa-compress"></i> fa-compress</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#eject"><i class="fa fa-eject"></i> fa-eject</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#expand"><i class="fa fa-expand"></i> fa-expand</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#fast-backward"><i class="fa fa-fast-backward"></i> fa-fast-backward</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#fast-forward"><i class="fa fa-fast-forward"></i> fa-fast-forward</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#forward"><i class="fa fa-forward"></i> fa-forward</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pause"><i class="fa fa-pause"></i> fa-pause</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#play"><i class="fa fa-play"></i> fa-play</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#play-circle"><i class="fa fa-play-circle"></i> fa-play-circle</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#play-circle-o"><i class="fa fa-play-circle-o"></i> fa-play-circle-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#step-backward"><i class="fa fa-step-backward"></i> fa-step-backward</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#step-forward"><i class="fa fa-step-forward"></i> fa-step-forward</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#stop"><i class="fa fa-stop"></i> fa-stop</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#youtube-play"><i class="fa fa-youtube-play"></i> fa-youtube-play</a></div>
													<div class="clearfix"></div>
												</div>
											</div> 
											<div class="title margin-top">
												<h3 class="page-header icon-subheading">Brand Icons</h3>
											</div>
											<div class="box_content">
												<div class="fontawesome-icon-list">
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#adn"><i class="fa fa-adn"></i> fa-adn</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#android"><i class="fa fa-android"></i> fa-android</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#apple"><i class="fa fa-apple"></i> fa-apple</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#bitbucket"><i class="fa fa-bitbucket"></i> fa-bitbucket</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#bitbucket-square"><i class="fa fa-bitbucket-square"></i> fa-bitbucket-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#btc"><i class="fa fa-bitcoin"></i> fa-bitcoin <span class="text-muted">(alias)</span></a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#btc"><i class="fa fa-btc"></i> fa-btc</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#css3"><i class="fa fa-css3"></i> fa-css3</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#dribbble"><i class="fa fa-dribbble"></i> fa-dribbble</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#dropbox"><i class="fa fa-dropbox"></i> fa-dropbox</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#facebook"><i class="fa fa-facebook"></i> fa-facebook</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#facebook-square"><i class="fa fa-facebook-square"></i> fa-facebook-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#flickr"><i class="fa fa-flickr"></i> fa-flickr</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#foursquare"><i class="fa fa-foursquare"></i> fa-foursquare</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#github"><i class="fa fa-github"></i> fa-github</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#github-alt"><i class="fa fa-github-alt"></i> fa-github-alt</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#github-square"><i class="fa fa-github-square"></i> fa-github-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#gittip"><i class="fa fa-gittip"></i> fa-gittip</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#google-plus"><i class="fa fa-google-plus"></i> fa-google-plus</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#google-plus-square"><i class="fa fa-google-plus-square"></i> fa-google-plus-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#html5"><i class="fa fa-html5"></i> fa-html5</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#instagram"><i class="fa fa-instagram"></i> fa-instagram</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#linkedin"><i class="fa fa-linkedin"></i> fa-linkedin</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#linkedin-square"><i class="fa fa-linkedin-square"></i> fa-linkedin-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#linux"><i class="fa fa-linux"></i> fa-linux</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#maxcdn"><i class="fa fa-maxcdn"></i> fa-maxcdn</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pagelines"><i class="fa fa-pagelines"></i> fa-pagelines</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pinterest"><i class="fa fa-pinterest"></i> fa-pinterest</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#pinterest-square"><i class="fa fa-pinterest-square"></i> fa-pinterest-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#renren"><i class="fa fa-renren"></i> fa-renren</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#skype"><i class="fa fa-skype"></i> fa-skype</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#stack-exchange"><i class="fa fa-stack-exchange"></i> fa-stack-exchange</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#stack-overflow"><i class="fa fa-stack-overflow"></i> fa-stack-overflow</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#trello"><i class="fa fa-trello"></i> fa-trello</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tumblr"><i class="fa fa-tumblr"></i> fa-tumblr</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#tumblr-square"><i class="fa fa-tumblr-square"></i> fa-tumblr-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#twitter"><i class="fa fa-twitter"></i> fa-twitter</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#twitter-square"><i class="fa fa-twitter-square"></i> fa-twitter-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#vimeo-square"><i class="fa fa-vimeo-square"></i> fa-vimeo-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#vk"><i class="fa fa-vk"></i> fa-vk</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#weibo"><i class="fa fa-weibo"></i> fa-weibo</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#windows"><i class="fa fa-windows"></i> fa-windows</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#xing"><i class="fa fa-xing"></i> fa-xing</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#xing-square"><i class="fa fa-xing-square"></i> fa-xing-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#youtube"><i class="fa fa-youtube"></i> fa-youtube</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#youtube-play"><i class="fa fa-youtube-play"></i> fa-youtube-play</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#youtube-square"><i class="fa fa-youtube-square"></i> fa-youtube-square</a></div>
													<div class="clearfix"></div>
												</div>
											</div> 
											<div class="title margin-top">
												<h3 class="page-header icon-subheading">Medical Icons</h3>
											</div>
											<div class="box_content">
												<div class="fontawesome-icon-list">
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#ambulance"><i class="fa fa-ambulance"></i> fa-ambulance</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#h-square"><i class="fa fa-h-square"></i> fa-h-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#hospital-o"><i class="fa fa-hospital-o"></i> fa-hospital-o</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#medkit"><i class="fa fa-medkit"></i> fa-medkit</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#plus-square"><i class="fa fa-plus-square"></i> fa-plus-square</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#stethoscope"><i class="fa fa-stethoscope"></i> fa-stethoscope</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#user-md"><i class="fa fa-user-md"></i> fa-user-md</a></div>
									
													<div class="icon-box col-md-3 col-sm-4"><a class="agile-icon" href="#wheelchair"><i class="fa fa-wheelchair"></i> fa-wheelchair</a></div>
													<div class="clearfix"></div>
												</div>
											</div>   
										</div>
									</div>
							</div> 
						</div>
					</div>
		</div>
		
</section>
<!-- footer -->
	<div class="footer">
		<div class="wthree-copyright">
			<p>Copyright &copy; 2017.Company name All rights reserved.</p>
		</div>
	</div>
<!-- //footer -->
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
