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
public class convert {
    public static void main(String[] args) {
         int[] b = { 2, 0, 1, 8 };

        con(b);
         
         
    }
    
    public static void con(int [] a){
        
        //sort
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    Integer greaterElement = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = greaterElement;
                }
            }
        }
         for (int index = 0; index < a.length; index++) {
            System.out.println("Element " + index + " = " + a[index]);
        }
             
         }
    
}
