import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in); //In this code you have to take input from the user
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                System.out.print(matrix[i][j] + " "); //This print matrix
            }
            System.out.println();
        }
        sc.close();
    }
}
