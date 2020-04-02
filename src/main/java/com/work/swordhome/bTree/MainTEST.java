package com.work.swordhome.bTree;

/**
 * @auther: weidong.han
 * @date: 2020/1/16
 */
public class MainTEST {
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

        tree.front(node);
        System.out.println();
        tree.inorder(node);
        System.out.println();
        tree.endSort(node);

        tree.front();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.endSort();
    }

}