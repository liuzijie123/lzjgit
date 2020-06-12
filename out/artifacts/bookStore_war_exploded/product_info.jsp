<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>电子书城</title>
    <link rel="stylesheet" href="css/main.css" type="text/css"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body class="main">

<jsp:include page="head.jsp"/>

<jsp:include page="menu_search.jsp"/>


<div id="divpagecontent">
    <table width="100%" border="0" cellspacing="0">
        <tr>

            <td>
                <div style="text-align:right; margin:5px 10px 5px 0px">
                    <a href="index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;<a
                        href="product_list.jsp">${p.category}</a>&nbsp;&nbsp;&nbsp;&nbsp;${p.name}&gt;&nbsp;&nbsp;&nbsp;&nbsp;
                </div>


                <table cellspacing="0" class="infocontent">
                    <tr>
                        <td>

                            <table width="100%%" border="0" cellspacing="0">
                                <tr>
                                    <td width="30%">

                                        <div class="divbookcover">
                                            <p>
                                                <img src="bookcover/${p.imgurl}"
                                                     width="213" height="269" border="0"/>
                                            </p>
                                        </div>

                                        <div style="text-align:center; margin-top:25px">
                                            <a href="${pageContext.request.contextPath}/addCartServlet?id=${p.id}">
                                                <img src="images/buybutton.gif" border="0"/>
                                            </a>
                                        </div>
                                    </td>
                                    <td style="padding:20px 5px 5px 5px"><img
                                            src="images/miniicon3.gif" width="16" height="13"/><font
                                            class="bookname">${p.name}</font>

                                        <hr/>
                                        售价：<font color="#FF0000">${p.price}</font>
                                        <hr/>
                                        类别：${p.category}

                                        <hr/>
                                        <p>
                                            <b>内容简介：${p.description}</b>
                                        </p> ${p.category} 经典书籍
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</div>


<jsp:include page="foot.jsp"/>


</body>
</html>
