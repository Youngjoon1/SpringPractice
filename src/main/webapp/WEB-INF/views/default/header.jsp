<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
        <link href="<c:url value="/resources/default/css/header.css"/>" rel="stylesheet">
    </head>
    <body>
        <a id="logoName" href="<c:url value="/"/>"><b>TEST</b> MALL</a>
        <div>
            <div>
                <a>남성</a> &nbsp <a>여성</a> &nbsp <a>키즈</a> &nbsp <a>잡화</a> &nbsp <a>아울렛</a> &nbsp <a>라이프</a>
            </div>
            <div id="memberMenu">
                <a href="/root/member/loginForm">로그인</a> &nbsp <a href="/root/member/joinForm">회원가입</a> &nbsp <a>검색</a> &nbsp <a>장바구니</a>
            </div>
        </div>

        <div id="mainMenu">
            <hr>
            <b>남성 상품</b>
                <div id="menu">
                    <ul>
                        <li>상의</li>
                        <div id="submenu">
                            <ul>
                                <li>티셔츠</li>
                                <li>티셔츠</li>
                                <li>티셔츠</li>
                                <li>티셔츠</li>
                                <li>티셔츠</li>
                            </ul>
                        </div>

                        <li>상의</li>


                        <li>상의</li>

                    </ul>
                </div>
            <br>

        </div>
    <hr>
    </body>
</html>
