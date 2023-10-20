package com.company;

import com.company.Controller.ToyController;
import com.company.Model.*;
import com.company.View.MenuShop;
import com.company.View.NewToy;
import com.company.View.SearchToy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListToys listToys = new ListToys();
        SearchToy searchToy = new SearchToy();
        NewToy newToy = new NewToy();
        boolean flag = true;

        // Для теста можно добавить сразу 4 игрушки в пул:
//        listToys.addNewToy(new Car(0.5));
//        listToys.addNewToy(new Robot(0.3));
//        listToys.addNewToy(new Robot(0.8));
//        listToys.addNewToy(new Doll(0.7));

        MenuShop menu1 = new MenuShop();
        ToyController<Toy> toyController = new ToyController(listToys, menu1);
        menu1.printMenu();

        while (flag) {
            switch (scanner.nextInt()) {
                case 1:
                    toyController.addNewToy(newToy.printMenuAddToy());
                    break;
                case 2:
                    searchToy.searchToy();
                    toyController.setFrequencyLess(searchToy.getId(), searchToy.getFrequency());
                    break;
                case 3:
                    toyController.getPrize();
                    break;
                case 4:
                    toyController.printList();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный выбор пункта меню!");
            }
        }


    }
}
