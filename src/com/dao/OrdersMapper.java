package com.dao;


import com.domain.Orders;

import java.util.List;

public interface OrdersMapper {
    public List<Orders> findAll();
}
