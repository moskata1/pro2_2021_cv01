package cz.uhk.pro2;

import models.PizzaMenu;
import models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PizzaMenu menu = new PizzaMenu();
        menu.additem(new PizzaMenuItem("Hawai", "Ananas", price 120));
        menu.equals(new PizzaMenuItem("sunovka", "sunka", 150));
        System.out.println("last update: );


        for (PizzaMenuItem item : menu.getItems()) {
            System.out.println(item);
        }
    }
}
