function codeSend() {
    const userMail = document.getElementById("email");
    $.ajax({
        url : "sendMail/?userMail="+userMail.value,
        type : "get", dataType : "json",
        success : () => {
            alert("전송성공");
        },
        error : () => {
            alert("실패!!!");
        }


    })
}