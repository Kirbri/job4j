package ru.job4j.poly;

public interface Transport {
    void go();
    void passengers(int numberOfPassengers);
    double fillUp(int amountOfFuel);
}
