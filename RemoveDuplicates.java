public class RemoveDuplicates {

    public static int removeDuplicates(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i - 1]) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < arr[i]; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
