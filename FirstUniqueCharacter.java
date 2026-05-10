import java.util.*;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Frequency count
        for(int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;
        }

        // Find first unique character
        for(int i = 0; i < s.length(); i++) {

            if(freq[s.charAt(i) - 'a'] == 1) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";

        int ans = firstUniqChar(s);

        System.out.println(ans);
    }
}