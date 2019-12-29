package com.domain;

public class Orders {

    private Integer id;
    private String disc;
    private Integer uid;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", disc='" + disc + '\'' +
                ", uid=" + uid +
                ", ordersMap=" + ordersMap +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    Orders ordersMap;
}


