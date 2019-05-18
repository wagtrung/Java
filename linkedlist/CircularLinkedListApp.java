/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkk;

/**
 *
 * @author WagTrung
 */
public class CircularLinkedListApp {

    public static void main(String[] args) {
        System.out.println("CircularLinkedList infinity loop\n ");
        CircularLinkedList list = new CircularLinkedList();
        System.out.println("add 1, 2, 3, 4 \n");
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.print();
        System.out.println("\nafter delete value 1, 2\n");
        list.deleteNode(1);
         list.deleteNode(2);

        list.print();
        
        
        CircularLinkedList a = new CircularLinkedList();
         a.addNode(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(4);
        a.addNode(5);
        a.addNode(6);
        a.addNode(7);
        
        a.print();
        
        list.kill();
    }

}
