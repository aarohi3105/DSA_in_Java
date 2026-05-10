import java.util.*;

public class FirstUniqueCharacterBruteForce {

    public static int firstUniqChar(String s) {

        for(int i = 0; i < s.length(); i++) {

            boolean is_duplicate = false;

            for(int j = 0; j < s.length(); j++) {

                if(i != j && s.charAt(i) == s.charAt(j)) {

                    is_duplicate = true;
                    break;
                }
            }

            if(!is_duplicate) {

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