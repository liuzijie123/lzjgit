<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>完美书城首页</title>
    <link rel="stylesheet" href="css/main.css" type="text/css"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script type="text/javascript" src="js/my.js">

    </script>
</head>

<body class="main" onload="startSecond()">

<jsp:include page="head.jsp"/>
<jsp:include page="menu_search.jsp"/>
<div id="divcontent">
    <table width="850px" border="0" cellspacing="0">
        <tr>
            <td style="padding:30px; text-align:center">
                <table width="60%"
                       border="0" cellspacing="0" style="margin-top:70px">
                    <tr>
                        <td style="width:98px"><img
                                src="images/IconTexto_WebDev_009.jpg" width="128" height="128"/>
                        </td>
                        <td style="padding-top:30px"><font
                                style="font-weight:bold; color:#FF0000">用户信息修改成功，请重新登录</font><br/> <br/>
                            <a href="index.html"><span id="second">5</span>秒后自动为您转跳回首页</a></td>
                    </tr>
                </table>
                <h1>&nbsp;</h1></td>
        </tr>
    </table>
</div>


<jsp:include page="foot.jsp"/>


</body>
</html>