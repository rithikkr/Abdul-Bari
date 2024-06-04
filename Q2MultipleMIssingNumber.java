public class Q2MultipleMIssingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 7, 9};
        int register[] = new int[10];

        for(int i : arr){
            register[i] = 1;
        }
        for(int i = 1; i < register.length; i ++){
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
