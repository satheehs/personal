package com.example.pojo;

import java.util.List;

public class SeatType {

    String id;
    String type;
    List<SeatRow> seats;
    Price price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SeatRow> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatRow> seats) {
        this.seats = seats;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
