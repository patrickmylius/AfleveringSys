package com.example.afleveringsys.model;

import java.util.Observable;

public class Model extends Observable{

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
