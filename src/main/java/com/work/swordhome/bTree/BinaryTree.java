package com.work.swordhome.bTree;

/**
 * @auther: weidong.han
 * @date: 2020/1/16
 */
public class BinaryTree {

    TreeNode node;
    public TreeNode getNode() {
        return node;
    }
    public BinaryTree(TreeNode node){
        this.node = node;
    }

    //前序
    public void front(TreeNode node) {
        if (node == null){
            return;
        }
        System.out.print(node.getValue()+ " ");
        front(node.getLefltNode());
        front(node.getRightNode());
    }
    //中序
    public void inorder(TreeNode node) {
        if (node == null){
            return;
        }
        inorder(node.getLefltNode());
        System.out.print(node.getValue()+ " ");
        inorder(node.getRightNode());
    }
    //倒序
    public void endSort(TreeNode node) {
        if (node == null){
            return;
        }
        endSort(node.getLefltNode());
        endSort(node.getRightNode());
        System.out.print(node.getValue()+ " ");
    }
    //前序
    public void front(){
        if (node == null){
            return;
        }
        node.front();
    }
    //中序
    public void inorder(){
        if (node == null){
            return;
        }
        node.inorder();
    }
    //倒序
    public void endSort(){
        if (node == null){
            return;
        }
        node.endSort();
    }
}