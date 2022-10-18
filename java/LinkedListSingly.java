import java.util.Scanner;

//Creating class node
class node{
    int info;
    node link;
}
class SinglyLinkedList{
    Scanner sc = new Scanner(System.in);
    node head = null;
    //Creating the first node of the singly linked list
    public void create(){
        node p = new node();
        System.out.println("Enter the data: ");
        p.info = sc.nextInt();
        p.link = null;
        head = p;

        //Creating other nodes
        System.out.println("Do You Want to add more nodes(y/n): ");
        char more = sc.next().charAt(0);
        while (more == 'y'){
            node q = new node();
            System.out.println("Enter the data: ");
            q.info = sc.nextInt();
            q.link = null;
            p.link = q;
            p = q;
            System.out.println("Do You Want to add more nodes(y/n): ");
            more = sc.next().charAt(0);
        }

    }



    //Displaying the linked list
    public void display(){
        node temp = head;
        System.out.println("The elements are:");
        while (temp != null){
            System.out.print(temp.info + " -> ");
            temp = temp.link;
        }

    }

    //Counting the Linked list
    public int count(){
        node temp = head;
        int countt=0;
        while (temp !=null){
            countt= countt+1;
            temp = temp.link;
        }
        return countt;
    }

    //Searching an element in the linked list
    public void search(){
        System.out.println("Enter the element you want to search:");
        int sr = sc.nextInt();
        node temp = head;
        int position = 0;
        while (temp!=null){
            position++;
            if(temp.info == sr){
                System.out.println("The position of the element is "+position);
            }
            temp = temp.link;

        }


    }

    //Insertion

    //At the beginning
    public void insertBeg(){
        node q = new node();
        System.out.println("Enter the data you want to enter at the beginning");
        q.info = sc.nextInt();
         q.link = head;
         head = q;
    }

    //At the end
    public void insertEnd(){
        node p = new node();
        System.out.println("Enter the data you want to insert at the end: ");
        p.info = sc.nextInt();
       p.link= null;
        if (head == null){
            head = p;
        }
        else{
            node temp = head;
            while (temp.link!=null){
                temp = temp.link;
            }
            temp.link = p;
        }
    }
    public void insertAny(){
        node p = new node();
        int count =count();
        System.out.println("Enter the position in which you want to enter");
        int pos = sc.nextInt();
       if (pos ==1){
           insertBeg();
       }
       else if (pos== count+1){
           insertEnd();
       }
       else {
           System.out.println("Enter the data to you to insert: ");
           p.info = sc.nextInt();
           int cnt =1;
           node temp = head;
           while (cnt < pos -1){
               cnt ++;
               temp = temp.link;
           }
           p.link = temp.link;
           temp.link = p;
       }
    }

    //Deleting

    //Deleting beginning
    public void delBeg(){
        node temp  = head;
        if (head == null){
            System.out.println("Underflow");
        }
        else{
            head = head.link;
        }
    }

    //Delete End
    public void delEnd(){
        node temp = head;
        if (temp == null){
            System.out.println("Underflow");
        }
        else if (temp.link ==null){
            delBeg();
        }
        else {
            while (temp.link.link != null) {
                temp = temp.link;
            }
            temp.link = null;
        }
    }

    //DeleteAny
    public void delAny(){
        System.out.println("Enter the position you want to delete: ");
        int count = count();
        int pos = sc.nextInt();
        node temp  = head;
        int cnt = 1;
        if (pos == 1 ){
            delBeg();
        }
        else if (pos == count){
            delEnd();
        }
        else {
           while (cnt < pos-1) {
               temp = temp.link;
           }
           temp.link = temp.link.link;
        }
    }

    //Reversing
    public node reverse(){
        node now = head;
    node previous = null;
    node after = null;
    while(now!=null){
       after = now.link;
       now.link = previous;
       previous = now;
       now = after;
    }
        return previous;
    }
    public SinglyLinkedList copyListReversed(){
        node tempNode  = null;
        node tempNode2 = null;
        node curr = head;
        while (curr!=null){
            tempNode2 = new node();
            tempNode2.info = curr.info;
            curr = curr.link;
            tempNode = tempNode2;
        }
        SinglyLinkedList ll2 = new SinglyLinkedList();
        ll2.head = tempNode;
        return ll2;
    }
    }


public class LinkedListSingly {
    public static void main(String[] args) {
        SinglyLinkedList ll =new SinglyLinkedList();
      ll.create();
      ll.display();
      System.out.println("The number of elements in the list is " + ll.count());
      ll.search();
        System.out.println("-------------------------------------------------------------------------------------------");


      //Insert
      ll.insertBeg();
        System.out.println("Inserting node from the Beginning");
      ll.display();
        System.out.println("-------------------------------------------------------------------------------------------");
      ll.insertEnd();
        System.out.println("Inserting node int the end");
      ll.display();
        System.out.println("-------------------------------------------------------------------------------------------");
      ll.insertAny();
        System.out.println("Inserting node in any position");
      ll.display();
        System.out.println("-------------------------------------------------------------------------------------------");


      //Delete
        ll.delBeg();
        System.out.println("Deleting node from the Beginning");
        ll.display();
        System.out.println("-------------------------------------------------------------------------------------------");
        ll.delEnd();
        System.out.println("Deleting node from the end");
        ll.display();
        System.out.println("-------------------------------------------------------------------------------------------");
        ll.delAny();
        System.out.println("Deleting node from the specific postion");
        ll.display();
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Reversing the linked list");
        node r = ll.reverse();
//        ll.display(r);
//        SinglyLinkedList ll2 = new SinglyLinkedList();
//       node cl= ll.copyListReversed();
//        ll2.display();
//        ll.display();
    }
}
