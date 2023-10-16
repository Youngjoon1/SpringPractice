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
    console.log(code.value);
    if (code.value === inputCode.value) {
        if (!(inputCode.value === "")) {
            alert("인증성공");
            sessionStorage
            window.close();
        } else {
            alert("올바른 인증코드를 인증해주세요");
        }
    } else {
        alert("올바른 인증코드를 인증해주세요");
    }
}

function cancel() {
    $.ajax({
        url : "joinForm",
        type: "get",
        dataType: "text",
        success : () => {
            opener.parent.changeRead();
            window.close();
            },error : () => {
            alert("지나갈수없다");
        }
    })

}





