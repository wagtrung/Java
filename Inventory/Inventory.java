/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author WagTrung
 */
public class Inventory {

    private LinkedList<Items> listitems;

    public Inventory(Items[] c) {

        listitems = new LinkedList<Items>();
        for (int i = 0; i < c.length; i++) {
            listitems.add(c[i]);

        }

    }

    public Items getAnItem(String serialNumber) {
        for (Iterator i = listitems.iterator(); i.hasNext();) {
            Items k = (Items) i.next();

            if (k.getSerialNumber() == serialNumber) {
                return k;
            }

        }
        return null;
    }

//search an item return an item
    public Items searchForAnItem(Items searchItem) {
        for (int i = 0; i < listitems.size(); i++) {
            if (listitems.get(i) == searchItem) {
                return listitems.get(i);
            }
        }
        return null;
    }
//search an item return a list

    public LinkedList searchItems(Items searchItem) {

        LinkedList<Items> ll = new LinkedList<Items>();

        for (int i = 0; i < listitems.size(); i++) {
            if (listitems.get(i) == searchItem) {
                ll.add(listitems.get(i));
            }
        }
        for (Items all : ll) {
            System.out.println(all);
        }
        return ll;
    }

    public Items addNewItem(String serialNumber, double price, String description, String manufactures, String materials, String or) {
        Items kk = new Items(serialNumber, price, description, manufactures, materials,or);
        listitems.add(kk);
        return kk;
    }

    public void display() {
        for (Items all : listitems) {
            System.out.println(all);
        }

    }

}
