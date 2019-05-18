/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x;

/**
 *
 * @author WagTrung
 */
public class X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Date1 a = new Date1(7,3,1988);
        Date1 b = new Date1(8,8,1908);
        
        NhanVien s;
        s = new  NhanVien ("A","ten",a,b);
        
        System.out.println(s);
        
        
    }
    
    
}
