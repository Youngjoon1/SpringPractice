function codeSend() {
    const userMail = document.getElementById("email");
    setInterval(codeTimer,1000);
    $("#countLabel").show();
    $.ajax({
        url : "sendMail/?userMail="+userMail.value,
        type : "get", dataType : "text",
        success : (data) => {
            $("#CODE").val(data);
            },
        error : () => {
            alert("문제발생");
        }
    });
}
function checkCode() {
    const inputCode = document.getElementById("emailCode").value;
    const code = document.getElementById("CODE").value;
    const email = document.getElementById("email").value;
    codeTimer();
    if (!(inputCode === "")) {
        if (code === inputCode) {
            alert("인증성공");
            localStorage.setItem("successEmail",email);
            opener.parent.inputEmail(email);
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

let time = 60;
function codeTimer() {
    if(time <= 0) {
        alert("인증시간이 만료되었습니다.");
        window.close();
    }else {
        time--;
        document.getElementById("count").innerHTML = time;
    }
}

window.onload = function () {
    $("#countLabel").hide();
}





