<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


    <title>完美书城列表</title>
    <%--导入css --%>
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
                    <a href="index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;<a
                        href="product_list.jsp">${p.category}</a>&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;商品列表
                </div>

                <table cellspacing="0" class="listcontent">
                    <tr>
                        <td>
                            <h1>商品目录</h1>
                            <hr/>
                            <h1></h1>&nbsp;&nbsp;&nbsp;&nbsp;共${pd.totalCount}种商品
                            <hr/>
                            <div style="margin-top:20px; margin-bottom:5px">
                                <img src="images/productlist.gif" width="100%" height="38"/>
                            </div>
                            <table cellspacing="0" class="booklist">
                                <tr>
                                    <c:forEach items="${pd.bean}" var="products">
                                        <td>
                                            <div class="divbookpic">
                                                <p>
                                                    <a href="${pageContext.request.contextPath}/FindProductByIdServlet?id=${products.id}">
                                                        <img src="bookcover/${products.imgurl}" width="115"
                                                             height="129" border="0"/> </a>
                                                </p>
                                            </div>

                                            <div class="divlisttitle">

                                                <a href="${pageContext.request.contextPath}/FindProductByIdServlet?id=${products.id}">书名:${products.name}<br/>售价:${products.price}
                                                </a>
                                            </div>
                                        </td>
                                    </c:forEach>
                                </tr>
                            </table>

                            <center>
                                <c:if test="${pd.currPage!=1}">
                                    <a href="showProductByPage?currPage=1&category=${pd.bean[0].category}">[首页]</a>
                                    <a href="showProductByPage?currPage=${pd.currPage-1 }&category=${pd.bean[0].category}">[上一页]</a>
                                </c:if>

                                <c:forEach begin="1" end="${pd.totalPage }" var="n">

                                    <c:if test="${pd.currPage==n }">
                                        ${n}
                                    </c:if>
                                    <c:if test="${pd.currPage!=n }">
                                        <a href="showProductByPage?currPage=${n}&category=${pd.bean[0].category}">${n}</a>
                                    </c:if>

                                </c:forEach>
                                <c:if test="${pd.currPage!=pd.totalPage }">
                                    <a href="showProductByPage?currPage=${pd.currPage+1}&category=${pd.bean[0].category}">[下一页]</a>
                                    <a href="showProductByPage?currPage=${pd.totalPage}&category=${pd.bean[0].category}">[尾页]</a>
                                </c:if>
                            </center>
                            第${pd.currPage}页/共${pd.totalPage}页
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
