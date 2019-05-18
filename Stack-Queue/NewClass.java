/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltooctal;

class TowersApp {

    static int nDisks = 4;

    public static void main(String[] args) {
        doTowers(nDisks, 'x', 'y', 'z');

    }
//-----------------------------------------------------------

    public static void doTowers(int topN, char a, char b, char c) {
        System.out.print(topN + " ");
        System.out.print("" + a + "" + b + "" + c + "\n");
        if (topN == 1) {
            System.out.println("node 1 " + a + " to " + c);
                System.out.print("" + a + "" + b + "" + c + "\n");
        } else {
            
            doTowers(topN - 1, a, c, b); // from-->inter
            System.out.println(topN + " " + a + " to " + c);
                System.out.print("" + a + "" + b + "" + c + "\n");

//            doTowers(topN - 1, b, a, c); // inter-->to
        }
    }
//----------------------------------------------------------
}
