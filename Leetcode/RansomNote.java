package Leetcode;

import java.util.HashSet;

/*
Given two strings ransomNote and magazine,
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int count=0;
        if (ransomNote.length()>magazine.length())
            return false;
        StringBuilder sb = new StringBuilder(magazine);
        for (int i=0;i<ransomNote.length();i++){
            String c = String.valueOf( ransomNote.charAt(i));
            if (sb.indexOf(c)> -1)
             sb.deleteCharAt(sb.indexOf(c));
           else
               return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine = "aab";
        boolean ans = canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
}
