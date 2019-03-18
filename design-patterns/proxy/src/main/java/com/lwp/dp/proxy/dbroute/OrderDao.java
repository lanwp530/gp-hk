package com.lwp.dp.proxy.dbroute;

/**
 * @Author lanwp
 * @Date 2019/3/16
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("orderDao创建order成功");
        return 1;
    }
}
