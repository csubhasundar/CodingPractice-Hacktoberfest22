package Leetcode;

//Given an integer, convert it to a roman numeral.

public class Integer_to_Roman {
    public static String intToRoman(int num) {
            String str="";
            while(num>=10) {
                if (num >= 1000) {
                    int q = num / 1000;
                    num %= 1000;
                    for (int i = 0; i < q; i++) {
                        str += "M";
                    }
                } else if (num >= 500 && num < 1000) {
                    if (num >= 900) {
                        str += "CM";
                        num %= 900;
                    } else {
                        str += "D";
                        num %= 500;
                    }
                } else if (num >= 100 && num < 500) {
                    if (num >= 400) {
                        str += "CD";
                        num %= 400;
                    } else {
                        int q = num / 100;
                        num %= 100;
                        for (int i = 0; i < q; i++) {
                            str += "C";
                        }
                    }
                } else if (num >= 50 && num < 100) {
                    if (num >= 90) {
                        str += "XC";
                        num %= 90;
                    } else {
                        str += "L";
                        num %= 50;
                    }
                } else if (num >= 10 && num < 50) {
                    if (num >= 40) {
                        str += "XL";
                        num %= 40;
                    } else {
                        int q = num / 10;
                        num %= 10;
                        for (int i = 0; i < q; i++) {
                            str += "X";
                        }
                    }
                }
            }
            if(num==9)
                str+="IX";
            else if(num==5){
                str+="V";
            }
            else if(num==4){
                str+="IV";
            }
            else{
                if (num>5 && num<9){
                    int q = num%5;
                    str+="V";
                    for (int i=0;i<q;i++){
                        str+="I";
                    }
                }
                else{
                    for (int i=0;i<num;i++)
                        str+="I";
                }
            }
            return str;
            }

    public static void main(String[] args) {
        int i = 358;
        String roman = intToRoman(i);
        System.out.println(roman);
    }
}
