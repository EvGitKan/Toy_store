package com.company.Controller;

import com.company.Model.ListToys;
import com.company.Model.Toy;
import com.company.View.MenuShop;

public class ToyController<E extends Toy> {
    private MenuShop menuShop;
    private ListToys listToys;

    public ToyController(ListToys listToys, MenuShop menuShop) {
        this.listToys = listToys;
        this.menuShop = menuShop;
    }

    public void addNewToy(E toy) {
        listToys.addNewToy(toy);
        menuShop.printMenu();
    }

    public void getPrize() {
        listToys.getToy();
        menuShop.printMenu();
    }

    public void printList() {
        listToys.printListToys();
        menuShop.printMenu();
    }

    public void setFrequencyLess(int id, double frequency) {
        listToys.setFrequencyOfLess(id, frequency);
        menuShop.printMenu();
    }
}
