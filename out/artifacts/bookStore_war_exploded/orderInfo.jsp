<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <title>Two Brother</title>
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
                    <a href="index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;;订单详细信息
                </div>
                <table cellspacing="0" class="infocontent">
                    <tr>
                        <td>
                            <table width="100%" border="0" cellspacing="0">
                                <tr>
                                    <td>
                                        <p>订单编号:</p></td>
                                </tr>
                                <tr>
                                    <td>
                                        <table cellspacing="1" class="carttable">
                                            <tr>
                                                <td width="10%">序号</td>
                                                <td width="40%">商品名称</td>
                                                <td width="10%">价格</td>
                                                <td width="10%">数量</td>
                                                <td width="10%">小计</td>

                                            </tr>
                                        </table>

                                        <table width="100%" border="0" cellspacing="0">
                                            <%--													<c:set var="sum" value="0"></c:set>--%>
                                            <c:forEach items="${os}" var="o" varStatus="index">
                                                <tr>
                                                    <td width="10%">${index.index+1}</td>
                                                    <td width="40%">${o.productsList.name}</td>
                                                    <td width="10%">${o.productsList.price}</td>
                                                    <td width="10%">${o.orderitems.buynum}</td>
                                                    <td width="10%">${o.productsList.price*o.orderitems.buynum}</td>
                                                        <%--														<c:set var="sum" value="${o.productsList.price*b.value}"></c:set>--%>
                                                </tr>
                                            </c:forEach>

                                        </table>


                                        <table cellspacing="1" class="carttable">
                                            <tr>
                                                <td style="text-align:right; padding-right:40px;"><font
                                                        style="color:#FF0000">合计：&nbsp;&nbsp;${os.get(0).money}</font>
                                                </td>
                                            </tr>
                                        </table>

                                        <p>
                                            收货地址：${os.get(0).receiverAddress}&nbsp;&nbsp;&nbsp;&nbsp;<br/>
                                            收货人：&nbsp;&nbsp;&nbsp;&nbsp;${os.get(0).receiverName}&nbsp;&nbsp;&nbsp;&nbsp;<br/>
                                            联系方式：${os.get(0).receiverPhone}&nbsp;&nbsp;&nbsp;&nbsp;

                                        </p>
                                        <hr>
                                        <p style="text-align:right">
                                            <a href="pay.jsp"><img src="images/gif53_029.gif" width="204"
                                                                   height="51" border="0"/> </a>
                                        </p>
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
