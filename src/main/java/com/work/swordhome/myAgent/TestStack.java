package com.work.swordhome.myAgent;


import java.util.Stack;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stackBackUp = new Stack<Integer>();
        pushStack(stack,stackBackUp,11);
        pushStack(stack,stackBackUp,7);
        pushStack(stack,stackBackUp,6);
        pushStack(stack,stackBackUp,4);
        pushStack(stack,stackBackUp,8);
        pushStack(stack,stackBackUp,3);
        pushStack(stack,stackBackUp,1);
        pushStack(stack,stackBackUp,2);
        System.out.println("当前stack:"+stack);
        System.out.println("stack下标对应的栈:"+stackBackUp);
        popStack(stack,stackBackUp);
        System.out.println("第1次移除操作后stack:"+stack);
        System.out.println("第1次移除操作后stack下标对应的栈:"+stackBackUp);
        popStack(stack,stackBackUp);
        System.out.println("第2次移除操作后stack:"+stack);
        System.out.println("第2次移除操作后stack下标对应的栈:"+stackBackUp);
        popStack(stack,stackBackUp);
        System.out.println("第3次移除操作后stack:"+stack);
        System.out.println("第3次移除操作后stack下标对应的栈:"+stackBackUp);
        System.out.println("stack中最小值:"+getMin(stack,stackBackUp));

    }

    public static void pushStack(Stack<Integer> stack,Stack<Integer> indexStack,int i){
        if (stack.isEmpty()){
            indexStack.push(0);
        }else if (stack.get(indexStack.peek()) > i){
            indexStack.push(stack.size());
        }
        stack.push(i);
    }
    public static void popStack(Stack<Integer> stack,Stack<Integer> indexStack){
        if (stack.peek() == getMin(stack,indexStack)){
            indexStack.pop();
        }
        stack.pop();
    }
    public static Integer getMin(Stack<Integer> stack,Stack<Integer> indexStack){
        return  stack.get(indexStack.peek());
    }

}