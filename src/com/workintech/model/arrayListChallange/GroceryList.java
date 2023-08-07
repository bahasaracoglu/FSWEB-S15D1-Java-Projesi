package com.workintech.model.arrayListChallange;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {

    private ArrayList<String> cart = new ArrayList<>();

    private ArrayList<String> editInput(String item) {
        ArrayList<String> correctedInput = new ArrayList<>();
        String[] inputs = item.split(",");
        for ( String input: inputs
             ) {
            if(!input.trim().isEmpty()){
                correctedInput.add(input.trim());}
        } return correctedInput;
    }

    public void addItems(String item) {
        ArrayList<String> inputs = editInput(item);
            if (!checkItemIsInList(item)) {
                cart.add(item);
            } else {
                System.out.println("Can not add " + " which is already in list. ");
            }

        Collections.sort(cart);
    }

    public void removeItems(String item) {

            if (checkItemIsInList(item)) {
                cart.remove(item);
            } else {
                System.out.println("Can not remove " + item + " which is not in the list.");
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
