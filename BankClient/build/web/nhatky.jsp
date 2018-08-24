    `1<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nhật Ký Giao Dịch</title>
         <style>
            .table{
                background-color: #bcdcea;
                margin: auto;
                padding: 5px;
                width: 90%;
            }
        </style>
        <script src="js/libs/modernizr.min.js"></script>
        <script src="js/libs/jquery-1.10.0.js"></script>
        <script src="js/libs/jquery-ui.min.js"></script>
        <script src="js/libs/bootstrap.min.js"></script>
        <link href="css/bootstrap.css" media="screen" rel="stylesheet">
        <link href="style.css" media="screen" rel="stylesheet">
        <script src="js/general.js"></script>
        <!--End template-->

        <!--Validate Boostrap 3-->
        <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/validate.css">
        <!--End Validate Boostrap 3-->
    </head>

    <body>
        <div class="container">
            <!--menu-->
                                    <h1 class="page-title">Payment History !</h1>

             <br/><br/><br/>
            <!--Form-->
            <form action="NhatKySevlet" method="POST" id="contact_form">
                <div class="nhatky">
                    <div class="field_text">

                        <div class="form-group form-group_fix">
                            Mã Đối Tác:
                            <input type="text" name="accID" placeholder="Nhập mã đối tác" class="form-control" />
                        </div>

                        <div class="form-group form-group_fix">
                            Mật Khẩu Đối Tác:
                            <input type="text" name="password" placeholder="Nhập mật khẩu đối tác" class="form-control" />
                        </div>
                    </div>
                    <div class="field_text">

                        <div class="form-group form-group_fix">
                            Bắt Đầu Từ Ngày:
                            <input type="date" name="beginDate" placeholder="Chọn ngày bắt đầu" class="form-control" />
                        </div>
                        <div class="form-group form-group_fix">
                            Đến Ngày:
                            <input type="date" name="endDate" placeholder="Đến ngày cuối" class="form-control" />
                        </div>
                    </div>
                </div>
                <center>
                    <span class="btn btn-large btn-green"><input type="submit" value="Truy Vấn" /></span>
                </center>
            </form>
            <!--endForm-->
            <br/>
            <!--messageSuccess-->
            <c:if test="${not empty message}">
                <div class="comment-list styled clearfix">
                    <ol>
                        <li class="comment">
                            <div class="comment-body">
                                 
                                 <div class="comment-text">
                                    <div class="comment-author clearfix">
                                        <a href="#" class="link-author">
                                            <font color="#bd1313">${requestScope.message}</font>
                                        </a>
                                    </div>

                                    <div class="comment-entry">
                                        <font color="#bd1353">
                                        <c:choose>
                                            <c:when test="${not empty items}">
                                                Mời bạn xem lịch sử giao dịch bên dưới
                                            </c:when>
                                            <c:otherwise> 
                                                Bạn chưa có lịch sử giao dịch
                                            </c:otherwise>
                                        </c:choose>
                                        </font>
                                    </div>

                                </div>
                                <div class="clear"></div>
                            </div>
                        </li>
                    </ol>
                </div>
            </c:if>
            <!--endMessageSuccess-->
            <!--messageSuccess-->
            <c:if test="${not empty error}">
                <div class="comment-list styled clearfix">
                    <ol>
                        <li class="comment">
                            <div class="comment-body">
                                <div class="comment-arrow"></div>
                                <div class="comment-avatar">
                                    <div class="avatar">
                                        <img src="images/agribank.png" alt=""/>
                                    </div>
                                </div>
                                <div class="comment-text">
                                    <div class="comment-author clearfix">
                                        <a href="#" class="link-author"><font color="#bd1313">${requestScope.error}</font></a>
                                    </div>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </li>
                    </ol>
                </div>
            </c:if>
            <!--endMessageSuccess-->

        </div>
        <!--endContainer-->
        <br/>
        <div class="bang_nhatky">
            <c:if test="${not empty items}">
                <table border="1" class="table table-hover" >
                    <tr>
                        <th>STT</th>
                        <th>Mã Khách Hàng</th>
                        <th>Mã Người Nhận</th>
                        <th>Mã Giao Dịch</th>
                        <th>Tên Giao Dịch</th>
                        <th>Tiền Giao Dịch </th>
                        <th>Phí Giao Dịch</th>
                        <th>Ngày Giao Dịch</th>
                    </tr>
                    <tbody>
                        <c:forEach var="it" items="${items}" varStatus="num">
                            <tr>
                                <td class="danger"><c:out value="${num.count}"/></td>
                                <td class="active"><c:out value="${it.accID}"/></td>
                                <td class="info"><c:out value="${it.accIDReceive}"/></td>
                                <td class="success"><c:out value="${it.transID }"/></td>
                                <td class="warning"><c:out value="${it.transName}"/></td>
                                <td class="danger"> <fmt:formatNumber value="${it.transMoney}" type="currency" currencySymbol="VNĐ" pattern="#,##0 ¤;-#,##0 ¤"/> </td>
                                <td class="success"><fmt:formatNumber value="${it.transPostage}" type="currency" currencySymbol="VNĐ" pattern="#,##0 ¤;-#,##0 ¤"/></td>
                                <td class="warning">${it.dateOfTrans}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>

        <!--Validate Boostrap 3-->
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>

        <script src="js/validate.js"></script>
        <!--End Boostrap 3-->
    </body>
</html>
