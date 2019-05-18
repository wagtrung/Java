/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltooctal;

import static deltooctal.MergeStack.Merge;
import static deltooctal.MergeStack.ident;

/**
 *
 * @author WagTrung
 */
public class main {
    
    public static void main(String[] args) {
         Decimal2oct d = new Decimal2oct();
        d.setDe2Stack();
        System.out.println("Octal : " + d.getOc());
        
        MergeStack a = new MergeStack(2);
        MergeStack b = new MergeStack(2);
        
       Merge(a,b);
       
       
        MergeStack j = new MergeStack(3);
        MergeStack k= new MergeStack(2);
       ident(j,k);
       
       MergeStack o = new MergeStack(2);
        MergeStack p= new MergeStack(2);
       ident(o,p);
       
        MergeStack h = new MergeStack(2);
        MergeStack r= new MergeStack(2);
       ident(h,r);
        
        
        
       
    }
    
}
