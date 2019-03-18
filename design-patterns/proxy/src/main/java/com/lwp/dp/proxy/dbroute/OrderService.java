package com.lwp.dp.proxy.dbroute;

/**
 * @Author lanwp
 * @Date 2019/3/16
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
       return orderDao.insert(order);
    }
}
