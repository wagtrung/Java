/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author WagTrung
 */
public class SortingApp {

    public static void main(String[] args) {

        int maxSize = 10000;

          // reference to array

        Array a = new Array(maxSize); // create the array
        a.randomInit(maxSize); // generate random array's elements

        long startTime, endTime;
        startTime = TimeUtils.now();

        a.rSelectionSort();
        a.SelectionSort();

        a.display();
        endTime = TimeUtils.now();
        long duration = endTime - startTime;
        System.out.print("Time " + duration + "ms\n");
        
        

        
        
        
        
        
//        int[] ar={10000, 15000,20000,25000,30000,35000,40000,45000,50000};
//        for (int i = 0; i < ar.length; i++) {
//            int maxSize =ar[i];
//            
//        
//       
//        
//        
//        
//        Array a; // reference to array
//
//        
//
//        a = new Array(maxSize); // create the array
//        a.randomInit(maxSize); // generate random array's elements
//
//        long startTime, endTime;
//        startTime = TimeUtils.now();  
//        
//        a.SelectionSort();
//   
//       
//        a.display(); 
//        endTime = TimeUtils.now();
//        long duration = endTime - startTime;
//        System.out.print("Time " + duration + "ms\n");
//
//        
//        
//        }
    }

}
