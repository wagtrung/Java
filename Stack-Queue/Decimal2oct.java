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
public class Decimal2oct extends Stack {

    int decimal;

    public Decimal2oct() {
        
        System.out.println("Enter nonnegative integer :");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();
    }

    public void setDe2Stack() {
        if (decimal == 0) {
            push(0);
        }
        while (decimal > 0) {
            int digit = decimal % 8;
            push(digit);
            decimal = decimal / 8;

        }
    }

  
    public String getOc() {
        String h = "";
        while (!isEmpty()) {
            h = h + pop();
        }
        return h;
    }
    
    
    

}
