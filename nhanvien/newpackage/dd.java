/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.sun.org.apache.xpath.internal.functions.FuncQname;

/**
 *
 * @author WagTrung
 */
public class dd extends CEmployee{
    private double  bSalary;
    private int [] aa;

    public dd(String fName, String lName, String sSNumber, double kk, double hh, double  sa,int [] nn) {
        super(fName, lName, sSNumber, kk, hh);
       bSalary=sa;
    }
    
  public void setbSalary(double  a){
      if(a>=0)
          bSalary=a;
      
  }
    
  public double getbSalary(){
      return bSalary;
      
  }
  
    @Override
  public double earn(){
      return bSalary+super.earn();
  }
  
    @Override
  public String toString(){
      return String.format("%s ghjghj %.2f",super.toString() ,getbSalary());
  }
  
  
  
}
