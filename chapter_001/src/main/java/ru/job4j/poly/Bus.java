package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Машина поехала!");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("В машине находится " + numberOfPassengers + " пассажиров!");
    }

    @Override
    public double fillUp(int amountOfFuel) {
        return amountOfFuel * 34.56;
    }
}
