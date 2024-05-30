public class Seven {

    // factorial using recursion
    public static int functionRec(int n){
        if (n == 0) {
            return 1;
        }else{
            return functionRec(n - 1) * n;
        }
    }

    // factorial using itterative sum
    public static int function(int n){
        int sum = 1;
        for(int i = 1; i <= n; i ++){
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(functionRec(5));
        System.out.println(function(5));
    }
}
