package com.lwp.dp.adapter.mylogin.v1;

public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SignInForThirdService service = new SignInForThirdService();
        service.login("tom", "123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}