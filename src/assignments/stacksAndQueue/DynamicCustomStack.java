package src.assignments.stacksAndQueue;

public class DynamicCustomStack extends CustomStack {
    public DynamicCustomStack() {
        super(); // This will call the CustomStack();
    }

    public DynamicCustomStack(int size) {
        super(size); // This will call the CustomStack(int size);
    }

    @Override
    public void push(int ele) throws Exception {
        if(this.isFull()) {
            int[] temp = new int[data.length * 2];

            for(int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(ele);
    }
}
