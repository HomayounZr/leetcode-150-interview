public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        int n1 = 3;
        int n2 = 3;

        int[] nums = mergeArrays(nums1, n1, nums2, n2);
        for (int num: nums) {
            System.out.println(num);
        }
    }

    private static int[] mergeArrays(int[] nums1, int n1, int[] nums2, int n2) {
        int _n1 = n1 - 1;
        int _n2 = n2 - 1;

        while (_n1 >= 0 && _n2 >= 0) {
            int num1 = nums1[_n1];
            int num2 = nums2[_n2];

            if (num1 > num2) {
                nums1[_n1 + _n2 + 1] = num1;
                _n1--;
            } else {
                nums1[_n1 + _n2 + 1] = num2;
                _n2--;
            }
        }

        while (_n2 >= 0) {
            nums1[_n2] = nums2[_n2];
            _n2--;
        }

        while (_n1 >= 0) {
            nums1[_n1] = nums1[_n1];
            _n1--;
        }

        return nums1;
    }
}