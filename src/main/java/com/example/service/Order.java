package com.example.service;

import com.example.pojo.OrderBookedDetails;
import com.example.pojo.OrderDetails;

public interface Order {
    public OrderBookedDetails bookTicket(OrderDetails order);
}
