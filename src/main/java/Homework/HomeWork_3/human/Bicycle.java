package Homework.HomeWork_3.human;

public class Bicycle implements Transport{

    @Override
    public void start() {
        System.out.println(" едем на велосипеде");
    }

    @Override
    public void stop() {
        System.out.println(" велосипед остановился");
    }
}
