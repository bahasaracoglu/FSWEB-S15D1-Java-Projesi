package com.workintech.main;

import com.workintech.mobilephone.Contact;
import com.workintech.mobilephone.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MobilePhone baha = new MobilePhone("1324564");
        Contact burcu = new Contact("Burcu","123456");
        Contact gizem = new Contact("gizem","156456");
        baha.addNewContact(burcu);
        baha.addNewContact(gizem);
        for (Contact contact: baha.getContacts()
             ) {
            System.out.println(contact.toString());
        }
        System.out.println(baha.findContact("Baha"));
        System.out.println(baha.queryContact("Burcu"));
        System.out.println(baha.queryContact("Baha"));
        baha.printContact();


    }
}