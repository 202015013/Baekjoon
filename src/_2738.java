import java.util.*;
public class _2738 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] C = new int[3][3];
        int[][] A = new int[a][b];
        int[][] B = new int[a][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                B[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}