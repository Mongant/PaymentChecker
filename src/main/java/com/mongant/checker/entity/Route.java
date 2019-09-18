package com.mongant.checker.entity;

import java.util.Date;

public class Route {

    private String ref;
    private String routeNum;
    private String date;
    private String status;

    public Route() {
    }

    public Route(String ref, String routeNum, String date, String status) {
        this.ref = ref;
        this.routeNum = routeNum;
        this.date = date;
        this.status = status;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRouteNum() {
        return routeNum;
    }

    public void setRouteNum(String routeNum) {
        this.routeNum = routeNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
