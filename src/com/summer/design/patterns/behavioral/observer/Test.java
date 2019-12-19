package com.summer.design.patterns.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        WeatherEquipment weatherEquipment = new WeatherEquipment();
        WeatherBulletinBoard weatherBulletinBoard = new WeatherBulletinBoard();

        weatherEquipment.addObserver(weatherBulletinBoard);

        WeatherDate weatherDate = new WeatherDate();
        weatherDate.setTemperature("26°");
        weatherDate.setHumidity("30%");

        weatherEquipment.weatherChange(weatherDate);
    }
}
