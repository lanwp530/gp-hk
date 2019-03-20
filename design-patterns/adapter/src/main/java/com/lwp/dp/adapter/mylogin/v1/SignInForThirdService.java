package com.lwp.dp.adapter.mylogin.v1;

import com.lwp.dp.adapter.mylogin.Member;
import com.lwp.dp.adapter.mylogin.ResultMsg;
import com.lwp.dp.adapter.mylogin.SignInService;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class SignInForThirdService extends SignInService {

    public ResultMsg loginForQQ(String openId) {
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法

        return loginForThrird(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        return loginForThrird(openId, null);
    }

    public ResultMsg loginForToken(String token) {
        //通过token拿到用户信息，然后再重新登陆了一次
        Member member = getMember(token);
        if (member == null) {
            return null;
        }
        return super.login(member.getUsername(), member.getPassword());
    }

    public ResultMsg loginForMobile(String telephone) {
        return null;
    }

    private Member getMember(String token) {
        // 根据token取到用户信息
        Member member = new Member();
        return member;
    }

    public ResultMsg loginForThrird(String username, String password) {
        // 已经有账号的则直接返回登录信息
        ResultMsg resultMsg = super.login(username, password);
        if (resultMsg != null && resultMsg.getCode() == 0) {
            return resultMsg;
        }
        return loginForRegister(username, password);
    }

    public ResultMsg loginForRegister(String username, String password) {
        super.register(username, password);
        return super.login(username, password);
    }
}
