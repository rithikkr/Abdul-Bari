public class Q4DuplicateAndCount {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 5, 7, 7, 7, 7};
        for(int i = 0; i < arr.length; i ++){
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                int j = i + 1;
                while (j < arr.length && arr[i] == arr[j]) {
                    j ++;
                }
                System.out.println(arr[i] + " appeared " +(j - i) + " times ");
                i = j - 1;
            }
        }
    }
}
