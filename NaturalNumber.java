public class Six {

    // Natural number using recursion
    public static int funcionRec(int n) 
    { 
        if (n == 0) 
            return n; 
        return n + funcionRec(n - 1); 
    } 

    // Natural number using itterative sum
    public static int funcionItt(int n){
        int sum = 0;
        for(int i = 1; i <= n; i ++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(funcionRec(5));
        System.out.println(funcionItt(5));
    }
}