/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiaiia;

import java.util.Scanner;

/**
 *
 * @author WagTrung
 */
public class test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
                  System.out.printf("Re-order output %4$8s %1$2s %3$9s %2$2s \n", "a", "b", "c", "d");
             time  s1 =new time();
             int a= sc.nextInt();
             int b= sc.nextInt();
             int c= sc.nextInt();
             
                     
             s1.setTime(a,b,c);
         System.out.println(s1.toU());
        System.out.println(s1.toS());
        
    
             s1.setTime(8,4,5);
   
        
        
        
        
       
         
            
           
           
            
            
        
        
    }
    
}
