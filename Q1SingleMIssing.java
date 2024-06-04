public class Q1SingleMIssing {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int n = array.length + 1; //This is bacause one number is missing in the array so i can take +1
        int sum = n * (n + 1) / 2;
        for(int i = 0; i < array.length; i ++){
            sum = sum - array[i];
        }
        System.out.println(sum);
    }
}
