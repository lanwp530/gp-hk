package com.lwp.dp.adapter.mylogin;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class SignInService {

    public ResultMsg register(String username, String password) {
        return  new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username, String password) {
        return null;
    }
}
