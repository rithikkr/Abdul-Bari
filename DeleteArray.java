import java.util.Arrays;

public class DeleteArray {
    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : " + Arrays.toString(my_array)); //printing array using toString method

        int removeIndex = 2; //which index element you want to remove
        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the element: " + Arrays.toString(my_array));
    }
}
