package com.lwp.dp.adapter.mylogin.v2.adapters;

import com.lwp.dp.adapter.mylogin.ResultMsg;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class RegisterForQQAdapter implements RegisterAdapter{
//    boolean supported(LoginAdapter loginAdapter);
    public boolean support(Object adapter) {
        return false;
    }
    public ResultMsg login(String id, Object adapter){
        return null;
    }
}
