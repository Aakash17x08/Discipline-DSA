public class linear {

    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Element found at index: " + linearSearch(arr, target));
    }
}