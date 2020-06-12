<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>完美书城注册页面</title>
    <%--导入css --%>
    <link rel="stylesheet" href="css/main.css" type="text/css"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function changeImage() {
            document.getElementById("img").src = "${pageContext.request.contextPath}/imageCode?time="
                + new Date().getTime();
        }
    </script>
</head>


<body class="main">
<%@include file="head.jsp" %>
<%--导入头 --%>
<%@include file="menu_search.jsp" %>
<%--导入导航条与搜索 --%>

<div id="divcontent" style="background-color: white;border: 0px">
    <form action="${pageContext.request.contextPath}/register"
          method="post" style="background-color: white" id="">
        <table width="850px" border="0" cellspacing="0" style="background-color: white">
            <tr>
                <td style="padding:30px; color: #000;">
                    <h2>Register <small>欢迎来到Two Brother,带给你一个不一样的电商网</small></h2>
                    <br /><br /><br /><br />
                    <table width="70%" border="0" cellspacing="2" class="upline">
                        <tr>
                            <td style="text-align:right; width:10%"><label for="inputEmail1" class="col-sm-2 control-label">Email</label></td>
                            <td style="width:40%">
                                <input type="email" class="form-control" id="inputEmail1" placeholder="Email" style="text-align:right; width:70%" name="email"></td>
                            <td><font color="#999999">请输入有效的邮箱地址</font></td>

                        </tr>
                        <tr>
                            <td style="text-align:right; width:10%" ><label for="inputName" class="col-sm-2 control-label">UserName</label></td>
                            <td>
                                <input type="text" class="form-control" id="inputName" placeholder="用户名" style="text-align:right; width:70%" name="username">
                            </td>
                            <td><font color="#999999">用户名设置至少6位</font></td>
                        </tr>
                        <tr>
                            <td style="text-align:right; width:10%"><label for="inputPassword" class="col-sm-2 control-label">PassWord</label></td>
                            <td><input type="password" class="form-control" id="inputPassword" placeholder="密码" style="text-align:right; width:70%" name="password"></td>
                            <td><font color="#999999">密码设置至少8位</font></td>
                        </tr>
                        <tr>
                            <td style="text-align:right; width:10%"><label for="inputPasswordRe" class="col-sm-2 control-label">RepeatPassword</label></td>
                            <td><input type="password" class="form-control" id="inputPasswordRe" placeholder="重复密码" style="text-align:right; width:70%" name="repassword"></td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td style="text-align:right; width:10%"><label class="col-sm-2 control-label">Sex</label></td>
                            <td colspan="2">&nbsp;&nbsp;<input type="radio" name="gender" id="inlineRadio1" value="男" checked="checked"> 男
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       <input type="radio" name="gender" id="inlineRadio2" value="女"> 女
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right; width:10%"><label for="inputTel" class="col-sm-2 control-label">Tel</label></td>
                            <td colspan="2"><input type="text" class="form-control" id="inputTel" placeholder="联系电话" style="text-align:right; width:70%" name="telephone"></td>
                        </tr>
                        <tr>
                            <td style="text-align:right;width:10%"><label for="inputTel" class="col-sm-2 control-label">SelfIntroduction</label></td>
                            <td colspan="2"><textarea class="form-control" name="introduce" style="width:70%"></textarea>
                            </td>
                        </tr>
                    </table>
                    <table width="70%" border="0" cellspacing="0">
                        <tr>
                            <td style="padding-top:20px; text-align:center">
<%--                                <input--%>
<%--                                    type="image" src="images/signup.gif" name="submit" border="0">--%>
                                <button type="submit" class="btn btn-default">提交</button>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </form>

</div>


<div id="divfoot" style="background-color: lightgoldenrodyellow; position: fixed;bottom: 0px;">
    <table width="100%" border="0" cellspacing="0" >
        <tr>
            <td rowspan="2" style="width:10%"></td>
            <td style="padding-top:5px; padding-left:50px;background-color: lightgoldenrodyellow"></td>
        </tr>
        <tr>
            <td style="padding-left:50px"><font color="#CCCCCC"><b>Copyright © 2017-2020 twoBrother.com 两兄弟电商网</b> </font></td>
        </tr>
    </table>
<%--    <div class="form-group">--%>
<%--        <label for="exampleInputEmail1">Email address</label>--%>
<%--        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label for="exampleInputPassword1">Password</label>--%>
<%--        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label for="exampleInputFile">File input</label>--%>
<%--        <input type="file" id="exampleInputFile">--%>
<%--        <p class="help-block">Example block-level help text here.</p>--%>
<%--    </div>--%>
<%--    <div class="checkbox">--%>
<%--        <label>--%>
<%--            <input type="checkbox"> Check me out--%>
<%--        </label>--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-default">Submit</button>--%>
</div>


</body>
</html>
<%--<table width="70%" border="0" cellspacing="2" class="upline">--%>
<%--    <tr>--%>
<%--        <td style="text-align:right; width:10%"><label for="inputEmail1" class="col-sm-2 control-label">Email</label></td>--%>
<%--        <td style="width:40%">--%>
<%--            <input type="email" class="form-control" id="inputEmail1" placeholder="Email" style="text-align:right; width:70%" name="email"></td>--%>
<%--        <td><font color="#999999">请输入有效的邮箱地址</font></td>--%>

<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right">会员名：</td>--%>
<%--        <td>--%>
<%--            <input type="text" class="textinput" name="username"/>--%>
<%--        </td>--%>
<%--        <td><font color="#999999">用户名设置至少6位</font></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right">密码：</td>--%>
<%--        <td><input type="password" class="textinput"--%>
<%--                   name="password"/></td>--%>
<%--        <td><font color="#999999">密码设置至少6位</font></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right">重复密码：</td>--%>
<%--        <td><input type="password" class="textinput"--%>
<%--                   name="repassword"/></td>--%>
<%--        <td>&nbsp;</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right">性别：</td>--%>
<%--        <td colspan="2">&nbsp;&nbsp;<input type="radio"--%>
<%--                                           name="gender" value="男" checked="checked"/> 男--%>
<%--            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"--%>
<%--                                                             name="gender" value="女"/> 女--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right">联系电话：</td>--%>
<%--        <td colspan="2"><input type="text" class="textinput"--%>
<%--                               style="width:350px" name="telephone"/></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right">个人介绍：</td>--%>
<%--        <td colspan="2"><textarea class="textarea" name="introduce"></textarea>--%>
<%--        </td>--%>
<%--    </tr>--%>

<%--</table>--%>
<%--<h1>注册校验</h1>--%>
<%--<table width="80%" border="0" cellspacing="2" class="upline">--%>
<%--    <tr>--%>
<%--        <td style="text-align:right; width:20%">输入校验码：</td>--%>
<%--        <td style="width:50%"><input type="text" class="textinput" name="authcode"/>--%>
<%--        </td>--%>
<%--        <td>&nbsp;</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td style="text-align:right;width:20%;">&nbsp;</td>--%>
<%--        <td colspan="2" style="width:50%"><img--%>
<%--                src="${pageContext.request.contextPath}/imageCode" width="180"--%>
<%--                height="30" class="textinput" style="height:30px;" id="img"/>&nbsp;&nbsp;--%>
<%--            <a href="javascript:void(0);" onclick="changeImage()">看不清换一张</a>--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--</table>--%>
