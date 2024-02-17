package src.assignments.stacksAndQueue.stack;

import java.util.Stack;

class MyQueue {
    // https://leetcode.com/problems/implement-queue-using-stacks/
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int peek;
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
        this.peek = Integer.MIN_VALUE;
    }
    
    public void push(int x) {
        if(peek == Integer.MIN_VALUE) {
            peek = x;
        }
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int removedData = stack2.pop();
        if(!stack2.isEmpty()) {
            peek = stack2.peek();
        }
        else {
            peek = Integer.MIN_VALUE;
        }
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return removedData;
    }
    
    public int peek() {
        return peek;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */