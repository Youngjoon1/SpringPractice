function codeSend() {
    const userMail = document.getElementById("email");
    $.ajax({
        url : "sendMail/?userMail="+userMail.value,
        type : "get", dataType : "json"
    })
}