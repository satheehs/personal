package com.example.pojo;

import java.io.Serializable;
import java.util.List;

public class MyResponse<T extends Object> implements Serializable {
    private boolean okResponse;
    private int status;
    private String statusDesc;
    private T value;
    private List<T> values;
    private boolean isChecker;

    public boolean isOkResponse() {
        return okResponse;
    }

    public MyResponse setOkResponse(boolean okResponse) {
        this.okResponse = okResponse;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public MyResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public MyResponse setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    public T getValue() {
        return value;
    }

    public MyResponse setValue(T value) {
        this.value = value;
        return this;
    }

    public List<T> getValues() {
        return values;
    }

    public MyResponse setValues(List<T> values) {
        this.values = values;
        return this;
    }

    public boolean isChecker() {
        return isChecker;
    }

    public MyResponse setChecker(boolean checker) {
        isChecker = checker;
        return this;
    }

    @Override
    public String toString() {
        return "MyResponse{" +
                "okResponse=" + okResponse +
                ", status=" + status +
                ", statusDesc='" + statusDesc + '\'' +
                ", value=" + value +
                ", values=" + values +
                ", isChecker=" + isChecker +
                '}';
    }
}
