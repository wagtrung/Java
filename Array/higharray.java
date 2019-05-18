

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
public class higharray {

    private long max1;
    private long[] a; // ref to array a
    private int nElems; // number of data items
//-----------------------------------------------------------

    public higharray(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    public long getMax() {
        if (nElems == 0) {
            return max1;
        } else {
            max1 = a[0];
            for (int i = 1; i < nElems; i++) {
                if (max1 < a[i]) {
                    max1 = a[i];
                }

            }
            return max1;
        }

    }

    public boolean removeMax() {

        int j;
        for (j = 0; j < nElems; j++) {// find pos of max value
            if (max1 == a[j]) {
                break;
            }
        }
        if (j == nElems-1) // can’t find it after find from 0 to n-1
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // make a shift to the left
            {
                a[k] = a[k + 1];
            }
            nElems--; // array is lost 1 pos
            return true;
        }
    } // end delete()

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " "); // display it
        }
        System.out.println(" ");
    }

    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    public void noDups() {

        long value ; //value dups 

        for (int i = 0; i < nElems; i++) {//find dups by compare value at the first position with the others 
            
            value = a[i]; // set dup value is 1st pos
            
            for (int j = i + 1; j < nElems; j++) { //compare from i+1 to n-1(last pos)
                
                if (a[j] == value) { //if values are the same
                    
                    for (int k = j; k < nElems - 1; k++) { //make a shift from the next pos to that pos 
                        a[k] = a[k + 1];
                    }//until the previous of the last pos
                    
                    nElems--;// the elements of array are decreased by 1 cause of the shift.
                    j--;//cause of the shift so j must decrease 1 to keep the for loop in case of bigger than 2 dups

                    System.out.println("Delete dups " + value);
                }
            }
        }
    }

}
