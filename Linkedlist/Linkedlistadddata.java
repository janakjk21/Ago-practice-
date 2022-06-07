package Linkedlist;

import java.util.LinkedList;

public class Linkedlistadddata {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

        cars.add("ford");
        cars.add("ford1");

        cars.remove("ford");

        System.out.println(cars);
        cars.add("ford1");

        System.out.print(cars.getFirst());
    }
}