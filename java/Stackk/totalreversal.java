package Stackk;

import java.util.ArrayList;
import java.util.Stack;

public class totalreversal {
   static int reverseParenthesis(String str,int size){
       Stack<Character>stk = new Stack<>();
        int openCount=0;
        int closeCount=0;
        char ch;
        if (size%2==1){
            System.out.println("odd number of elements");
            return  -1;
        }
        for (int i=0;i<size;i++){
            ch = str.charAt(i);
            if (ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                if (stk.size()!=0 && stk.peek()=='(')
                    stk.pop();
                else
                    stk.push(ch);
            }
        }
        while(stk.size()!=0){
            if (stk.pop()=='(')
                openCount++;
            else
                closeCount++;
        }
        int reverse = (int)(Math.ceil(openCount/2.0)+ Math.ceil(closeCount/2.0));
        return reverse;
    }
    public static boolean findDuplicateParenthesis(String expn, int size) {
        Stack<Character> stk = new Stack<Character>();
        char ch;
        int count;
        for (int i = 0; i < size; i++) {
            ch = expn.charAt(i);
            if (ch == ')') {
                count = 0;
                while (stk.size() != 0 && stk.peek() != '(') {
                    stk.pop();
                    count += 1;
                }if
                (count <= 1)
                    return true;
            } else
                stk.push(ch);
        }return false;
    }
    public static void printParenthesisNum(String str , int size){
        ArrayList<Integer> al  = new ArrayList<>();
        Stack<Integer>stk = new Stack<>();
        int count=0;
        char c;
        for (int i=0;i<size;i++){
            c = str.charAt(i);
            if (c=='('){
                stk.push(++count);
                al.add(count);
            }
            else if(c == ')'){
                al.add(stk.pop());
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        String expn = "())((()))(())()(()()()()))";
        String expn2 = ")(())(((";int size = expn2.length();
        int value = reverseParenthesis(expn2, size);
        System.out.println("Given expn : " + expn2);
        System.out.println("reverse Parenthesis is : " + value);
        String expn3 = "(((a+b))+c)";
        System.out.println("Given expn3 : " + expn3);
        int size2 = expn3.length();
        boolean value1 = findDuplicateParenthesis(expn3, size2);
        System.out.println("Duplicate Found : " + value1);
        String expn4 = "(((a+(b))+(c+d)))";
        int size3 = expn4.length();
        printParenthesisNum(expn4 , size3);
    }
}