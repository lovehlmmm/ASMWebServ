<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thanh Toán Giao Dịch</title>

        <link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/vendor/linearicons/style.css">
        <link rel="stylesheet" href="assets/vendor/metisMenu/metisMenu.css">
        <link rel="stylesheet" href="assets/vendor/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css">
        <link rel="stylesheet" href="assets/vendor/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="assets/vendor/chartist-plugin-tooltip/chartist-plugin-tooltip.css">
        <link rel="stylesheet" href="assets/vendor/toastr/toastr.min.css">
        <!-- MAIN CSS -->
        <link rel="stylesheet" href="assets/css/main.css">
        <!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
        <link rel="stylesheet" href="assets/css/demo.css">

        <!-- ICONS -->
        <link href="http://www.iconarchive.com/download/i94066/graphicloads/polygon/bank.ico" rel="shortcut icon">

        <!-- main JS libs -->
        <script src="js/libs/modernizr.min.js"></script>
        <script src="js/libs/jquery-1.10.0.js"></script>
        <script src="js/libs/jquery-ui.min.js"></script>
        <script src="js/libs/bootstrap.min.js"></script>
        <!-- Style CSS -->

        <script src="js/general.js"></script>
        <!--End template-->

        <!--Validate Boostrap 3-->
        <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/validate.css">

        <!--End Validate Boostrap 3-->
    </head>
    <body>
        <!-- WRAPPER -->
        <div id="wrapper">
            <!-- NAVBAR -->
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container-fluid">
                    <div class="navbar-btn">
                        <button type="button" class="btn-toggle-offcanvas"><i class="lnr lnr-menu"></i></button>
                    </div>
                    <!-- logo -->
                    <div class="navbar-brand">
                        <a href="index.html"><img src="assets/img/logo.png" alt="DiffDash Logo" class="img-responsive logo"></a>
                    </div>
                    <!-- end logo -->
                    <div class="navbar-right">
                        <!-- search form -->
                        <form id="navbar-search" class="navbar-form search-form">
                            <input value="" class="form-control" placeholder="Search here..." type="text">
                            <button type="button" class="btn btn-default"><i class="fa fa-search"></i></button>
                        </form>
                        <!-- end search form -->
                        <!-- navbar menu -->
                        <div id="navbar-menu">
                            <ul class="nav navbar-nav">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                        <i class="lnr lnr-alarm"></i>
                                        <span class="notification-dot"></span>
                                    </a>
                                    <ul class="dropdown-menu notifications">
                                        <li class="header"><strong>You have 7 new notifications</strong></li>
                                        <li>
                                            <a href="#">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <i class="fa fa-fw fa-flag-checkered text-muted"></i>
                                                    </div>
                                                    <div class="media-body">
                                                        <p class="text">Your campaign <strong>Holiday Sale</strong> is starting to engage potential customers.</p>
                                                        <span class="timestamp">24 minutes ago</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <i class="fa fa-fw fa-exclamation-triangle text-warning"></i>
                                                    </div>
                                                    <div class="media-body">
                                                        <p class="text">Campaign <strong>Holiday Sale</strong> is nearly reach budget limit.</p>
                                                        <span class="timestamp">2 hours ago</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <i class="fa fa-fw fa-bar-chart text-muted"></i>
                                                    </div>
                                                    <div class="media-body">
                                                        <p class="text">Website visits from Facebook is 27% higher than last week.</p>
                                                        <span class="timestamp">Yesterday</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <i class="fa fa-fw fa-check-circle text-success"></i>
                                                    </div>
                                                    <div class="media-body">
                                                        <p class="text">Your campaign <strong>Holiday Sale</strong> is approved.</p>
                                                        <span class="timestamp">2 days ago</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <i class="fa fa-fw fa-exclamation-circle text-danger"></i>
                                                    </div>
                                                    <div class="media-body">
                                                        <p class="text">Error on website analytics configurations</p>
                                                        <span class="timestamp">3 days ago</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li class="footer"><a href="#" class="more">See all notifications</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                        <i class="lnr lnr-cog"></i>
                                    </a>
                                    <ul class="dropdown-menu user-menu menu-icon">
                                        <li class="menu-heading">ACCOUNT SETTINGS</li>
                                        <li><a href="#"><i class="fa fa-fw fa-edit"></i> <span>Basic</span></a></li>
                                        <li><a href="#"><i class="fa fa-fw fa-bell"></i> <span>Notifications</span></a></li>
                                        <li><a href="#"><i class="fa fa-fw fa-sliders"></i> <span>Preferences</span></a></li>
                                        <li><a href="#"><i class="fa fa-fw fa-lock"></i> <span>Privacy</span></a></li>
                                        <li class="menu-heading">BILLING</li>
                                        <li><a href="#"><i class="fa fa-fw fa-file-text-o"></i> <span>Invoices</span></a></li>
                                        <li><a href="#"><i class="fa fa-fw fa-credit-card"></i> <span>Payments</span></a></li>
                                        <li><a href="#"><i class="fa fa-fw fa-refresh"></i> <span>Renewals</span></a></li>
                                        <li class="menu-button">
                                            <a href="#" class="btn btn-primary"><i class="fa fa-rocket"></i> UPGRADE PLAN</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                        <i class="lnr lnr-question-circle"></i>
                                    </a>
                                    <ul class="dropdown-menu user-menu">
                                        <li>
                                            <form class="search-form help-search-form">
                                                <input value="" class="form-control" placeholder="How can we help?" type="text">
                                                <button type="button" class="btn btn-default"><i class="fa fa-search"></i></button>
                                            </form>
                                        </li>
                                        <li class="menu-heading">HOW-TO</li>
                                        <li><a href="#">Setting up Campaign</a></li>
                                        <li><a href="#">Understanding Website Analytics</a></li>
                                        <li><a href="#">Boost Your Sales</a></li>
                                        <li><a href="#">Knowing Your Audience</a></li>
                                        <li class="menu-heading">ACCOUNT</li>
                                        <li><a href="#">Change Password</a></li>
                                        <li><a href="#">Privacy &amp; Security</a></li>
                                        <li><a href="#">Membership</a></li>
                                        <li class="menu-heading">BILLING</li>
                                        <li><a href="#">Setup Payment</a></li>
                                        <li><a href="#">Auto-Renewal Program</a></li>
                                        <li><a href="#">Cancellation</a></li>
                                        <li class="menu-button">
                                            <a href="#" class="btn btn-primary"><i class="fa fa-question-circle"></i> HELP CENTER</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <!-- end navbar menu -->
                    </div>
                </div>
            </nav>
            <!-- END NAVBAR -->
            <!-- LEFT SIDEBAR -->
            <div id="left-sidebar" class="sidebar">
                <button type="button" class="btn btn-xs btn-link btn-toggle-fullwidth">
                    <span class="sr-only">Toggle Fullwidth</span>
                    <i class="fa fa-angle-left"></i>
                </button>
                <div class="sidebar-scroll">
                    <div class="user-account">
                        <img src="assets/img/meo1.jpg" class="img-responsive img-circle user-photo" alt="User Profile Picture">
                        <div class="dropdown">
                            <a href="#" class="dropdown-toggle user-name" data-toggle="dropdown">Hello, <strong>Admin</strong> <i class="fa fa-caret-down"></i></a>
                            <ul class="dropdown-menu dropdown-menu-right account">
                                <li><a href="#">My Profile</a></li>
                                <li><a href="#">Messages</a></li>
                                <li><a href="#">Settings</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Logout</a></li>
                            </ul>
                        </div>
                    </div>
                    <nav id="left-sidebar-nav" class="sidebar-nav">
                        <ul id="main-menu" class="metismenu">
                            <li class="active"><a href="index.html"><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
                            <li class="" ></li> <a href="nhatky.jsp">&nbsp;&nbsp;<i class="fa fa-fw fa-credit-card"></i><span>&nbsp;&nbsp;&nbsp;&nbsp; Payments History</span></a></li>

                        </ul>
                    </nav>
                </div>
            </div>
            <!-- END LEFT SIDEBAR -->
            <!-- MAIN CONTENT -->
            <div id="main-content">
                <div class="container-fluid">
                    <div class="section-heading">
                        <h1 class="page-title">Payment Transaction !</h1>
                    </div>
                    <!--end menu-->
                    <div class="row">
                        <div class="col-md-6">
                            <div class="panel-content">
                                <!--table + form-->
                                <c:if test="${not empty message or error}">
                                    <!--Note-->
                                    <div class="comment-list styled clearfix">
                                        <ol>
                                            <li class="comment">
                                                <div class="comment-body">
                                                    <div class="comment-text">
                                                        <div class="comment-author clearfix">
                                                            <a href="#" class="link-author"> 
                                                                <c:if test="${not empty message}">
                                                                    <font size="120" color="#42ef23"><c:out value="${requestScope.message}"/></font>
                                                                </c:if>
                                                            </a>
                                                        </div>
                                                        <div class="comment-entry">
                                                            <c:if test="${not empty error }">
                                                                <font size="120" color="#bd1318"  ><c:out value="${requestScope.error}"/></font>
                                                            </c:if>
                                                        </div>
                                                    </div>
                                                    <div class="clear"></div>
                                                </div>
                                            </li>
                                        </ol>
                                    </div>
                                </c:if>
                                <form action="GiaoDichServlet" method="Post" id="contact_form">
                                    <div class="field_text">
                                        <div class="form-group form-group_fix">
                                            Mã Đối Tác:
                                            <input type="text" name="accID" placeholder="Nhập mã đối tác" class="form-control" />
                                        </div>

                                        <div class="form-group form-group_fix">
                                            Mật Khẩu của bạn: 
                                            <input type="text" name="password" placeholder="Nhập mật khẩu đối tác" class="form-control" />
                                        </div>
                                        <div class="form-group form-group_fix">
                                            Ghi chú giao dịch: 
                                            <input type="text" name="transName" value="Chuyen Tien" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="field_text omega ">
                                        <div class="form-group form-group_fix">
                                            Mã người nhận : 
                                            <input type="text" id="ma_khtt" name="accIDReceive" placeholder="Nhập Mã Người Nhận Thanh Toán" class="form-control" />
                                            <span id="ma_khtt-result"/>
                                        </div>
                                        <div class="form-group form-group_fix">
                                            Số tiền gửi : 
                                            <input type="text" name="transMoney" placeholder="Nhập Số Tiền Đơn Hàng" class="form-control" />
                                        </div>
                                        <!--checkbox-->
                                        <div class="form-group form-group_fix">
                                            <br />
                                            <label class="fancy-radio">
                                                <input type="radio" name="transPostage" value="phi_bengui"  required data-parsley-errors-container="#error-radio">
                                                <span><i></i>Người gửi chịu phí.</span>
                                            </label>
                                            &nbsp;&nbsp;&nbsp;
                                            <label class="fancy-radio">
                                                <input type="radio" name="transPostage" value="phi_bennhan">
                                                <span><i></i>Người nhận chịu phí</span>
                                            </label>
                                            <p id="error-radio"></p>
                                        </div>
                                    </div>

                                    <br>
                                    <button type="submit" class="btn btn-primary">Hoàn tất giao dịch</button>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Validate Boostrap 3-->
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>

        <script src="js/validate.js"></script>
        <!--End Boostrap 3-->
    </body>
</html>