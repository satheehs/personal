package com.example.pojo;

public class Price {
    String priceId;
    int price;
    int gst;
    int sst;

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGst() {
        return gst;
    }

    public void setGst(int gst) {
        this.gst = gst;
    }

    public int getSst() {
        return sst;
    }

    public void setSst(int sst) {
        this.sst = sst;
    }
}
