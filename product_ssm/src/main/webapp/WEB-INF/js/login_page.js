$(document).ready(function(){
    var login_name;
    var password;
    $("#login_button").click(function(){
        login_name = $('#login_name').val();
        password = $('#password').val();
        console.log(login_name+"----"+password)
        $.ajax({
            url:'loginAction.do',
            data: {'loginName':login_name,'password':password},
            success:function (result) {
                if (result.success){
                    window.location.href='http://localhost:8080/index/index.do';
                }else{
                    $('#failure').show().fadeOut(3000);
                }
            }
        })
    });
});