package com.summer.design.patterns.behavioral.observer;

import java.util.Observable;

public class WeatherEquipment extends Observable {

    public void weatherChange(WeatherDate weatherDate){
        System.out.println("温度和湿度变化了");
        setChanged();
        notifyObservers(weatherDate);
    }
}
