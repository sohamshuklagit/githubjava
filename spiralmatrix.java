import java.util.*;
public class spiralmatrix{
    static void generateSpiral(int m, int n){
        int[][] matrix = new int[m][n];
        int iterations = 1, i, j, total = m*n;
        int row_current = 0, col_current = 0;;
        int row_end = m - 1, col_end = n - 1;
       

        while (iterations <= total) {
            for (i = col_current; i <= col_end; i++) {
                matrix[row_current][i]=iterations++;
            }
            row_current++;

            for (i = row_current; i <= row_end; i++) {
                matrix[i][col_end]=iterations++;
            }
            col_end--;

            if (row_current <= row_end) {
                for (i = col_end; i >=col_current; i--) {
                    matrix[row_end][i] = iterations++;
                }
                row_end--;
            }

            if (col_current <= col_end) {
                for (i = row_end; i >= row_current; i --) {
                    matrix[i][col_current] = iterations++;
                }
                col_current++;
            }
        }
       
        for (i = 0; i < m; i ++){
            for (j = 0; j < n; j++)
                System.out.print(matrix[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of rows and colummns: ");
        int rows = in.nextInt();
        int colummns = in.nextInt();

        System.out.println("Spiral: ");
        generateSpiral(rows, colummns);

        in.close();
    }
}