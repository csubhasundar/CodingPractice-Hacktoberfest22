import java.util.HashSet;

//Constructors Of HashSet :
/*
    HashSet():
    This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.

   HashSet(int initialCapacity):
    This constructor is used to create a new empty HashSet which has the capacity to store the specified number of elements and having a load factor of 0.75.

    HashSet(int initialCapacity, float loadFactor):
   This constructor is used to create a new empty HashSet with the capacity & load factor equal to specified integer and float value.

   HashSet(Collection<? extends E> c):
   This constructor is used to create a HashSet using the elements of collection c.

 */

//Insertion
//add() : add an element in harsh set

//Remove
//remove() :remove an element in harsh set
//clear() :remove all elements from the set

//Checking
//isEmpty() : whether there is any element in the harsh set or not

//Size
//size() : printing the size of the harshset
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer>  hs = new HashSet<>();
        //Adding elements
        hs.add(15);
        hs.add(16);
        hs.add(22);
        hs.add(60);
        hs.add(60);
        hs.add(76);
        System.out.println(hs);

        //Removing
        hs.remove(22);
        System.out.println("The elements after removing is:"+hs);

        //Checking
        System.out.println("Elemets present in the set:"+ hs.isEmpty());

        //Size
        System.out.println("The size of the set is: "+ hs.size());

        //clearing
        hs.clear();
        System.out.println("Hash Set after clearing is: "+ hs);
    }
}
