package src.assignments.stacksAndQueue.stack;

import src.assignments.linkedList.ListNode;

public class DynamicStackUsingLL {
  private ListNode head;
  private ListNode tail;

  public DynamicStackUsingLL() {
    this.head = new ListNode(-1);
    this.tail = head;
  }

  // isEmpty()
  public boolean isEmpty() {
    return this.head.next == null;
  }

  // peek()
  public int peek() throws Exception {
    if(isEmpty()) {
      throw new Exception("Stack is Empty");
    }
    return tail.val;  
  }

  // push()
  public void push(int ele) throws Exception {
    ListNode newNode = new ListNode(ele);
    tail.next = newNode;
    tail = tail.next;
  }

  // pop()
  public int pop() throws Exception {
    if(isEmpty()) {
      throw new Exception("Stack is Empty");
    }
    ListNode prev = head.next;
    while(prev.next != tail) { // O(N)
      prev = prev.next;
    }
    ListNode removedData = tail;
    prev.next = null;
    tail = prev;
    return removedData.val;
  }

  // print()
  public void print() throws Exception {
    if(isEmpty()) {
      throw new Exception("Stack is Empty");
    }
    ListNode temp = head.next;
    while(temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println();
  }
}