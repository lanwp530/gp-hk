package com.lwp.dp.adapter.mylogin.v2.adapters;

import com.lwp.dp.adapter.mylogin.ResultMsg;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public interface RegisterAdapter {
//    boolean supported(LoginAdapter loginAdapter);
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
