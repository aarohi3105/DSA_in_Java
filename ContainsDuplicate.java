import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for(int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Check duplicates
        for(int value : map.values()) {

            if(value >= 2) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean ans = containsDuplicate(nums);

        System.out.println(ans);
    }
}