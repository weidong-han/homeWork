package com.work.swordhome.bTree;

import lombok.Data;

/**
 * @auther: weidong.han
 * @date: 2020/1/16
 */
@Data
public class TreeNode {
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLefltNode() {
        return lefltNode;
    }

    public void setLefltNode(TreeNode lefltNode) {
        this.lefltNode = lefltNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    TreeNode lefltNode;
    TreeNode rightNode;
    public TreeNode(){}
    public TreeNode(int value){
        this.value = value;
    }
    //前序
    public void front() {
        System.out.print(this.getValue() +" ");
        if (this.getLefltNode() != null){
            this.lefltNode.front();
        }
        if (this.getRightNode() != null){
            this.rightNode.front();
        }
    }
    //中序
    public void inorder(){
        if (this.getLefltNode() != null){
            this.lefltNode.inorder();
        }
        System.out.print(this.getValue() +" ");
        if (this.getRightNode() != null){
            this.rightNode.inorder();
        }
    }
    //倒序
    public void endSort(){
        if (this.getLefltNode() != null){
            this.lefltNode.endSort();
        }
        if (this.getRightNode() != null){
            this.rightNode.endSort();
        }
        System.out.print(this.getValue() +" ");
    }
}