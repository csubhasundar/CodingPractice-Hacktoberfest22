package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 */
public class Letter_Combinations_ofPhone_Number {
    public static List<String> letterCombinations(String digits) {
        String[][]letters = {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        ArrayList<String>al = new ArrayList<>();
        String str="";
        if (digits.length()==0)
            return al;
        makedigit(letters,al,digits,str,0);
         return al;
    }
    public static void makedigit(String[][]letter,List<String>al ,String s , String strr,int start){
        if (s.length()==strr.length()) {
            al.add(strr);
            return;
        }
        for(int i=0;i<letter[s.charAt(start)-'2'].length;i++){
            strr+= letter[s.charAt(start)-'2'][i];
            makedigit(letter,al,s,strr,start+1);
            strr=strr.substring(0,strr.length()-1);
        }
    }

    public static void main(String[] args) {
        String digit = "23";
        List<String>ll = new ArrayList<>();
        ll=letterCombinations(digit);
        System.out.println(ll);
    }
}
