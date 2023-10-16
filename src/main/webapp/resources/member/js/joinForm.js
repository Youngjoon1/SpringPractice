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
    const useremail = document.getElementById("EMAIL");
    if(!(useremail.value === "")) {
        window.open("/root/member/emailCK?email="+useremail.value,"pop","width=700,height=700,left=200,top=200");
    }else {
        alert("이메일을 입력해주세요!!!");
    }
}
function inputEmail (email) {
    document.getElementById("EMAIL").value = email;
    document.getElementById("EMAIL").readOnly=true;
}











