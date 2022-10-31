package Leetcode;

//Given two binary strings a and b, return their sum as a binary string.

public class AddBinary {
    public static String addBinary(String a, String b) {
        int n = Math.min(a.length(), b.length());
        int k =a.length()-1; int j =b.length()-1;
        String result ="";
        String carry = "";
        for (int i = n-1; i>=0;i--) {
            if (k >= 0 && j >= 0) {
                if (a.charAt(k) == '1' || b.charAt(j) == '1') {
                    if (a.charAt(k) == '1' && b.charAt(j) == '0' || a.charAt(k) == '0' && b.charAt(j) == '1') {
                        if (carry.equals("1")) {
                            result = "0" + result;
                        } else {
                            result = "1" + result;
                        }
                    } else if (a.charAt(k) == '1' && b.charAt(j) == '1') {
                        if (carry.equals("1")) {
                            result = "1" + result;
                            carry = "1";
                        } else {
                            result = "0" + result;
                            carry = "1";
                        }
                    }
                } else if (a.charAt(k) == '0' && b.charAt(j) == '0') {
                    if (carry.equals("1")) {
                        result = "1" + result;
                        carry = "";
                    } else {
                        result = "0" + result;
                    }
                }
            }
            k--; j--;
        }
        while (k>=0){
            if (carry.equals("1")){
                if (a.charAt(k)=='1'){
                    result = "0" + result;
                    carry="1";
                }else if(a.charAt(k)=='0'){
                    result = "1" +result;
                    carry="";
                }
            }
            else {
                result= a.charAt(k)+result;
            }
            k--;
        }
        while (j>=0){
            if (carry.equals("1")){
                if (b.charAt(j)=='1'){
                    result = "0" + result;
                    carry="1";
                }else if(b.charAt(j)=='0'){
                    result = "1" +result;
                    carry="";
                }
            }else {
                result = b.charAt(j)+result;
            }
            j--;
        }
        if (carry.equals("1"))
            result = carry + result;
        return result;
    }
    public static void main(String[] args) {
    String a = "100";
    String b ="110010";
        System.out.println(addBinary(a,b));
    }
}
