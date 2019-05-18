/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiaiia;

/**
 *
 * @author WagTrung
 */
public class NewClass {
    int a,b;
    NewClass(int c,int d){
        a=c;b=d;
        System.out.println("ggfhjbj");
    }
    public int area(){
     return a+b;
    }
    public static void main(String[] args) {
        NewClass s= new NewClass(2,3);
        System.out.println(s.area());
        
        System.out.println(s.b);
    }
}

