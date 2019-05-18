/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author WagTrung
 */
public class main {
    public static void main(String[] args) {
        
        box s1 = new box(2,5);
        s1.showP();
        
        particle n1 = new particle(2,5);
        System.out.println(n1.CheckP());
        
    }
    
}
