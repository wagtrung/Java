/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkk;

public class CircularLinkedList {

    private Node current;
    private Node temp;
    private Node root;

    public void addNode(int data) {

        Node node = new Node(data);

        if (root == null) {

            root = node;

            root.nextNode = root;

        } else {

            current = root;

            while (current.nextNode != root) {

                current = current.nextNode;

            }

            current.nextNode = node;

            node.nextNode = root;

        }

    }

    public void deleteNode(int delete) {

        int ithNode = 1;

        current = root;

        if (delete == 1) {

            temp = root.nextNode;

            while (temp.nextNode != root) {

                temp = temp.nextNode;

            }

            temp.nextNode = temp.nextNode.nextNode;
            root = current.nextNode;

        } else {

            while (ithNode != delete - 1) {

                current = current.nextNode;
                ithNode++;

            }

            current.nextNode = current.nextNode.nextNode;

        }

        Node.noOfLinkedList--;

    }

    public void print() {

        current = root;

        for (int i = 0; i < 16; i++) {

            System.out.print(current.data + " ");

            current = current.nextNode;

        }
        System.out.println("");

    }

    public void kill() {
        
        System.out.println(root.data);
        int i = 1;
        
        while (i <6) {
            
            for (int j = 0; j < 3; j++) {
                
                 current = current.nextNode;
                
            }
       
            System.out.println(current.data);
            i ++;
        }

    }
}
