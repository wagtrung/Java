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
public class OrderedArray {
    static int countArray=1;
    private long[] a; // ref to array a
    private int nElems; // number of data items
    //-----------------------------------------------------------

    public OrderedArray(int max) // constructor
    {
        a = new long[max]; // create array
        nElems = 0;
    }
    //-----------------------------------------------------------

    public int size() {
        return nElems;
    }
    //-----------------------------------------------------------

    public long getValueAt(int index) {
        return a[index];
    }
    //-----------------------------------------------------------

    public void setValueAt(int index, long value) {
        a[index] = value;
    }
    //-----------------------------------------------------------

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn; // found it
            } else if (lowerBound > upperBound) {
                return nElems; // can’t find it
            } else // divide range
            {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1; // it’s in upper half
                } else {
                    upperBound = curIn - 1; // it’s in lower half
                }
            } // end else divide range
        } // end while
    } // end find()
    //-----------------------------------------------------------

    public void insert(long value) // put element into array
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int j = 0;
        while (true) {
            if (lowerBound > upperBound) {
                break;
            }
            j = (lowerBound + upperBound) / 2;
            if (value > a[j]) {
                lowerBound = j + 1;
                j++;
            } else {
                upperBound = j - 1;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value; // insert it
        nElems++; // increment size
    } // end insert()
    //-----------------------------------------------------------

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) // can’t find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move bigger ones down
            {
                a[k] = a[k + 1];
            }
            nElems--; // decrement size
            return true;
        }
    } // end delete()
    //-----------------------------------------------------------

    public static OrderedArray merge(OrderedArray a, OrderedArray b) {
        
        OrderedArray c = new OrderedArray(a.size() + b.size()); //create new object array has length of 2 arrays input
        
        int count = 0;
      
      for(int i = 0; i < a.size(); i++) { //add array object a to  array object c
        c.setValueAt(i, a.getValueAt(i));//add from 0 to length of a - 1
        c.nElems++;// increaces the elements in array c
         count++;//count until the last to add ellement of array b
      } 
      for(int j = 0; j < b.size();j++) { //add array object b to  array object c affter done with array a
          c.setValueAt(count++, b.getValueAt(j));//add from next pos of the last of array a to length of b - 1
         c.nElems++;
      } 
      return c;// array c is done by merging 2 arrays input
        
        

    }
   

    public void display() // displays array contents
    {
        
          System.out.println("Array "+countArray );
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " "); // display it
        }
        System.out.println("\n");
        countArray++;
    }

}
