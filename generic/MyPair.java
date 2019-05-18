/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypair;



/**
 *
 * @author WagTrung
 */
public class MyPair<T, U> {

    public  T Fst;
    public  U Snd;

    public MyPair(T fst, U snd) {
        this.Fst = fst;
        this.Snd = snd;
    }

    @Override
    public String toString() {
        return "(" + Fst + ", " + Snd + ")";
    }
  public T getFst() {
        return Fst;
    }

    public U getSnd() {
        return Snd;
    }
    public  static  <K> void swap(MyPair<K,K> i) {
        K temp=i.getFst();
        i.Fst =  i.getSnd();
        i.Snd= temp;
       
    }

  

}
