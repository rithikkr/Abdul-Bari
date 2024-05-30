public class CombinationalFormula {
    
    // combination formula using recursion
    public static int function(int n, int r){
        if (r == 0 || n == r) {
            return 1;
        }else{
            return function(n - 1, r - 1) + function(n - 1, r);
        }
    }

    // combination formula using itterative sum
    public static int factorial(int n){
        int sum = 1;
        for(int i = 1; i <= n; i ++){
            sum = sum * i;
        }
        return sum;
    }

    public static int function1(int n, int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int function1 = fac_n / (fac_r * fac_nmr);

        return function1;
    }

    public static void main(String[] args) {
        System.out.println(function(5, 2));
        System.out.println(function1(4, 2));
    }
}
