/**
 * @author Ming
 */
var username = document.getElementById("username");
var password = document.getElementById("password");
var randomCodeByInput = document.getElementById("randomCodeByInput");

var codeLabel = document.getElementById("codeLabel");
var msgSpan = document.getElementById("msgSpan");


function createRandomCode(){
    //简易验证码生成
    var str = "";
    var codeLength = 4 ;
    var code  = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    for ( var i = 0 ; i < codeLength ; i ++){
        str += code [ Math.floor((Math.random()*62)) ].toString() ;
    }
    return str;
}
function checkRandomCode(){
    if(randomCodeByInput.value.length == 0){
        msgSpan.innerHTML = "验证码不能为空~(T ^ T)";
        randomCodeByInput.focus();
        return false;
    }else if(codeLabel.innerHTML.toLowerCase()
		!= randomCodeByInput.value.toLowerCase()){
        msgSpan.innerHTML = "验证码错误~(T ^ T)";
        reRandomCode();
        randomCodeByInput.focus();
        return false;
    }
    msgSpan.innerHTML = "(≧∇≦)ﾉ&nbsp;&nbsp;点我登陆哦~";
    return true;
}

function reRandomCode(){
    //添加到label标签中
    codeLabel.innerHTML = createRandomCode();
}

function checkUsername(){
    if(username.value.trim().length == 0) {
        msgSpan.innerHTML = "用户名不能为空~(T ^ T)";
        username.focus();
        return false;
    }else{
        msgSpan.innerHTML = "(≧∇≦)ﾉ&nbsp;&nbsp;点我登陆哦~"; return true;
    }
}
function checkPassword(){
    if(password.value.trim().length == 0) {
        msgSpan.innerHTML = "密码不能为空~(T ^ T)";
        password.focus();
        return false;
    }else{
        msgSpan.innerHTML = "(≧∇≦)ﾉ&nbsp;&nbsp;点我登陆哦~"; return true;
    }
}


function submitForm() {
    //提交表单时检查表单
    var isSuccess = checkRandomCode()&&checkUsername()&&checkPassword();
    if(isSuccess) msgSpan.innerHTML = "";
    return isSuccess;
}
