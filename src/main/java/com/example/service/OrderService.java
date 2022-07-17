package com.example.service;

import com.example.pojo.OrderBookedDetails;
import com.example.pojo.OrderDetails;
import com.example.pojo.ReservingTicket;
import com.example.repository.OrderRepo;
import com.example.util.Myutility;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService implements Order{

@Autowired
    OrderRepo orderRepo;
    @Override
    public OrderBookedDetails bookTicket(OrderDetails order) {
        OrderBookedDetails orderBookedDetails = new OrderBookedDetails();

        ReservingTicket reservingTicket = Myutility.getDetails(order);
        boolean isTicketReserved = orderRepo.reserveTickets(reservingTicket);

        if(isTicketReserved){
            // Create the order
            // call the payment service
            // confirm the order
            // return
        }

        return orderBookedDetails;
    }
}
