import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner myObject = new Scanner(System.in);
    System.out.print("Enter the First String : ");
    char[] str_1 = myObject.next().toCharArray();
    System.out.print("Enter the Second String : ");
    char[] str_2 = myObject.next().toCharArray();

    int[] replacement_1 = new int[58];
    int[] replacement_2 = new int[58];
    boolean status = true;

    if (str_1.length != str_2.length)
      status = false;
    else {
      for (int i = 0; i < str_1.length; i++) {
        replacement_1[str_1[i] - 'A'] = (int) str_2[i] - 'A';
        replacement_2[str_2[i] - 'A'] = (int) str_1[i] - 'A';
      }

      for (int i = 0; i < str_1.length; i++) {
        if (replacement_1[str_1[i] - 'A'] != (int) str_2[i] - 'A' || replacement_2[str_2[i] - 'A'] != (int) str_1[i] - 'A') {
          status = false;
          break;
        }
      }
    }

    if (status == true) {
      System.out.print("The given two strings are isomorphic.");
    } else
      System.out.print("The given two strings are not isomorphic.");
  }
}
