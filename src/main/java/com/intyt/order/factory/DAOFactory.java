package com.intyt.order.factory;


import com.intyt.order.dao.MenuDAO;
import com.intyt.order.dao.OrdersDAO;

import com.intyt.order.dao.PersonDAO;
import com.intyt.order.dao.impl.OrdersDAOImpl;
import com.intyt.order.dao.impl.PersonDAOImpl;

/**
 * DAO工厂类
 */
public class DAOFactory {
    /**
     * 用户操作
     * @return PersonDAO
     */
    public static PersonDAO getPersonDAOInstance(){
        return new PersonDAOImpl();
    }
    /**
     * 菜品操作
     * @return
     */
    public static MenuDAO getMenuDAOInstance(){
        return null;
    }

    /**
     * 订单操作
     * @return
     */
    public static OrdersDAO getOrdersDAOInstance(){
        return new OrdersDAOImpl();
    }

}
