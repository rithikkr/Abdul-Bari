public class ArrayFunction {

    // Get index
    public static int getIndex(int numbers[], int target){
        for(int index = 0; index < numbers.length; index ++){
            if (numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }

    // Maximum
    public static int maximum(int numbers[]){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i ++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Minimum
    public static int minimum(int numbers[]){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i ++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Sum
    public static int sum(int numbers[]){
        int total = 0;
        for(int i = 0; i < numbers.length; i ++){
            total += numbers[i];
        }
        return total;
    }

    // Average
    public static int average(int numbers[]){
        int total = 0;
        for(int i = 0; i < numbers.length; i ++){
            total += numbers[i];
        }
        return total/2;
    }

    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50, 60};
        System.out.println("Value at index " + getIndex(numbers, 40));

        System.out.println("Maximum number is " + maximum(numbers));

        System.out.println("Minimum number is " + minimum(numbers));

        System.out.println("Sum of number is " + sum(numbers));

        System.out.println("Sum of number is " + average(numbers));
    }
}
