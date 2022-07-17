package com.example.pojo;

import java.util.List;

public class ReservingTicket {

    String theaterId;
    String screenId;
    String showId;
    List<String> seatId;

    public List<String> getSeatId() {
        return seatId;
    }

    public void setSeatId(List<String> seatId) {
        this.seatId = seatId;
    }

    String userId;


    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
