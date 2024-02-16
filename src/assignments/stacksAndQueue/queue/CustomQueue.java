package src.assignments.stacksAndQueue.queue;

public class CustomQueue {
    private int[] data;
    protected static final int DEFAULT_SIZE = 10;

    int end = 0;
    public CustomQueue () {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue (int size) {
        this.data = new int[size];
    }

    public boolean isFull () {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int ele) {
        if(isFull()) {
            return false;
        }
        data[end++] = ele;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("cannot remove from an empty queue");
        }
        int removedData = data[0];

        for(int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removedData;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("cannot have front from an empty Queue");
        }
        return data[0];
    }

    public void display() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        for(int i = 0; i < end; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println();
    }
}
