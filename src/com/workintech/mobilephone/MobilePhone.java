package com.workintech.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    ;

    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (!checkContact(contact)) {
            contacts.add(contact);
            return true;
        } else {
            System.out.println("Can not add " + contact + "already in contacts");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (checkContact(oldContact)) {
            int index = contacts.indexOf(oldContact);
            contacts.add(index, newContact);
            return true;
        } else {
            System.out.println("Can not update " + newContact.getName());
            return false;
        }

    }

    public boolean removeContact(Contact contact) {
        if (checkContact(contact)) {
            int index = contacts.indexOf(contact);
            contacts.remove(index);
            return true;
        } else {
            System.out.println("Can not remove " + contact.getName() + " which is not on contacts.");
            return false;
        }
    }

    public int findContact(Contact contact) {
        if (checkContact(contact)) {
            return contacts.indexOf(contact);
        } else {
            System.out.println("Can not find " + contact.getName());
            return -1;
        }
    }

    public int findContact(String name) {
        int result = 0;
        for (Contact contact : contacts
        ) {
            if (contact.getName().equals(name)) {
                result = contacts.indexOf(contact);

            } else {
                result = -1;
            }

        }
        return result;
    }

    public Contact queryContact(String contactName) {
        int result = 0;
        for (Contact contact : contacts
        ) {
            if (contact.getName().equals(contactName)) {
                result = contacts.indexOf(contact);

            } else {
                result = -1;
            }

        }
        if (result < 0) {
            return null;
        } else {
            return contacts.get(result);
        }
    }
    public void printContact(){
        for (int i=0; i<contacts.size(); i++
             ) {
            System.out.println(i+1+". "+contacts.get(i).getName()+" -> "+contacts.get(i).getPhoneNumber());
        }
    }


    private boolean checkContact(Contact contact) {
        return contacts.contains(contact);
    }


    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
