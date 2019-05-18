/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiaiia;

import java.util.Date;

/**
 *
 * @author WagTrung
 */
public class NhanVien {
    private String ten;
    private String ho;
    private Date1 ngayDe;
    private Date1 ngayThue;
    
    public NhanVien(String a, String b , Date1 c , Date1 d){
        ten=a;ho=b;ngayDe=c;ngayThue=d;
    }
    
    public String toS(){
        return  String.format("%s %s %s %s",ho,ten, ngayDe,ngayThue);
    }
   
}

