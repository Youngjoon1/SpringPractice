function codeSend() {
    const userMail = document.getElementById("email");
    $.ajax({
        url : "sendMail/?userMail="+userMail.value,
        type : "get", dataType : "text",
        success : (data) => {
            $("#CODE").val(data);
            },
        error : (data) => {
            alert("문제발생");
        }
    });

}
function checkCode() {
    const inputCode = document.getElementById("emailCode");
    const code = document.getElementById("CODE");
    const email = document.getElementById("email");
    if (!(inputCode.value === "")) {
        if (code.value === inputCode.value) {
            alert("인증성공");
            opener.parent.inputEmail(email.value);
            window.close();
        } else {
            alert("일치하는 인증코드를 입력해주세요");
        }
    } else {
        alert("인증코드를 입력해주세요");
    }
}

function cancel() {
    window.close();
}





