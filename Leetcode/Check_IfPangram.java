package Leetcode;

import java.util.HashSet;

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */
public class Check_IfPangram {
    public static boolean checkIfPangram(String sentence) {
            if (sentence.length()<26)
                return false;
        HashSet<Character>hs = new HashSet<>();
        int count=26;
        for (int i=0;i<sentence.length();i++){
            if (hs.contains(sentence.charAt(i)))
                continue;
            else{
                hs.add(sentence.charAt(i));
                count--;
            }
        }
        return count==0 ? true :false;
    }

    public static void main(String[] args) {
        String s = "Jackdawslovemybigsphinxofquartz";
        boolean isPangram = checkIfPangram(s);
        System.out.println(isPangram);
    }
}
