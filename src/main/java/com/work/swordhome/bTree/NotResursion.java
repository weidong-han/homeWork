package com.work.swordhome.bTree;

import java.util.Stack;

/**
 * @auther: weidong.han
 * @date: 2020/3/19
 */
public class NotResursion {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        BinaryTree tree = new BinaryTree(node);

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node.setLefltNode(node1);
        node.setRightNode(node2);
        node1.setLefltNode(node3);
        node1.setRightNode(node4);
        node4.setLefltNode(new TreeNode(10));
        node4.setRightNode(new TreeNode(11));
        node2.setLefltNode(node5);

    }
    //先序
    public static  void fornt(BinaryTree tree){
        Stack stack = new Stack();
        TreeNode node = tree.getNode();
        if (node == null){
            System.out.println("tree is empty");
            return;
        }
        while (Boolean.TRUE){
            System.out.println(node.getValue());
            if (node.getLefltNode()!= null){
                node = node.getLefltNode();
                stack.push(node.getValue());
                continue;
            }else {
                return;
            }
        }
    }
}