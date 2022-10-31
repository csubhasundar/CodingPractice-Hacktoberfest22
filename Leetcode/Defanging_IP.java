package Leetcode;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */
public class Defanging_IP {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i)=='.'){
                sb.insert(i , '[');
                sb.insert(i+2,']');
                i+=2;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str ="1.1.1.1";
        str = defangIPaddr(str);
        System.out.println(str);
    }
}
