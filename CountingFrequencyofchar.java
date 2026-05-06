//using hashmap
import java.util.HashMap;

public class CountingFrequencyofchar
{
    public static void Count(String str){
        HashMap<Character,Integer > map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }
        System.out.println(map);
    }

    public static void main(String args[]){
        String str = "aarohijain";
        Count(str);
    }
}
