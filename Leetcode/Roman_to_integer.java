package Leetcode;

/*
Given a roman numeral, convert it to an integer.
 */
public class Roman_to_integer {
    public static int romanToInt(String s) {
        int result=0;
        int n =s.length();
        while (s!=""){
            int i=0;
            char c = s.charAt(i);
            switch (c){
                case ('I'):
                    if (n>=2 && s.charAt(i+1)=='V') {
                        result += 4;
                        i+=2;
                        n-=2;
                    }
                    else if(n>=2 &&s.charAt(i+1)=='X') {
                        result += 9;
                        i+=2;
                        n-=2;
                    }
                    else {
                        result += 1;
                        i++;
                        n--;
                    }
                    s = s.substring(i ,s.length());
                    break;
                case ('X'):
                    if (n>=2 && s.charAt(i + 1) == 'L' ) {
                        result+= 40;
                        i+=2;
                        n-=2;
                    }
                    else if(n>=2&&s.charAt(i+1)=='C'){
                        result+=90;
                        i+=2;
                        n-=2;
                    }
                    else{
                        result+=10;
                        i++;
                        n--;
                    }
                    s=s.substring(i,s.length());
                    break;
                case ('C'):
                    if (n>=2&&s.charAt(i+1)=='D' ){
                        result+=400;
                        i+=2;
                        n-=2;
                    }
                    else if(n>=2&&s.charAt(i+1)=='M' ){
                        result+=900;
                        i+=2;
                        n-=2;
                    }
                    else{
                        result+=100;
                        i++;
                        n--;
                    }
                    s=s.substring(i,s.length());
                    break;
                case ('V'):
                    result +=5;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
                case ('L'):
                    result +=50;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
                case ('D'):
                    result +=500;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
                case ('M'):
                    result +=1000;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str="LVIII";
        int result = romanToInt(str);
        System.out.println(result);
    }
}
