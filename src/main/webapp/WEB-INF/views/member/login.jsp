<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
    <head>
        <title>로그인</title>
    </head>
    <body>
        <c:import url="../default/header.jsp" />
        <div>
            <form action="loginCK" method="post">
                아이디 : <input type="text"><br><br>
                비밀번호 : <input type="text"><br><br>
                <input type="submit" value="로그인">
            </form>
        </div>
        <c:import url="../default/footer.jsp" />
    </body>
</html>
