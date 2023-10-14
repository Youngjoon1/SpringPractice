<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
    <title>인증사이트</title>
    <script src="/root/resource"> </script>
</head>
<body>
    <h1>이메일 인증</h1>
    <h3>${ckEmail}</h3><br>
    <p>인증코드입력</p>
    <input type="text" id="emailCode">


    <button type="button">인증하기</button>
</body>
</html>
