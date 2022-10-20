class Stack
{
        public static final int MAX = 5;
        int top;
        int[] arr = new int[MAX];
        
        Stack(){
            top=-1;
        }
        
        boolean isEmpty(){
            return top<0;
        }
        
        void push(int x){
            if(top>=MAX-1){
                System.out.println("Overflow");
            }else{
                arr[++top]=x;
                System.out.println(x +" is pushed");
            }
        }
        
        int pop(){
            int x=0;
            if(top<0){
                System.out.println("Underflow");
            }
            else{
                x = arr[top--];
            }
            return x;
        }
        
        int peek(){
            int x = arr[top];
            return x;
        }
}

public class Main
{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(60);
		s.push(70);
		System.out.println("popped : "+s.pop());
		System.out.println("popped : "+s.pop());
		System.out.println("peek element : "+s.peek());
		s.push(50);
		System.out.println("popped : "+s.pop());
		System.out.println("popped : "+s.pop());
		System.out.println("peek element : "+s.peek());
		System.out.println("popped : "+s.pop());
		System.out.println("popped : "+s.pop());
		
	}
}
