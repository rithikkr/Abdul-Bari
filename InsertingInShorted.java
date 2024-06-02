import java.util.*;

public class InsertingInShorted {
    public static void main(String[] args) {
        int givenNumber = 1;

        int array[] = {6, 7, 2, 9, 10, 5, 3};

        int newArray[] = new int[array.length + 1];

        for(int i = 0; i < array.length; i ++){ //copying one array to anoter
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = givenNumber; //adding new element

        Arrays.sort(newArray); //shorting new array

        for(int i = 0; i < newArray.length; i ++){
            System.out.println(newArray[i]);
        }

    }
}
