package com.company.Model;

public class Doll extends Toy {
    private static int countDoll = 0;

    public Doll(double frequencyOfLoss) {
        countDoll++;
        this.setTitle("Кукла" + countDoll);
        this.setId(count);
        this.setFrequencyOfLoss(frequencyOfLoss);
    }

}
