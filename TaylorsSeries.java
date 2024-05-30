public class TaylorsSeries {

    // Taylor's series using itteration method
    public static double function(int x, int n){
        double s = 1;
        for(; n > 0; n --){
            s = 1 + x * s / n;
        }
        return s;
    }
    
    // Taylor's series using recursion
    static double r = 1;
    public static double function1(int x, int n){
        if (n == 0) {
            return r;
        }else{
            r = 1 + x * r / n;
        }
        return function1(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(function(1, 10));
        System.out.println(function1(2, 10));
    }
}
