public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        removeMoreThanDuplicates(nums);
    }

    private static int removeMoreThanDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 0;
        int fast = 0;

        while (fast < nums.length && slow < nums.length - 2) {
            if (nums[slow] >= nums[slow + 2]) {
                fast = slow + 3;
                while (fast < nums.length && nums[fast] <= nums[slow]) {
                    fast++;
                }

                if (fast < nums.length) {
                    nums[slow + 2] = nums[fast];
                    nums[fast] = nums[slow];
                } else {
                    break;
                }
            }

            slow++;
        }

        return slow + 2;
    }
}