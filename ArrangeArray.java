public class ArrangeArray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            // even
            if (arr[i] < 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        arr[j] = arr[i] + arr[j];
                        arr[i] = arr[j] - arr[i];
                        arr[j] = arr[j] - arr[i];
                        break;
                    }
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}