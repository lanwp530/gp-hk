package com.lwp.dp.adapter.mylogin.v2;

import com.lwp.dp.adapter.mylogin.Member;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class SignInForQQAdapter {
    public static void main(String[] args) {
        Member member = new Member();
        // 判断member是 Member的实例
        System.out.println(member instanceof Member);
        System.out.println(Member.class.isInstance(member));
        System.out.println(SignInForQQAdapter.class.isInstance(member));
    }
}
