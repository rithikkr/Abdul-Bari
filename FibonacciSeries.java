public class FibonacciSeries {

    // fibonacci series using recursion
    public static int function(int n){
        if (n <= 1) {
            return n;
        }else{
            return function(n - 2) + function(n - 1);
        }
    }

    // fibonacci series using itteration
    public static int function1(int n){
        int t = 0;
        int t1 = 1; 
        int s = 0;

        if (n <= 1) {
            return n;
        }else{
            for(int i = 2; i <= n; i ++){
                s = t + t1;
                t = t1;
                t1 = s;
            }
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(function(6));
        System.out.println(function1(10));
    }
}