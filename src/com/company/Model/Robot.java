package com.company.Model;

public class Robot extends Toy {
    private static int countRobot = 0;

    public Robot(double frequencyOfLoss) {
        countRobot++;
        this.setTitle("�����" + countRobot);
        this.setId(count);
        this.setFrequencyOfLoss(frequencyOfLoss);
    }

}
