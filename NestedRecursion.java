public class NestedRecursion {

    // Nested recursion
    public static int function(int n){
        if (n > 100) {
            return (n - 10);
        }
        else{
            return function(function(n + 11));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(function(95));
    }
}
