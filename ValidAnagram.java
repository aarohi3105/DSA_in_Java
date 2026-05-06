//Brute force Approach

import java.util.Arrays;

public class ValidAnagram {
    public static boolean Anagram(String s ,String t){
          char [] s1= s.toCharArray();
          char [] t1 = t.toCharArray();
          if(s1.length!=t1.length) return false;
          for(int i=0;i<s1.length;i++){
              if(s1[i]!=t1[i]) return false;

          }
          return true;
    }
    public static void main(String args[]){
        String s="aarohi";
        String t="ayi";
        Boolean answer =Anagram(s,t);
        System.out.println(answer);
    }
}
