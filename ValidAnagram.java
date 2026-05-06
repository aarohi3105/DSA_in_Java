//Brute force Approach

import java.util.Arrays;

public class ValidAnagram {
    public static boolean Anagram(String s ,String t){
          char [] s1= s.toCharArray();
          char [] t1 = t.toCharArray();
          if(s1.length!=t1.length) return false;
          Arrays.sort(s1);
          Arrays.sort(t1);

          return Arrays.equals(s1,t1);


    }
    public static void main(String args[]){
        String s="aarohi";
        String t="rohiaa";
        Boolean answer =Anagram(s,t);
        System.out.println(answer);
    }
}
