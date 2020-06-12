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

<div id="divcontent">
    <form action="loginServlet" method="post">
        <table width="900px" border="0" cellspacing="0">
            <tr>
                <td style="padding:30px;background-color: white">
                    <div style="height:470px">
                        <b>&nbsp;&nbsp;首页&nbsp;&raquo;&nbsp;用户登录</b>
                        <div style="background-color: white">
                            <table width="85%" border="0" cellspacing="0" style="background-color: white">
                                <tr style="background-color: white">
                                    <td style="background-color: white">
                                        <div style="margin: auto;vertical-align: middle;position: relative;margin:0 auto;margin-top: 60px;margin-left: 90px">
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">User Name</label>
                                                <input type="text" class="form-control" id="exampleInputEmail1" placeholder="用户名" name="username">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputPassword1">Password</label>
                                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="密码" name="password">
                                            </div>
<%--                                            <div class="form-group">--%>
<%--                                                <label for="exampleInputFile">File input</label>--%>
<%--                                                <input type="file" id="exampleInputFile">--%>
<%--                                                <p class="help-block">Example block-level help text here.</p>--%>
<%--                                            </div>--%>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox"> 记住密码
                                                </label>
                                            </div>
                                            <button type="submit" class="btn btn-default">login</button>

                                        </div>
<%--                                        <div id="logindiv" style="background-color: white">--%>
<%--                                            <table width="100%" border="0" cellspacing="0" style="background-color:white ">--%>

<%--                                                <tr style="background-color: white">--%>
<%--                                                    <td style="text-align:center; padding-top:20px; background-color: white">--%>
<%--                                                    </td>--%>
<%--                                                </tr>--%>
<%--                                                <tr style="background-color: white">--%>
<%--                                                    <td style="text-align:center;padding-top:20px;"><font--%>
<%--                                                            color="#ff0000">${requestScope["register_message"]}</font>--%>
<%--                                                    </td>--%>
<%--                                                </tr>--%>
<%--                                                <tr>--%>
<%--                                                    <td style="text-align:center">--%>
<%--                                                        <table width="80%" border="0" cellspacing="0"--%>
<%--                                                               style="margin-top:15px ;margin-left:auto; margin-right:auto">--%>
<%--                                                            <tr>--%>
<%--                                                                <td>--%>
<%--                                                                         <label for="exampleInputEmail1">UserName</label>--%>
<%--                                                                </td>--%>
<%--                                                                <td style="text-align:left">--%>
<%--                                                                    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="用户名">--%>
<%--                                                                </td>--%>

<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td style="text-align:right; padding-top:5px"><label for="exampleInputEmail1">Password</label></td>--%>
<%--                                                                <td style="text-align:left">    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="密码" name="password">--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td>--%>
<%--                                                                <label>--%>
<%--                                                                    <input type="checkbox" name="checkbox"> 记住密码--%>
<%--                                                                </label>--%>
<%--                                                                </td>--%>
<%--                                                                <td>--%>
<%--                                                                <label>--%>
<%--                                                                <input type="checkbox" name="checkbox"> 自动登陆--%>
<%--                                                                </label>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td colspan="2"--%>
<%--                                                                    style="padding-top:10px; text-align:center"><input--%>
<%--                                                                        name="image" type="image"--%>
<%--                                                                        onclick="return formcheck()"--%>
<%--                                                                        src="images/loginbutton.gif" width="83"--%>
<%--                                                                        height="22"/>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>

<%--                                                            <tr>--%>
<%--                                                                <td colspan="2" style="padding-top:10px"><img--%>
<%--                                                                        src="images/loginline.gif" width="241"--%>
<%--                                                                        height="10"/>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td colspan="2"--%>
<%--                                                                    style="padding-top:10px; text-align:center"><a--%>
<%--                                                                        href="register.jsp">注册成为新会员--%>
<%--                                                                </a></td>--%>
<%--                                                            </tr>--%>
<%--                                                        </table>--%>
<%--                                                            <table width="80%" border="0" cellspacing="0"--%>
<%--                                                                   style="margin-top:15px ;margin-left:auto; margin-right:auto">--%>
<%--                                                                <tr>--%>
<%--                                                                    <td--%>
<%--                                                                            style="text-align:right; padding-top:5px; width:25%">--%>
<%--                                                                        用户名：--%>
<%--                                                                    </td>--%>
<%--                                                                    <td style="text-align:left"><input name="username"--%>
<%--                                                                                                       type="text"--%>
<%--                                                                                                       class="textinput"/>--%>
<%--                                                                    </td>--%>
<%--                                                                </tr>--%>
<%--                                                                <tr>--%>
<%--                                                                    <td style="text-align:right; padding-top:5px">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>--%>
<%--                                                                    <td style="text-align:left"><input name="password"--%>
<%--                                                                                                       type="password"--%>
<%--                                                                                                       class="textinput"/>--%>
<%--                                                                    </td>--%>
<%--                                                                </tr>--%>
<%--                                                                <tr>--%>
<%--                                                                    <td colspan="2" style="text-align:center"><input--%>
<%--                                                                            type="checkbox" name="checkbox"--%>
<%--                                                                            value="checkbox"/>--%>
<%--                                                                        记住用户名&nbsp;&nbsp; <input type="checkbox"--%>
<%--                                                                                                 name="checkbox"--%>
<%--                                                                                                 value="checkbox"/> 自动登录--%>
<%--                                                                    </td>--%>
<%--                                                                </tr>--%>
<%--                                                                <tr>--%>
<%--                                                                    <td colspan="2"--%>
<%--                                                                        style="padding-top:10px; text-align:center"><input--%>
<%--                                                                            name="image" type="image"--%>
<%--                                                                            onclick="return formcheck()"--%>
<%--                                                                            src="images/loginbutton.gif" width="83"--%>
<%--                                                                            height="22"/>--%>
<%--                                                                    </td>--%>
<%--                                                                </tr>--%>

<%--                                                                <tr>--%>
<%--                                                                    <td colspan="2" style="padding-top:10px"><img--%>
<%--                                                                            src="images/loginline.gif" width="241"--%>
<%--                                                                            height="10"/>--%>
<%--                                                                    </td>--%>
<%--                                                                </tr>--%>
<%--                                                                <tr>--%>
<%--                                                                    <td colspan="2"--%>
<%--                                                                        style="padding-top:10px; text-align:center"><a--%>
<%--                                                                            href="register.jsp">注册成为新会员--%>
<%--                                                                    </a></td>--%>
<%--                                                                </tr>--%>
<%--                                                            </table>--%>
<%--    <form>--%>
<%--        <div class="form-group">--%>
<%--            <label for="exampleInputEmail1">Email address</label>--%>
<%--            <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="exampleInputPassword1">Password</label>--%>
<%--            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="exampleInputFile">File input</label>--%>
<%--            <input type="file" id="exampleInputFile">--%>
<%--            <p class="help-block">Example block-level help text here.</p>--%>
<%--        </div>--%>
<%--        <div class="checkbox">--%>
<%--            <label>--%>
<%--                <input type="checkbox"> Check me out--%>
<%--            </label>--%>
<%--        </div>--%>
<%--        <button type="submit" class="btn btn-default">Submit</button>--%>
<%--    </form>--%>

                                                    </td>
                                                </tr>
                                            </table>
                                        </div>
                                    </td>
<%--                                    <td style="text-align:left; padding-top:30px; width:60%"><h1>您还没有注册？</h1>--%>
<%--                                        <p>注册新会员，享受更优惠价格!</p>--%>
<%--                                        <p>千种图书，供你挑选！注册即享受丰富折扣和优惠，便宜有好货！超过万本图书任您选。</p>--%>
<%--                                        <p style="text-align:right">--%>
<%--                                            <a href="register.jsp"> 注册成为新会员</a>--%>
<%--                                        </p>--%>
<%--                                    </td>--%>
                                </tr>
                            </table>
                        </div>
                    </div>
                </td>
            </tr>
        </table>
    </form>
</div>


<jsp:include page="foot.jsp"/>


</body>
</html>


<%--                                                        <table width="80%" border="0" cellspacing="0"--%>
<%--                                                               style="margin-top:15px ;margin-left:auto; margin-right:auto">--%>
<%--                                                            <tr>--%>
<%--                                                                <td--%>
<%--                                                                        style="text-align:right; padding-top:5px; width:25%">--%>
<%--                                                                    用户名：--%>
<%--                                                                </td>--%>
<%--                                                                <td style="text-align:left"><input name="username"--%>
<%--                                                                                                   type="text"--%>
<%--                                                                                                   class="textinput"/>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td style="text-align:right; padding-top:5px">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>--%>
<%--                                                                <td style="text-align:left"><input name="password"--%>
<%--                                                                                                   type="password"--%>
<%--                                                                                                   class="textinput"/>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td colspan="2" style="text-align:center"><input--%>
<%--                                                                        type="checkbox" name="checkbox"--%>
<%--                                                                        value="checkbox"/>--%>
<%--                                                                    记住用户名&nbsp;&nbsp; <input type="checkbox"--%>
<%--                                                                                             name="checkbox"--%>
<%--                                                                                             value="checkbox"/> 自动登录--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td colspan="2"--%>
<%--                                                                    style="padding-top:10px; text-align:center"><input--%>
<%--                                                                        name="image" type="image"--%>
<%--                                                                        onclick="return formcheck()"--%>
<%--                                                                        src="images/loginbutton.gif" width="83"--%>
<%--                                                                        height="22"/>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>

<%--                                                            <tr>--%>
<%--                                                                <td colspan="2" style="padding-top:10px"><img--%>
<%--                                                                        src="images/loginline.gif" width="241"--%>
<%--                                                                        height="10"/>--%>
<%--                                                                </td>--%>
<%--                                                            </tr>--%>
<%--                                                            <tr>--%>
<%--                                                                <td colspan="2"--%>
<%--                                                                    style="padding-top:10px; text-align:center"><a--%>
<%--                                                                        href="register.jsp">注册成为新会员--%>
<%--                                                                </a></td>--%>
<%--                                                            </tr>--%>
<%--                                                        </table>--%>
