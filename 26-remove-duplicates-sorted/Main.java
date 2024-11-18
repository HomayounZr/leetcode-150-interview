public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int fast = 0;
        int slow = 0;

        while (fast <= nums.length && slow < nums.length - 1) {
            if (nums[slow] >= nums[slow + 1]) {
                while (fast < nums.length && nums[fast] <= nums[slow]) {
                    fast++;
                }

                if (fast == nums.length) {
                    break;
                }

                int temp = nums[slow];
                nums[slow + 1] = nums[fast];
                nums[fast] = temp;
            }

            slow++;
            fast++;
        }

        return slow + 1;
    }
}