package org.example.dsa.bst;
class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinarySearchTree {
    static Node head = null;

    Node insert(Node head, int data){
        if(head == null){
            return new Node(data);
        }

        if(head.data >= data){
            head.left = insert(head.left, data);
        }
        else{
            head.right = insert(head.right, data);
        }

        return head;
    }

    void traverse(Node head){
        if (head == null){
            return;
        }
        traverse(head.left);
        System.out.println(head.data);
        traverse(head.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        head = bst.insert(head, 6);

        bst.insert(head, 8);
        bst.insert(head, 2);
        bst.insert(head, 4);
        bst.insert(head, 9);
        bst.insert(head, 11);

        bst.traverse(head);

    }
}
