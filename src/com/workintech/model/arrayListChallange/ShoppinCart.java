package com.workintech.model.arrayListChallange;

import java.util.Scanner;

public class ShoppinCart {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        Scanner sc = new Scanner(System.in);

        boolean isOn = true;
        while(isOn){
            System.out.println("İlerlemek için seçim yapınız:\n"+"0 Çıkış\n"+"1 Ekleme\n"+"2 Çıkarma");
            int input = sc.nextInt();
        switch (input) {
            case (0) :
                isOn = false;
                System.out.println("Programdan çıkış yapıldı.");
                break;
            case (1):
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String itemsToAdd = sc.next();
                groceryList.addItems(itemsToAdd);
                System.out.println(groceryList.toString());
                break;
            case (2):
                System.out.println("Çıkarmak istediğiniz elemanları giriniz.");
                String itemsToRemove = sc.next();
                groceryList.removeItems(itemsToRemove);
                System.out.println(groceryList.toString());
                break;

        }
    }}
}
