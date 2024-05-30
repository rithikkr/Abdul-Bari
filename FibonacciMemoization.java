import java.util.Arrays;

public class FibonacciMemoization {
    static int[] arr = new int[11];

    // Fibonacci series using Memoization function
    static int function(int n) {
        if (n <= 1) {
            arr[n] = n;
            return n;
        } else {
            if (arr[n - 2] == -1) {
                arr[n - 2] = function(n - 2);
            }
            if (arr[n - 1] == -1) {
                arr[n - 1] = function(n - 1);
            }
            arr[n] = arr[n - 2] + arr[n - 1];
            return arr[n - 2] + arr[n - 1];
        }
    }

    public static void main(String[] args) {
        Arrays.fill(arr, -1);
        System.out.println(function(10));
    }
}

