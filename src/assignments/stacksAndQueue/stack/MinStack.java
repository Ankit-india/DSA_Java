package src.assignments.stacksAndQueue.stack;

import java.util.Stack;

class MinStack {
    // https://leetcode.com/problems/min-stack/
    Stack<Integer> stack;
    Stack<Integer> helperStack;
    int min;
    public MinStack() {
        this.stack = new Stack<>();
        this.helperStack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        this.min = Math.min(this.min, val);
        stack.push(val);
    }
    
    public void pop() {
        
        if(min == stack.pop() && !stack.isEmpty() ) {
            min = stack.peek();
            while(!stack.isEmpty()) {
                int temp = stack.pop();
                this.min = Math.min(this.min, temp);
                helperStack.push(temp);
            }
            while(!helperStack.isEmpty()) {
                stack.push(helperStack.pop());
            }
        }
        if(stack.isEmpty()) {
            min = Integer.MAX_VALUE;
        }

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */