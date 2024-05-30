public class IndirectRecursion {

    // Indirect recursion
    public static void functionA(int n){
        if (n > 0) {
            System.out.println(n);
            functionB(n - 1);
        }
    }

    public static void functionB(int n){
        if (n > 1) {
            System.out.println(n);
            functionA(n / 2);
        }
    }

    public static void main(String[] args) {
        functionA(20);
    }
}