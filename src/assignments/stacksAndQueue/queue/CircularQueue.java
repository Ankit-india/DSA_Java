package src.assignments.stacksAndQueue.queue;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int ele) {
        if (isFull()) {
            return false;
        }

        data[end++] = ele;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot remove from an empty Queue");
        }
        int removedData = data[front++];
        front %= data.length;
        size--;
        return removedData;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot have front in an empty queue");
        }
        return data[front];
    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}
