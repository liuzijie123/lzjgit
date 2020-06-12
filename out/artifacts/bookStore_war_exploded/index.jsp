<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Two Brother</title>
    <%--导入css --%>
    <link rel="stylesheet" href="css/main.css" type="text/css"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body class="main">

<%@include file="head.jsp" %>
<%@include file="menu_search.jsp" %>
<div class="jumbotron">
    <h1>欢迎来到 Two Brother!</h1>
    <p>我们的服务宗旨是:为客户省时、省力、省钱。
        </p>

</div>
<h3>本周热卖商品</h3>
<div id="divcontent">
    <table width="900px" border="0" cellspacing="0">
        <div class="row">
            <div class="col-xs-6 col-md-3">
                <a href="#" class="thumbnail">
                    <img src="images/3501BACC-9D18-4BE9-AB14-0782B877E7F9.png" alt="...">
                    可充电 卡通小台灯
                </a>
            </div>
            <div class="col-xs-6 col-md-3">
                <a href="#" class="thumbnail">
                    <img src="images/2.png" alt="...">
                    收纳盒厨房置物架3层
                </a>

            </div>
            <div class="col-xs-6 col-md-3">
                <a href="#" class="thumbnail">
                    <img src="images/3.png" alt="...">
                    304不锈钢刨玉米神器创意厨房小工具套装
                </a>
            </div>
            <div class="col-xs-6 col-md-3">
                <a href="#" class="thumbnail">
                    <img src="images/4.png" alt="...">
                    头皮控油 头皮舒缓 强韧防断发
                </a>
            </div>
        </div>
<%--        <tr>--%>
<%--            <td width="497"><img src="images/billboard.gif" width="497"--%>
<%--                                 height="38"/>--%>

<%--            <td style="padding:5px 15px 10px 40px">--%>
<%--                <table width="100%"--%>
<%--                       border="0" cellspacing="0">--%>
<%--                    <tr>--%>
<%--                        <td><img src="images/hottitle.gif" width="126" height="29"/>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
<%--                </table>--%>
<%--                <table width="100%" border="0" cellspacing="0">--%>
<%--                    <tr>--%>
<%--                        <td style="width:50px; text-align:center"><a href="info.html"><img--%>
<%--                                src="bookcover/105.jpg" width="102" height="130"--%>
<%--                                border="0"/> </a><br/> <a href="info.html">培育男孩<br/>--%>
<%--                            作者:Lonley Plant</a></td>--%>
<%--                        <td style="width:50px; text-align:center"><a href="info.html"><img--%>
<%--                                src="bookcover/TS1.jpg" width="102" height="130" border="0"/>--%>
<%--                        </a><br/> <a href="info.html">.Net入门经典(JDK5) <br/> 作者:(美)霍顿</a>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
<%--                </table>--%>
<%--            </td>--%>
<%--        </tr>--%>
    </table>
</div>


<jsp:include page="foot.jsp"/>


</body>
</html>
