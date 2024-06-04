public class Q3LastDuplicate {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 5, 5, 7, 7};
        int lastDuplicate = 0;
        for(int i = 0; i < arr.length; i ++){
            if (arr[i] == arr[i + 1] && arr[i] != lastDuplicate) { //arr[i + 1] this can forward index and check the duplicate value
                System.out.println(arr[i]);
                lastDuplicate = arr[i];
            }
        }
    }
}
