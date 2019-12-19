package com.summer.design.patterns.creational.builder;

public class Car {
    private String carBody;
    private String carWheel;
    private String carEngine;

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getCarWheel() {
        return carWheel;
    }

    public void setCarWheel(String carWheel) {
        this.carWheel = carWheel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carBody='").append(carBody).append('\'');
        sb.append(", carWheel='").append(carWheel).append('\'');
        sb.append(", carEngine='").append(carEngine).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
