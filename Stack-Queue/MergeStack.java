/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltooctal;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author WagTrung
 */
public class MergeStack extends Stack {
    
    int[] a ;

    public MergeStack(int k) {
        a=new int[k];

        System.out.println("Enter your 1st texts:");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) push(input.nextInt());

        }
    }

    static Stack<Integer> c = new Stack<Integer>();

    static void Merge(MergeStack j, MergeStack k) {

        System.out.println("your merge is");

        while (!j.isEmpty()) {
            c.push((Integer) j.pop());

        }
        while (!c.isEmpty()) {
            System.out.println(c.pop());
        }

        while (!k.isEmpty()) {
            c.push((Integer) k.pop());

        }
        while (!c.isEmpty()) {
            System.out.println(c.pop());
        }

    }

    static void ident(MergeStack a, MergeStack b) {
        if (a.size() != b.size()) {
            System.out.println(" not identical");

        } else {
            int count=0;
            for (int i = 0; i < a.size(); i++) {
                if (a.pop() != b.pop()) {
                    count++;
                }

            }
            if (count== 0) {
                System.out.println("identical");
            }
            else{
                System.out.println("not identical");
            }


        } 

    }

}
