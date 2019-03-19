package com.lwp.dp.strategy.pay;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class MsgResult {
    private final int code;
    private final Object data;
    private final String msg;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
