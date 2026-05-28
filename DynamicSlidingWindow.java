// Find the minimum number of days required to achieve a target of 7 users/orders/sales.
public class DynamicSlidingWindow {


    public static void minimumDays(int[] user) {

        // int[] users = {2,3,1,2,4,3};
        int sum = 0;
        int left = 0;
        int minDay = Integer.MAX_VALUE;
        int target = 7;
        int currentDay = 0;

        for (int right = 0; right < user.length; right++) {

            sum = sum + user[right];

            while (sum >= target) {

                currentDay = right - left + 1;
                minDay = Math.min(minDay, currentDay);

                sum = sum - user[left];
                left++;
            }
        }

        System.out.println(minDay);
    }

    public static void main(String[] args) {

        int[] users = {2, 3, 1, 2, 4, 3};

        minimumDays(users);
    }
}