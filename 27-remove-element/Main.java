public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        Main.removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[slow] == val) {
                while (fast < nums.length && nums[fast] == val) {
                    fast++;
                }

                if (fast < nums.length) {
                    nums[slow] = nums[fast];
                    nums[fast] = val;
                } else {
                    break;
                }
            }
            slow++;
            fast++;
        }

        return slow - 1;
    }

}