public class RansomeNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] mag = new int[26];

        // Count frequency of magazine characters
        for(int i = 0; i < magazine.length(); i++) {

            mag[magazine.charAt(i) - 'a']++;
        }

        // Check ransomNote characters
        for(int i = 0; i < ransomNote.length(); i++) {

            if(mag[ransomNote.charAt(i) - 'a'] > 0) {

                mag[ransomNote.charAt(i) - 'a']--;
            }
            else {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean ans = canConstruct(ransomNote, magazine);

        System.out.println(ans);
    }
}