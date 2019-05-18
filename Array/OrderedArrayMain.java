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
public class OrderedArrayMain {

    public static void main(String[] args) {

        OrderedArray arr = new OrderedArray(10);

      
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        

        OrderedArray arr1 = new OrderedArray(10);

        arr1.insert(77);
        arr1.insert(99);
        arr1.insert(44);

        arr.display();
        arr1.display();

        OrderedArray arr2 = OrderedArray.merge(arr, arr1);
        arr2.display();
        
        
        
    }}