<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
    <head>
        <title>회원가입</title>
        <link href="/root/resources/member/css/joinForm.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
        <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
        <script type="text/javascript" src="/root/resources/member/js/joinForm.js"></script>
    </head>
    <body>
        <c:import url="../default/header.jsp" />
            <div id="loginForm">
                <form action="join" method="post">
                    <table id="loginTable">
                        <tr>
                            <th>아이디 : </th>
                            <td><input type="text" name="id"></td>
                            <td><button type="button">중복체크</button></td>
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
                            <td><input type=w"text" id="addr1" name="numberAddr" readonly></td>
                        </tr>
                        <tr>
                            <th>도로명 주소 : </th>
                            <td><input type=w"text" id="addr2" name="roadAddr" readonly></td>
                        </tr>
                        <tr>
                            <th>상세주소 : </th>
                            <td><input type=w"text" id="addr3" name="detailAddr"></td>
                            <td><button type="button" onclick="daumPost()">주소 검색</button></td>
                        </tr>
                        <tr>
                            <th>이메일 : </th>
                            <td><input type="email" name="email" id="EMAIL"></td>
                            <td><button type="button" onclick="emailCK()">이메일 등록</button></td>
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
