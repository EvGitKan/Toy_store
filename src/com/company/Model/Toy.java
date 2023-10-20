package com.company.Model;

public abstract class Toy implements Comparable<Toy> {
    private int id = 0;
    private String title;
    private double frequencyOfLoss;
    public static int count = 0;

    {
        count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFrequencyOfLoss() {
        return frequencyOfLoss;
    }

    public void setFrequencyOfLoss(double frequencyOfLoss) {
        this.frequencyOfLoss = frequencyOfLoss;
    }

    @Override
    public int compareTo(Toy o) {
        return this.getId() - o.getId();
    }
}
