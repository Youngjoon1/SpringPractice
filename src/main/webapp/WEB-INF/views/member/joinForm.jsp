<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
    <head>
        <title>회원가입</title>
        <link href="/root_war_exploded/resources/member/css/joinForm.css" rel="stylesheet">
    </head>
    <body>
        <c:import url="../default/header.jsp" />
            <div id="loginForm">
                <form action="join" method="post">
                    <table id="loginTable">
                        <tr>
                            <th>아이디 : </th>
                            <td><input type="text" name="id"></td>
                        </tr>

                        <tr>
                            <th>비밀번호 : </th>
                            <td><input type="password" name="pwd"></td>
                        </tr>

                        <tr>
                            <th>이름 : </th>
                            <td><input type="text" name="name"></td>
                        </tr>

                        <tr>
                            <th>전화 번호 : </th>
                            <td><input type="tel" name="tel"></td>
                        </tr>

                        <tr>
                            <th>지번 주소 : </th>
                            <td><input type=w"text" name="numberAddr"></td>
                        </tr>
                        <tr>
                            <th>도로명 주소 : </th>
                            <td><input type=w"text" name="roadAddr"></td>
                        </tr>
                        <tr>
                            <th>상세주소 : </th>
                            <td><input type=w"text" name="detailAddr"></td>
                        </tr>
                        <tr>
                            <th>이메일 : </th>
                            <td><input type="email" name="email"></td>
                        </tr>
                        <tr>
                            <th colspan="2">
                                <input type="submit" value="가입하기">
                            </th>
                        </tr>
                    </table>

                </form>
            </div>
        <c:import url="../default/footer.jsp" />
    </body>
</html>
