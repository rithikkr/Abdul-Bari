public class Two {

    // Static global
    static int x = 0; //in java if you have to make any variable, integer static you have to write outside the function
    public static int function(int n){
        if (n > 0) {
            x ++;
            return function(n - 1) + x;

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(function(5));
    }
}