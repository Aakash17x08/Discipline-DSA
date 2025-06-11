public class largest_num {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 489, 50};
        int largest = arr[0]; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number in the array is: " + largest);
    }
}
