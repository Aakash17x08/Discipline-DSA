// Remove element
class Leetcode27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            // shift elements to the left if they are not equal to val
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }

    // psvm
    public static void main(String[] args) {

        Leetcode27 sol = new Leetcode27();

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int k = sol.removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Array after removing element: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
