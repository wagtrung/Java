/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import static java.lang.Math.PI;

/**
 *
 * @author WagTrung
 */


public  class MyOval extends MyBoundedShape {

    private int r;
    
    
    public double getArea() {
        return PI*Math.pow(r,2);

    }

    
    public void draw() {
        System.out.println("here Oval");
    }

}

