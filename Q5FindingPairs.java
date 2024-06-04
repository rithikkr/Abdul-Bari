public class Q5FindingPairs {
    public static void main(String[] args) {
        int k = 10; // The value of k you want to find pairs for
        int arr[] = {6, 7, 3, 9, 5, 1, 9, 4};
        for(int i = 0; i < arr.length - 1; i ++){
        for(int j = i + 1; j < arr.length; j ++){
            if (arr[i] + arr[j] == k) {
                System.out.println("Pair found " + arr[i] + " " + arr[j]);
            }
        }
    }
    }
}
