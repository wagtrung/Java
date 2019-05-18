/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Random;

/**
 *
 * @author WagTrung
 */
public class Array {

    private long[] a; 
    private int nElems; 

   public Array(int max){
       a=new long[max];
       nElems=0;
   }
   
   


    public void randomInit(int numElements) { 
        Random aRandom = new Random();
        nElems = numElements;
        for (int i = 0; i < nElems; i++) {
         
            a[i] = aRandom.nextLong() % 100000000;
        }
    }

//    public void insert(long value) // put element into array
//    {
//        a[nElems] = value; // insert it
//        nElems++; // increment size
//    }
//--------------------------------------------------------------

    public void display() // displays array contents
    {
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) // outer loop (backward)
        {
            for (in = 0; in < out; in++) // inner loop (forward)
            {
                if (a[in] > a[in + 1]) // out of order?
                {
                    swap(in, in + 1); // swap them
                }
            }
        }

    }

    public void SelectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            int imin = i;

            for (int j = i + 1; j < nElems; j++) {
                if (a[j] < a[imin]) {
                    imin = j;
                    swap(i, imin);
                }
            }

        }
    }

    public void InsertionSort() {
        for (int i = 1; i < nElems; i++) {
            long val = a[i];
            int hole = i;
            while (hole > 0 && a[hole - 1] >= val) {
                a[hole] = a[hole - 1];
                --hole;
            }
            a[hole] = val;
        }
    }

    
      public void rbubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) // outer loop (backward)
        {
            for (in = 0; in < out; in++) // inner loop (forward)
            {
                if (a[in] <a[in + 1]) // out of order?
                {
                    swap(in, in + 1); // swap them
                }
            }
        }

    }

    public void rSelectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            int imax = i;

            for (int j = i + 1; j < nElems; j++) {
                if (a[j] > a[imax]) {
                    imax = j;
                    swap(i, imax);
                }
            }

        }
    }

    public void rInsertionSort() {
        for (int i = 1; i < nElems; i++) {
            long val = a[i];
            int hole = i;
            while (hole > 0 && a[hole - 1] < val) {
                a[hole] = a[hole - 1];
                --hole;
            }
            a[hole] = val;
        }
    }
    
    
}
