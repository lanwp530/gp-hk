package com.lwp.dp.proxy.dbroute.proxy;

import com.lwp.dp.proxy.dbroute.IOrderService;
import com.lwp.dp.proxy.dbroute.Order;

/**
 * @Author lanwp
 * @Date 2019/3/16
 */
public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }
    @Override
    public int createOrder(Order order) {
        return 0;
    }
}
