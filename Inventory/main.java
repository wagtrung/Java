/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author WagTrung
 */
public class main {

    public static void main(String[] args) {

        Items suabo = new Items("a1", 100, "milk", "vinamilk", "milk","viet nam");
        Items caphe = new Items("a2", 99, "coffee", "highland", "soy","Laos");
        Items tra = new Items("a3", 99, "tea", "thainguyen", "leaf","Campodia");

        Items[] arr = new Items[]{suabo, caphe, tra};

        Inventory a = new Inventory(arr);

        System.out.println("//////the list////// \n");
        a.display();

        System.out.println("\n//////serial number want to find is a3////// \n");
        System.out.println(a.getAnItem("a3"));

        System.out.println("\n//////add new item in the list////// \n");
        a.addNewItem("a4", 200, "milk", "cogaiHaLan", "milk","Thailand");
        a.display();

        System.out.println("\n//////search for an Item tra then return an Item////// \n");
        System.out.println(a.searchForAnItem(tra));

        System.out.println("\n//////search for an Item ca phe then show a list////// \n");
        a.searchItems(caphe);

    }
}
