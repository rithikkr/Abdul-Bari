public class ToweOfHanoi {

    // Tower of Hanoi solution
    public static void towerOfHanoi(int n, int a, int b, int c){
        if (n > 0) {
            towerOfHanoi(n - 1, a, c, b);
            System.out.println("Move disk " + n + " from rod " + a + " to rod " + c);
            towerOfHanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 1, 2, 3);
    }
}
