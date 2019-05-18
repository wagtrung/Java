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
public class particle {

    int x, y;
    box box;

    public particle(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public String CheckP() {
        String check;
        if ((x >= 0 && x <= box.getWidth()) && (y >= 0 && y <= box.getHeight())) {
            check = "sai dieu kien ";
        } else {
            check = "dung dieu kien";
        }

        return check;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int getx() {
        return x;
    }

    public void sety(int y) {
        this.x = x;
    }

    public int gety() {
        return y;
    }
    
     
     
     )
    

}
