/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb1;

/**
 *
 * @author WagTrung
 */
public class main {

    public static void main(String[] args) {

        int maxSize = 100; // array size
        higharray arr; // reference to array
        arr = new higharray(maxSize); // create the array
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(55);
        arr.insert(55);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        System.out.println("max is" + arr.getMax());

        arr.removeMax();
        arr.display();
        System.out.println("max is" + arr.getMax());

        arr.noDups();
        arr.display();

        //=======================================
    }
}
