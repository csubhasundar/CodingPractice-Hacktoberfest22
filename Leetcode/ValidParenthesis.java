package Leetcode;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack <Character>stk = new Stack<>();
        if (s.length()%2==1)
            return false;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if (c=='}'&& !stk.isEmpty() && stk.peek()=='{')
                stk.pop();
            else if(c==']'&& !stk.isEmpty() && stk.peek()=='[')
                stk.pop();
            else if (c==')'&& !stk.isEmpty() && stk.peek()=='(')
                stk.pop();
            else
                stk.push(c);
        }
        return  stk.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
