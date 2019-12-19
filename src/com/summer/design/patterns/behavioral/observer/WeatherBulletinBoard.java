package com.summer.design.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherBulletinBoard implements Observer {
    public void update(Observable o, Object arg) {
        WeatherEquipment weatherEquipment = (WeatherEquipment)o;
        WeatherDate weatherDate = (WeatherDate)arg;

        System.out.println("现在的温度是："+weatherDate.getTemperature()+"  湿度是："+weatherDate.getHumidity());
    }
}
