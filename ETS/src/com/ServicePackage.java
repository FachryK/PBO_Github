package com;

public class ServicePackage {
    private String service;
    private double value;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public ServicePackage(String service, double value) {
        this.service = service;
        this.value = value;
    }

}
