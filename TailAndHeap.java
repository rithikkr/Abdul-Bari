public class One {

    // Tail and head example
    public static void function(int n){
        if (n > 0) {
            System.out.println(n);
            function(n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 3;
        function(x);
    }
}