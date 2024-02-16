package src.assignments.stacksAndQueue.stack;

public class CustomStack {
    protected int[] data;
    private static int size = 10;
    protected int top;
    public CustomStack() {
        this.data = new int[size];
        this.top = -1;
    }

    public CustomStack(int size) {
        this.data = new int[size];
        this.top = -1;
    }
    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int ele) throws Exception{
        if(isFull()) {
            throw new Exception("stack is full");
        }
        data[++top] = ele;
    }

    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("stack is Empty");
        }
        this.top--;
        return data[top];
    }

    public int peek() throws Exception{
        if(isEmpty()) {
            throw new Exception("stack is emp");
        }
        return data[top];
    }
    public void display() throws Exception{
        if(isEmpty()) {
            throw new Exception("stack is Empty");
        }
        for(int i = 0; i < data.length && i < top; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println();
    }

}
