import java.util.Arrays;

public class problemSolvingLabTwo {

    public static void main(String[] args) {
        int[] nums = {2,3,4,6};
        System.out.println(findBiggest(nums));
    }

    public static boolean findBiggest(int[] nums) {
        Arrays.sort(nums);
        int totalSum = Arrays.stream(nums).sum();

        if (totalSum % 2 == 0) {
            int target = totalSum / 2;

            for (int i = nums.length-1; i >= 0; i--) {
                if (nums[i] <= target) {
                    target -= nums[i];
                }
                if (target == 0) return true;
            }
        }
        return false;
    }
}
