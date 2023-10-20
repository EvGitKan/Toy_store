package com.company.Model;

public class Car extends Toy {
    private static int countCar = 0;

    public Car(double frequencyOfLoss) {
        countCar++;
        this.setTitle("Машинка" + countCar);
        this.setId(count);
        this.setFrequencyOfLoss(frequencyOfLoss);
    }

}
