package com.example.pojo;

import java.util.List;

public class Screen {

    String screenID;
    int status;
    List<SeatType> seats;

    public String getScreenID() {
        return screenID;
    }

    public void setScreenID(String screenID) {
        this.screenID = screenID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<SeatType> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatType> seats) {
        this.seats = seats;
    }
}
