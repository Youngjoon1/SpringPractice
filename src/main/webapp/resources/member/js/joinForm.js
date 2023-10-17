function daumPost() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
            const addr1 = document.getElementById("addr1");
            const addr2 = document.getElementById("addr2");
            const addr3 = document.getElementById("addr3");
            let addr;
            if(data.userSelectedType === "R") {
                addr = data.roadAddress;
            }else {
                addr = data.jibunAddress;
            }
            addr1.value = data.zonecode;
            addr2.value = addr;
            addr3.focus();
        }
    }).open();
}
function emailCK() {
    const useremail = document.getElementById("EMAIL").value;
    if(!(useremail === "")) {
        $.ajax({
            url : "emailList/?email="+useremail,
            type : "get",
            dataType: "text",
            success : (data) => {
                if(data == 1) {
                    alert("이미 가입하신 이메일주소입니다.!!!");
                }else {
                    window.open("/root/member/emailCK?email="+useremail,"pop","width=700,height=700,left=200,top=200");
                }
            },error : () => {
                alert("문제발생");
            }
        })
    }else {
        alert("이메일을 입력해주세요!!!");
    }
}
function inputEmail (email) {
    document.getElementById("EMAIL").value = email;
    document.getElementById("EMAIL").readOnly=true;
}
function outId() {
    const userId = document.getElementById("idInput").value;
    if(userId != "") {
        $.ajax({
            url: "idCK/?userId="+userId,
            type: "get",
            dataType: "text",
            success : (data) => {
                if(data == 0) {
                    document.getElementById("idCK").innerHTML = "사용가능한 아이디입니다."
                    sessionStorage.setItem("passId",userId);
                }else {
                    document.getElementById("idCK").innerHTML = "중복된 아이디입니다.";
                    sessionStorage.removeItem("passId");
                }

            },error : () => {
                alert("실패!!!");
            }
        });
    }else {
        alert("아이디를 입력해주세요");
    }

}
function joinButton() {
    let list = {};
    let arr = $("#joinForm").serializeArray();
    arr.forEach(data => {
        list[data.name] = data.value;
    });
    if(list.id===""){
        alert("아이디를 입력해주세요");
        return false;
    }else if(sessionStorage.getItem("passId")==null) {
        alert("중복된 아이디입니다. 다시입력해주세요");
        return false;
    }
    if(list.pwd==="") {
        alert("비밀번호를 입력해주세요");
        return false;
    }
    if(list.name==="") {
        alert("이름을 입력해주세요");
        return false;
    }
    if(list.tel==="") {
        alert("전화번호를 입력해주세요");
        return false;
    }
    if(list.numberAddr==="" || list.roadAddr==="" || list.detailAddr==="") {
        alert("주소를 입력해주세요");
        return false;
    }
    if(list.email==="") {
        alert("이메일을 입력해주세요");
        return false;
    }else if(localStorage.getItem("successEmail") !== list.email) {
        alert("이메일 인증을 해주세요!!!");
        return false;
    }
}

function test() {
    const session = localStorage.getItem("successEmail");
    console.log(session);

}











