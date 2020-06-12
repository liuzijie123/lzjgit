<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>在线支付</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>

<body>
<form action="/updatepaystate?id=${orders.id}" method="post">
    订单号：<INPUT TYPE="text" name="orderid" value="${orders.id}" readonly="readonly"> 支付金额：<INPUT
        TYPE="text" name="money" value="${orders.money}" readonly="readonly">元
    <div class="divBank">
        <div class="divText">选择网上银行</div>
        <div style="margin-left: 20px;">
            <div style="margin-bottom: 20px;">
                <input id="ICBC-NET-B2C" type="radio" name="yh"
                       value="ICBC-NET-B2C" checked="checked"/>
                <img
                        name="ICBC-NET-B2C" align="middle"
                        src="bank_img/icbc.bmp"/>
                <input
                        id="CMBCHINA-NET-B2C" type="radio" name="yh"
                        value="CMBCHINA-NET-B2C"/>
                <img name="CMBCHINA-NET-B2C"
                     align="middle" src="bank_img/cmb.bmp"/>
                <input
                        id="ABC-NET-B2C" type="radio" name="yh" value="ABC-NET-B2C"/>
                <img
                        name="ABC-NET-B2C" align="middle"
                        src="bank_img/abc.bmp"/>
                <input
                        id="CCB-NET-B2C" type="radio" name="yh" value="CCB-NET-B2C"/>
                <img
                        name="CCB-NET-B2C" align="middle"
                        src="bank_img/ccb.bmp"/>
            </div>

        </div>
        <div style="margin-bottom: 20px;">
            <input id="POST-NET-B2C" type="radio" name="yh"
                   value="POST-NET-B2C"/> <img name="POST-NET-B2C" align="middle"
                                               src="bank_img/post.bmp"/> <input
                id="BJRCB-NET-B2C" type="radio" name="yh" value="BJRCB-NET-B2C"/>
            <img name="BJRCB-NET-B2C" align="middle"
                 src="bank_img/beijingnongshang.bmp"/> <input
                id="HXB-NET-B2C" type="radio" name="yh" value="HXB-NET-B2C"/> <img
                name="HXB-NET-B2C" align="middle"
                src="bank_img/hx.bmp"/> <input id="CZ-NET-B2C"
                                               type="radio" name="yh" value="CZ-NET-B2C"/> <img
                name="CZ-NET-B2C" align="middle"
                src="bank_img/zheshang.bmp"/>
        </div>
    </div>
    <div style="margin: 40px;">
        <INPUT TYPE="submit" value="确定支付">
    </div>
    </div>
</form>
</body>
</html>
