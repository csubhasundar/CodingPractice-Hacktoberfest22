import java.util.LinkedList;

/*
LinkedList<DataType> object = new LinkedList<>();
 */

//Adding an element
/*
add():
method is used to insert an element in the ArrayList.

add(Object):
Inserts an element at the end of the ArrayList.

add(Index,Object) :
 Inserts an element at the given index.
 
 addFirst():
 insert element in the first of the list
 
 addLast():
 Insert element in the last of the list
 */


//Removing an element
/*
remove(index) :
 used to remove the element at the index number

 clear():
 to remove all the elements of the list
 */


//Checking if an ArrayList contains a specific value or not :
/*
contains(element):
used to check if an ArrayList contains a specified element or not.
 This method returns the boolean value.

 containsAll():
 Check all the elements of one list present in other list of not
 */

//Merging two ArrayLists
/*
 addAll():
 The elements of an ArrayList can be merged into another Arraylist with the help of the method.
 */


//Finding the first occurrence of a specified number in the ArrayList
/*Indexof() & lastIndexOf():
method prints the index of the first occurrence of a particular number.
Returns -1 if the element is not present in the ArrayList.
 */


//Getting an element
/*
get(index):
method is used to print the element in the specific position
 */

//Replacing an element with another element
/*
set(index , element):
Replace the entered element at the specific position
 */


public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        //Adding elements in the list
        ll1.add(16);
        ll1.add(12);
        ll1.add(27);
        ll1.add(36);
        ll1.add(5);

        ll2.add(12);
        ll2.add(16);
        ll2.add(32);
        System.out.println("The elements after adding are: " + ll1);
        System.out.println("The elements after adding are: " + ll2);

        //Adding an element at any position of the list
        ll1.add(3 , 12);
        System.out.println("List after adding 12 at index 3 is: "+ ll1);
        
        //Adding elements in the first and last of the list
        ll2.addFirst(20);
        ll2.addLast(15);
        System.out.println("Lst after adding element in the first and last of the list is"+ ll2);

        //Removing an element in the list
        ll1.remove(5);
        System.out.println("List after removing 5 from it is: "+ll1);


        //Clearing elements from the array list
        System.out.println("List before removing is: "+ ll2);
        ll2.clear();
        System.out.println("List after removing is: "+ll2);

        //Check if the list has specific value of not

        System.out.println("List contains 16: "+ll1.contains(16));
        System.out.println("List contains 1: "+ll1.contains(1));

        //Merging lists
        ll2.addAll(ll1);
        System.out.println("List after merging is: "+ ll2);


        //Checking if the list has same elements as the other list
        System.out.println("Having same elements in both the list:"+ll1.containsAll(ll2));

        //Finding a specific number in the list
        System.out.println("The index of element 16 is list 1  is: "+ ll1.indexOf(16));

        //Printing array list in loop
        System.out.println("The elements in the list are");
        for(int  i = 0; i< ll1.size();i++){
            System.out.print(ll1.get(i));
            System.out.print(",");
        }
        System.out.println();

        //Replacing an element in specific index
        System.out.println("List before replacing is: "+ll1);
        ll1.set(4, 100);
        System.out.println("List after replacing is: "+ ll1);

    }
}

