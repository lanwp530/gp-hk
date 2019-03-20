package com.lwp.dp.adapter.mylogin.v2.adapters;

import com.lwp.dp.adapter.mylogin.ResultMsg;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        // 可以实例一个父抽象类实现此方法 this.getClass().isInstance(adapter)
//        return adapter instanceof  LoginAdapter;
        return this.getClass().isInstance(adapter); // this.getClass().isInstance(adapter)  或者 adapter instanceof  LoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
