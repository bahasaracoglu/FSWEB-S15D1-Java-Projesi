package com.workintech.model.arrayListChallange;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {

    private ArrayList<String> cart = new ArrayList<>();
    public void addItems(String... items) {
        for (String item : items) {
            if (!checkItemIsInList(item)) {
                cart.add(item);
            } else {
                System.out.println("Can not add " + " which is already in list.");
            }
        }
        Collections.sort(cart);
    }

    public void removeItems(String... items) {
        for (String item : items) {
            if (checkItemIsInList(item)) {
                cart.remove(item);
            } else {
                System.out.println("Can not remove " + item + " which is not in the list.");
            }
        }
        Collections.sort(cart);
    }

    private boolean checkItemIsInList(String item) {
        return cart.contains(item);
    }

    private void printSorted() {
        Collections.sort(cart);
        System.out.println(cart);
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "cart=" + cart +
                '}';
    }
}
