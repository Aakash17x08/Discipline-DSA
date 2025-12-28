// Remove Duplicates from Sorted Array
public class Leetcode26 {

    /*
     * 1. Non-decreasing order means the array is already sorted.
     * So duplicate elements will be next to each other.
     * Example: nums[i] <= nums[i + 1]
     * 2. In-place means we must modify the same array
     * and are not allowed to use any extra array.
     */

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x = x + 1;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }

    // psvm
    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 3, 4 };
        Leetcode26 obj = new Leetcode26();
        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    } 

}