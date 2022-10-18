import java.util.ArrayDeque;
import java.util.PriorityQueue;
//All the methods are same of Arraylist and linked list
//Constructors of ArrayDeque class :
/*
        ArrayDeque():
         Used to create an empty array deque that has the capacity to hold 16 elements.

        ArrayDeque(int numElements):
        Used to create an empty array deque that has the capacity to hold the specified number of elements.

        ArrayDeque(Collection<? extends E> c):
        Used to create an array deque containing all the elements of the specified collections.

 */
//For exceptions
/*
addFirst(): add an element at the first
addLast(): add an element in the last
getFirst(): accessing the head element
getLast(): accessing the last element
removeFirst(): remove the first element
removeLast(): remove the last element
 */

//For WithoutException
/*
offerFirst(): add the element in the first
offerLast(): add the element in the last
peekFirst(): accessing the head element
peekLast() : accessing the last element
pollFirst(): remove the first element
pollLast(): remove the last element
 */
public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad =new ArrayDeque<>();
        //Adding
        ad.offer(15);
        ad.offer(16);
        ad.offer(17);
        System.out.println(ad);

        //adding in first
        ad.offerFirst(14);
        System.out.println(ad);

        //adding last
        ad.offerLast(18);
        System.out.println(ad);

        //Accessing the first element
        System.out.println( ad.peekFirst());

        //Accessing the last element
        System.out.println(ad.peekLast());

        //Removing the first element
        ad.pollFirst();
        System.out.println(ad);

        //Removing the last element
        ad.pollLast();
        System.out.println(ad);


        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int[] arr = {1,2,10,8,7,3,4,6,5,9};
        for(int i: arr){
            pq.add(i);
        }
        System.out.println("Printing Priority Queue Heap : " + pq);
        System.out.print("remove elements of Priority Queue ::");
        while(pq.isEmpty() == false){
            System.out.print(" " + pq.remove());
        }}
    }

