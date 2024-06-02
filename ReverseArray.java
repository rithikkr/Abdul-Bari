public class ReverseArray {

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++; //first ek index aage badhega or last ek index piche aayega
            last --;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 5, 7, 9};
        reverse(numbers);

        for(int i = 0; i <= numbers.length; i ++){ //printing the code
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
