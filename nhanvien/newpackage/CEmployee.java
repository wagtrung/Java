/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author WagTrung
 */
public class CEmployee extends  Object{
    private String fName;
    private String lName;
    private String sSNumber;
    private double gSale;
    private double cRate;

    public CEmployee(String fName, String lName, String sSNumber, double kk, double hh) {
        this.fName = fName;
        this.lName = lName;
        this.sSNumber = sSNumber;
        setcRate(hh);
        setgSale(kk);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    
    public String getsSNumber() {
        return sSNumber;
    }

    public void setsSNumber(String sSNumber) {
        this.sSNumber = sSNumber;
    }
    
public void setgSale(double a){
    if (a>=0)
        gSale=a;
    
}

    public double getgSale() {
        return gSale;
    }

   public void setcRate(double  a){
       if(a>=0 && a<1) 
           cRate=a;
      
   }
    public double getcRate() {
        return cRate;
    }
    
    public double earn(){
        return  cRate*gSale;
    }
    
    @Override
    public String toString(){
        return String.format("com employ %s %s \n"
                + "social secu num %s \n"
                + "goss sale %.2f \n"
                + "comiss rate %.2f\n",fName,lName,sSNumber,gSale,cRate);
    }
    
}
