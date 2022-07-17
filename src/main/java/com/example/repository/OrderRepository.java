package com.example.repository;

import com.example.pojo.ReservingTicket;

public class OrderRepository implements OrderRepo {


    public boolean reserveTickets(ReservingTicket reservingTicket) {

        // Check if we can create the ticket using the keys (theatreid, screen id , show id , seat id/ids).
        // if we are able to create then return true.

        return Boolean.TRUE;
    }

    public boolean unreserveTickets(ReservingTicket reservingTicket) {


        // delete all the tickets entries for the givens details

        return Boolean.TRUE;
    }
}
