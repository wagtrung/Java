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
public class Node {

    static int noOfLinkedList = 0;

    int data;
    Node nextNode;

    Node(int data) {

        this.data = data;
        noOfLinkedList++;

    }
}
