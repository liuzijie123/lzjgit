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
<script type="text/javascript">
    function myFunction(id, num, totalNum) {
        num = parseInt(num);
        totalNum = parseInt(totalNum);
        if (num < 1) {
            if (confirm("是否删除此商品?")) {
                num = 0;
            } else {
                num = 1;
            }
        }
        if (num > totalNum) {
            alert("库存不足")
            num = totalNum;
        }
        location.href = "changeNumServlet?id=" + id + "&&num=" + num + "&&totalNum=" + totalNum;
    }

</script>

<div id="divpagecontent">
    <table width="100%" border="0" cellspacing="0">
        <tr>

            <td>
                <div style="text-align:right; margin:5px 10px 5px 0px">
                    <a href="index.html">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;购物车
                </div>

                <table cellspacing="0" class="infocontent">
                    <tr>
                        <td>
                            <table width="100%" border="0" cellspacing="0">
                                <tr>
                                    <td>
<%--                                        <img src="images/buy1.gif" width="635" height="38"/>--%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <table cellspacing="1" class="carttable">
                                            <tr>
                                                <td width="10%">序号</td>
                                                <td width="30%">商品名称</td>
                                                <td width="10%">价格</td>
                                                <td width="20%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量</td>
                                                <td width="10%">库存</td>
                                                <td width="10%">小计</td>
                                                <td width="10%">取消</td>
                                            </tr>


                                        </table>
                                        <c:set var="sum" value="0"></c:set>
                                        <c:forEach items="${byProduct}" varStatus="indexs" var="cartItem">
                                            <table width="100%" border="0" cellspacing="0">
                                                <tr>
                                                    <td width="10%">${indexs.count}</td>
                                                    <td width="30%">${cartItem.key.name}</td>

                                                    <td width="10%">${cartItem.key.price}</td>
                                                    <td width="20%">
                                                        <input type="button" value='-'
                                                               style="width:20px"
                                                               onclick="myFunction('${cartItem.key.id}','${cartItem.value-1}','${cartItem.key.pnum}');">

                                                        <input name="text" type="text" value=${cartItem.value}
                                                                style="width:40px;text-align:center"/>
                                                            <%-- 通过session值拿到响应返回的map集合,对数量的加减操作，拿到要操作的id,数量通过map的value拿到，和库存--%>
                                                        <input type="button" value='+' style="width:20px"
                                                               onclick="myFunction('${cartItem.key.id}',
                                                                       '${cartItem.value+1}','${cartItem.key.pnum}');">

                                                    </td>
                                                    <td width="10%">${cartItem.key.pnum}</td>
                                                    <td width="10%">${cartItem.key.price*cartItem.value}</td>

                                                    <td width="10%"><a
                                                            href="javascript:deleteBook('${cartItem.key.id}')"
                                                            style="color:#ff0000; font-weight:bold">X</a></td>
                                                        <%--                                                        <a href="javascript:deleteBook('${cartItem.key}')">删除</a>--%>
                                                </tr>
                                            </table>
                                            <c:set var="sum" value="${sum+cartItem.key.price*cartItem.value}"></c:set>
                                        </c:forEach>


                                        <table cellspacing="1" class="carttable">
                                            <tr>
                                                <td style="text-align:right; padding-right:40px;"><font
                                                        style="color:#FF6600; font-weight:bold">合计：&nbsp;${sum}&nbsp;元</font>
                                                </td>
                                            </tr>
                                        </table>

                                        <div style="text-align:right; margin-top:10px">
                                            <a
                                                    href="product_list.jsp"><img
                                                    src="images/gwc_jx.gif" border="0"/> </a>

                                            &nbsp;&nbsp;&nbsp;&nbsp;<a
                                                href="order.jsp"><img
                                                src="images/gwc_buy.gif" border="0"/> </a>
                                        </div>
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
