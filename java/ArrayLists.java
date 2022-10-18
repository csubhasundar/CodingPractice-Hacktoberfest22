import java.util.ArrayList;
/*
ArrayList<DataType> object = new ArrayList<>();
 */

//Adding an element
/*
add():
method is used to insert an element in the ArrayList.

add(Object):
Inserts an element at the end of the ArrayList.

add(Index,Object) :
 Inserts an element at the given index.
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

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        //Adding elements in the list
        al1.add(16);
        al1.add(12);
        al1.add(27);
        al1.add(36);
        al1.add(5);

        al2.add(12);
        al2.add(16);
        al2.add(32);
        System.out.println("The elements after adding are: " + al1);
        System.out.println("The elements after adding are: " + al2);

        //Adding an element at any position of the list
        al1.add(3 , 12);
        System.out.println("List after adding 12 at index 3 is: "+ al1);

        //Removing an element in the list
        al1.remove(5);
        System.out.println("List after removing 5 from it is: "+al1);


        //Clearing elements from the array list
        System.out.println("List before removing is: "+ al2);
        al2.clear();
        System.out.println("List after removing is: "+al2);

        //Check if the list has specific value of not

        System.out.println("List contains 16: "+al1.contains(16));
        System.out.println("List contains 1: "+al1.contains(1));

        //Merging lists
        al2.addAll(al1);
        System.out.println("List after merging is: "+ al2);


        //Checking if the list has same elements as the other list
        System.out.println("Having same elements in both the list:"+al1.containsAll(al2));

        //Finding a specific number in the list
        System.out.println("The index of element 16 is list 1  is: "+ al1.indexOf(16));

        //Printing array list in loop
        System.out.println("The elements in the list are");
        for(int  i = 0; i< al1.size();i++){
            System.out.print(al1.get(i));
            System.out.print(",");
        }
        System.out.println();

        //Replacing an element in specific index
        System.out.println("List before replacing is: "+al1);
        al1.set(4, 100);
        System.out.println("List after replacing is: "+ al1);

    }
}
