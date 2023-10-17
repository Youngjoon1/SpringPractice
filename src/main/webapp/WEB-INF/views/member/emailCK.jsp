<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>인증사이트</title>
        <link rel="stylesheet" href="<c:url value="/resources/member/css/emailCK.css"/>">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/member/js/emailCK.js"/>"></script>
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
        <input type="text" id="emailCode"> <b id="countLabel">유효시간</b> &nbsp; <b id="count"></b>
        <input type="hidden" id="CODE">
        <hr>
        <button type="button" onclick="checkCode()">확인</button>
        <button type="button" onclick="cancel()">취소</button>
    </body>
</html>
