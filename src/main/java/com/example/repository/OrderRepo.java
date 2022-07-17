package com.example.repository;

import com.example.pojo.ReservingTicket;

public interface OrderRepo {

    public boolean reserveTickets(ReservingTicket reservingTicket);

    public boolean unreserveTickets(ReservingTicket reservingTicket);
}