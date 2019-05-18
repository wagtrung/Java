/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltooctal;

import java.util.Random;
import java.util.Stack;


/**
 *
 * @author WagTrung
 */
public class SpecialArray extends Stack {

    private int[] a;

    private int nElems;
    
    Stack<Integer []> CurentStack = new Stack<>();
    Stack BackupStack = new Stack();

//    Stack unStack = new Stack();
//     Stack redoStack = new Stack();
    public SpecialArray(int max) {

        a = new int[max];
        nElems = 0;
    }

    public void randomInit(int numElements) {
        Random aRandom = new Random();
        nElems = numElements;
        for (int i = 0; i < nElems; i++) {

            a[i] = aRandom.nextInt() % 10;

        }

    }

    public void update(int index, int key) {

        BackupStack.push( a);
        a[index] = key;

    }

    public void undo() {
        CurentStack.push((Integer[]) BackupStack.pop());

    }

    public void redo() {
        BackupStack.push(a);
        CurentStack.push((Integer[]) BackupStack.pop());

    }

    public void display() {
      

        for (int i = 0; i < CurentStack.pop().length; i++) {
            System.out.print(CurentStack.pop()[i]);

        }

    }

}
