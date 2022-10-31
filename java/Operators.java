
//Unary Operator,
//Arithmetic Operator,
//Shift Operator,
//Relational Operator,
//Bitwise Operator,
//Logical Operator,
//Ternary Operator and
//Assignment Operator.

public class Operators {
    public static void main(String[] args) {
        //Unary Operator
        //Postfix (a =10;)(a++)
        //Prefix (a=10) (++a)
        int a =10;
        int b = 20;
        System.out.println(++a);
        System.out.println(a);

        System.out.println(b++);
        System.out.println(b);

        int a1 = 10;
        int b1 = 20;
        System.out.println(a1--);
        System.out.println(--b1);

        int a2 = 2;
        int b2 =3;
        System.out.println(++a2 + b2-- + a2-- + ++b2 + ++b2 - --a2);
        /*
        ++a2 ->  2 +1 = 3
        b2-- -> print = 3  value = 2
        a2-- -> print 3    value = 3 - 1 = 2
        ++b2 -> 2 + 1 = 3
        ++b2 -> 3 +1 = 4
        --a2 -> 2 -1 = 1
         */
        System.out.println(a2);
        System.out.println(b2);
    }
}
