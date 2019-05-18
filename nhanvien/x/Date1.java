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
public class Date1 {

    private int day;
    private int month;
    private int year;
  

    public Date1(int a, int b, int c) {
        day = a;
        month = b;
        year = c;
       
    }

  
    
    
    private int setthang(int a) {
        if(a >0 && a<=12) 
            return a;
        else
            throw new IllegalArgumentException("loi thang");
    }

    public String toS(){
        return String.format("%2d%2d%2d",ngay,thang,nam);
    }
}
