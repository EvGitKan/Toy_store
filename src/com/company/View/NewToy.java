package com.company.View;

import com.company.Model.Car;
import com.company.Model.Doll;
import com.company.Model.Robot;
import com.company.Model.Toy;

import java.util.Scanner;

public class NewToy {
    Scanner scanner = new Scanner(System.in);

    public Toy printMenuAddToy() {
        System.out.println("Укажите частоту выпадения новой игрушки: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Введите корректное значение частоты: от 0,0 до 1,0.");
        }
        double frequency = scanner.nextDouble();
        System.out.println("Какую игрушку Вы хотите добавить?\n" +
                "1. Кукла\n" +
                "2. Робот\n" +
                "3. Машинка\n");
        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    return new Doll(frequency);
                case 2:
                    return new Robot(frequency);
                case 3:
                    return new Car(frequency);
                default:
                    System.out.println("Выбран неверный пункт меню! Повторите ввод данных.");
                    printMenuAddToy();
            }
        }
        return null;
    }
}
