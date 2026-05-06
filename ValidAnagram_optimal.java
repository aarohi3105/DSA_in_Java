import java.util.HashMap;

public class ValidAnagram_optimal {
    public static boolean Anagram(String s ,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for(int i=0;i<s.length();i++){
            char c1= t.charAt(i);
           if(!map.containsKey(c1)){
               return false;
           }
        else{
            map.put(c1,map.get(c1)-1);
           }
            if(map.get(c1)==0){
                map.remove(c1);
            }
        }

     return map.isEmpty();
    }
    public static void main(String args[]){
        String s ="anagram";
        String t= "nagarama";
        boolean ans = Anagram(s,t);
        System.out.println(ans);
    }
}
