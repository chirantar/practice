package org.example.dsa;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    public static TreeNode head;
    public BinaryTree(){
    }

    public void inorder(TreeNode root){
        if (root == null)
            return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void levelOrder(TreeNode root){
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.println(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
/*
      5
     / \
   10  15
  /    /
 3    6
*/

        BinaryTree bt = new BinaryTree();
        head = new TreeNode(5);
        head.left = new TreeNode(10);
        head.right = new TreeNode(15);
        head.left.left = new TreeNode(3);
        head.left.right = null;
        head.right.left = new TreeNode(6);

        bt.inorder(head);
        bt.levelOrder(head);
    }
}
