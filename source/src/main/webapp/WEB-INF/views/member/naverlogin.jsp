<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>
<script>
    var naverLogin = new naver.LoginWithNaverId({
        clientId: "3WF51Ev5Mq2BJbhlLBD4", // 본인걸로 수정, 띄어쓰기 금지.
        callbackUrl: "http://localhost:8090/stayfit", // 아무거나 설정
        isPopup: false,
        callbackHandle: true
    });
    naverLogin.init();
 
    window.addEventListener('load', function () {
    naverLogin.getLoginStatus(function (status) {
 
    if (status) {
        /* console.log(naverLogin.user); */
        var age = naverLogin.user.getAge();
        var birthday = naverLogin.user.getBirthday();
        var email = naverLogin.user.getEmail();
        var gender = naverLogin.user.getGender();
        var id = naverLogin.user.getId();
        var name = naverLogin.user.getName();
        var nickName = naverLogin.user.getNickName();
 
        $.ajax({
            type: 'post',
            url: 'naverSave',
            data: {'n_age':age, 'n_birthday':birthday, 'n_email':email, 'n_gender':gender, 'n_id':id, 'n_name':name, 'n_nickName':nickName},
            dataType: 'text',
            success: function(result) {
                if(result=='ok') {
                    console.log('성공')
                    location.replace("http://localhost:8090/stayfit") 
                } else if(result=='no') {
                    console.log('실패')
                    location.replace("http://localhost:8090/member/login")
                }
            },
            error: function(result) {
                console.log('오류 발생')
            }
        })
 
    } else {
        console.log("callback 처리에 실패하였습니다.");
    }
    });
});
</script>