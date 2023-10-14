<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
    <head>
        <title>인증사이트</title>
        <script type="text/javascript" src="/root/resources/member/js/emailCK.js"></script>
        <link href="/root/resources/member/css/emailCK.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    </head>
    <body>
        <h1>이메일 인증</h1>
        <hr>
        <h3>${userMail}</h3>
        <input type="hidden" value="${userMail}" id="email">
        <br>
        <button type="button" onclick="codeSend()">인증코드받기</button>
        <hr>
        <p>인증코드입력</p>
        <input type="text" id="emailCode"> <b>카운트넣기</b>
        <hr>
        <button type="button">확인</button>
        <button type="button">취소</button>
        <div id="codeView">

        </div>

    </body>
</html>
