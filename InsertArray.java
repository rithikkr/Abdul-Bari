import java.util.Arrays;

public class InsertArray {
    public static void main(String[] args) {
        
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        int Index_position = 2; //position where the new element will be inserted
        
        int newValue = 5; //value of the new element to be inserted

        System.out.println("Previous Array : " + Arrays.toString(my_array));     
        
        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
        
        my_array[Index_position] = newValue; //insert the new element at the specified position.
        
        System.out.println("New Array: " + Arrays.toString(my_array));
    }   
}
