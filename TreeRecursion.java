public class Three {
    
    // Tree recursion
    public static void function(int n){
        if (n > 0) {
            System.out.println(n);
            function(n - 1);
            function(n - 1);
        }
    }

    public static void main(String[] args) {
        function(3);
    }
}
