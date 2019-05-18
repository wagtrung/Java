/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
///// in tinh tong chan le 
import java.util.Scanner;

/**
 *
 * @author WagTrung
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("nhap so n");
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                if (i != n) {
                    System.out.print(i + "+");
                } else {
                    System.out.println(i);
                }
                sum += i;
            }
        } else {
            for (int j = 1; j <= n; j += 2) {
                if (j != n) {
                    System.out.print(j + "+");
                } else {
                    System.out.println(j);
                }

                sum += j;
            }

        }

        System.out.println("\nsum =" + sum);

        // TODO code application logic here
    }

}
