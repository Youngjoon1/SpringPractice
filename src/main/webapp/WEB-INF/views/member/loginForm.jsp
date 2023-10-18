<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>로그인</title>
        <link rel="stylesheet" href="<c:url value="/resources/member/css/loginForm.css"/>">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/member/js/loginForm.js"/>"></script>
    </head>
    <body>
        <c:import url="../default/header.jsp" />
        <div id="loginFormContainer">
            <form action="login" method="post" id="loginForm">
                <table id="loginTable">
                    <tr>
                        <th>아이디</th>
                        <td><label>
                            <input type="text" name="id" id="idInput">
                        </label></td>
                    </tr>
                    <tr>
                        <th>비밀 번호</th>
                        <td><label>
                            <input type="text" name="pwd" id="pwdInput">
                        </label></td>
                    </tr>
                    <tr>
                        <th colspan="2"><input type="submit" value="로그인" id="loginSubmit"></th>
                    </tr>
                </table>
            </form>
        </div>
        <c:import url="../default/footer.jsp" />
    </body>
</html>
