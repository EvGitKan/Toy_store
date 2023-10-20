package com.company.View;

import java.util.Scanner;

public class SearchToy {
    private int id;
    private double frequency;
    Scanner scanner = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public double getFrequency() {
        return frequency;
    }

    public void searchToy() {
        System.out.println("¬ведите id игрушки и новую частоту ее выпадени€ через зап€тую");
        String[] inputDate = scanner.nextLine().trim().split(",");
        try {
            id = Integer.parseInt(inputDate[0]);
            frequency = Double.parseDouble(inputDate[1]);
        } catch (NumberFormatException e) {
            System.out.println("¬ведено неверное значение. ‘ормат ввода: {id игрушки, частота выпадени€} -> {0, 0.0}");
            searchToy();
        }
    }
}
