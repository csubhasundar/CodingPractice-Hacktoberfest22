import java.util.Stack;
/*
Leetcode 115
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack115 {

    /*
    Using 2 stack
    space complexity o(n)+o(n) -- o(n)
    Time complexity for push,pop,top and min is o(1)
    1st stack to maintain the insertion order
    2nd stack to maintain the corresponding min element until current push
    */

    Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            minStack.push(val);
        }else{
            if(val < minStack.peek())
                minStack.push(val);
            else
                minStack.push(minStack.peek());
        }
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    /*
    Using SinglyLinkedList
    space complexity o(n)
    Time complexity for push,pop,top and min is o(1)
    Maintain min element in the node (every new node insert should compare the minimum element
     of previous node which is the minimum of all inserted element)
     */

    Node head;

    public MinStack() {
        head = null;
    }

    public void push(int val) {
        if(head == null)
            head = new Node(val,val, null);
        else
            head = new Node(val, Math.min(val, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

}
class Node{
    public int val;
    public int min;
    public Node next;
    public Node(int val, int min, Node next){
        this.val=val;
        this.next=next;
        this.min=min;
    }
}
