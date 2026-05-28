public class FixedSizedSlidingWindow {

    // Method to calculate sum of every 3-day window
    public void sumOf3Days(int[] users) {

        int days = 3;
        int total = 0;

        // Calculate first window sum
        for (int i = 0; i < days; i++) {
            total = total + users[i];
        }

        System.out.println(total);

        // Sliding window
        for (int i = 1; i <= users.length - days; i++) {
            total = total - users[i - 1] + users[i + days - 1];
            System.out.println(total);
        }
    }

    // Main method
    public static void main(String[] args) {

        FixedSizedSlidingWindow obj = new FixedSizedSlidingWindow();

        int[] users = {10, 20, 40, 50, 60, 70};

        obj.sumOf3Days(users);
    }
}