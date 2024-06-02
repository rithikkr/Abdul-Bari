public class MergeArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int b[] = {70, 60, 80, 50};

        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1 + b1;

        int c[] = new int[c1];

        for(int i = 0; i < a1; i ++){
            c[i] = a[i];
        }

        for(int i = 0; i < b1; i ++){ //Storing the element in the resultant array
            c[a1 + i] = b[i];
        }

        for(int i = 0; i < c1; i ++){ //For printing the element
            System.out.print(c[i] + " ");
        }
    }
}
