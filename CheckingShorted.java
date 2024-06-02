public class CheckingShorted {

    static boolean isShorted(int array[]){
        for(int i = 1; i < array.length; i ++){
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = {3, 4, 6, 7};
        System.out.println(isShorted(array));
    }
}
