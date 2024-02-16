package src.assignments.stacksAndQueue.stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        DynamicCustomStack stack = new DynamicCustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);

        stack.display();
        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
//        System.out.println(stack.pop()); // stack is Empty
        stack.push(6);
        stack.display();
    }
}
