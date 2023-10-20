package com.company.Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ListToys<E extends Toy> {
    private PriorityQueue<E> queue;
    private WriteTXT writeTXT;

    Comparator<E> comparator = new Comparator<E>() {
        @Override
        public int compare(E o1, E o2) {
            if (o1.getFrequencyOfLoss() < o2.getFrequencyOfLoss())
                return 1;
            if (o1.getFrequencyOfLoss() == o2.getFrequencyOfLoss())
                return 0;
            return -1;
        }
    };

    public ListToys() {
        this.queue = new PriorityQueue<E>(10, comparator);
    }

    public void addNewToy(E toy) {
        queue.add(toy);
        System.out.printf("¬ы добавили игрушку id - %d, название - %s, частота выпадени€ - %.2f\n", toy.getId(), toy.getTitle(), toy.getFrequencyOfLoss());
    }

    public void printListToys() {
        Iterator<E> iterator = queue.iterator();
        while (iterator.hasNext()) {
            E toy = iterator.next();
            System.out.printf("id - %d, название - %s, частота выпадени€ - %.2f\n", toy.getId(), toy.getTitle(), toy.getFrequencyOfLoss());
        }
    }

    public void getToy() {
        E toy = queue.poll();
        System.out.printf("ѕоздравл€ем! ¬ы вытащили %s под номером %d\n", toy.getTitle(), toy.getId());
        new WriteTXT().writePrizeInFile(toy);
    }

    public void setFrequencyOfLess(int idToy, double frequency) {
        Iterator<E> iterator = queue.iterator();
        E findToy = null;
        while (iterator.hasNext()) {
            findToy = iterator.next();
            if (idToy == findToy.getId()) {
                findToy.setFrequencyOfLoss(frequency);
                System.out.printf("„астота игрушки %s под номером %d изменена\n", findToy.getTitle(), findToy.getId());
                break;
            }
        }
        queue.remove(findToy);
        queue.add(findToy);
    }
}
