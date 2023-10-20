package com.company.View;

import com.company.Model.Car;
import com.company.Model.Doll;
import com.company.Model.Robot;
import com.company.Model.Toy;

import java.util.Scanner;

public class NewToy {
    Scanner scanner = new Scanner(System.in);

    public Toy printMenuAddToy() {
        System.out.println("������� ������� ��������� ����� �������: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("������� ���������� �������� �������: �� 0,0 �� 1,0.");
        }
        double frequency = scanner.nextDouble();
        System.out.println("����� ������� �� ������ ��������?\n" +
                "1. �����\n" +
                "2. �����\n" +
                "3. �������\n");
        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    return new Doll(frequency);
                case 2:
                    return new Robot(frequency);
                case 3:
                    return new Car(frequency);
                default:
                    System.out.println("������ �������� ����� ����! ��������� ���� ������.");
                    printMenuAddToy();
            }
        }
        return null;
    }
}
