/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recur;

/**
 *
 * @author WagTrung
 */
public class Recur {

    int puzzle(int base, int limit) { //base and limit are nonnegative numbers
        if (base > limit) {
            return -1;
        } else if (base == limit) {
            return 1;
        } else {
            return base * puzzle(base + 1, limit);
        }

    }

    double sumf(float n) // n>=1
    {
        if (n == 1) {
            return 1;
        } else {
            return (1.0/n) + sumf(n - 1);
        }
    }

    double sum1(int n) 
    {
        if (n == 1) {
            return 1;
        } else {
            return n + sum1(n - 1);
        }
    }

    int findmin(int a[], int n) {
        if (n == 1) {
            return a[0];
        } else {
            int mink = findmin(a, n - 1);
            if (a[n - 1] < mink) {
                return a[n - 1];
            } else {
                return mink;
            }

        }

    }

    int findsum(int a[], int n) {
        if (n == 1) {
            return a[0];
        } else {
            int sum = findsum(a, n - 1);
            return a[n-1]+sum;

        }

    }

    public static void main(String[] args) {
        Recur x = new Recur();
        System.out.println(x.puzzle(0, 0));
        System.out.println(x.sumf(2));
        System.out.println(x.sum1(4));
        
        int[] a={1,3,4,6,9};
        System.out.println("Array is");
        for (int k: a) {
            System.out.print(" "+k);
            
        }
        System.out.println("\nsum is "+ x.findsum(a, 5));
        System.out.println("min is "+ x.findmin(a, 5));
        
    }
}

//1. base case : base case is 1 (base<= limit); base case  =-1(base >limit)
//2. the recursive case(s) 
//3. Show what would be displayed by the following calls.
//a. System.out.print(puzzle(14,10));==> -1
//b. System.out.print(puzzle(4,7));==>120
//c. System.out.print(puzzle(0,0));==>1

