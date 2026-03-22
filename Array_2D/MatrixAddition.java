package Collage_Class.PseudoCode.Array_2D;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];

        // Read matrices
        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                x[r][c] = sc.nextInt();
                y[r][c] = sc.nextInt();
            }
        }

        // Addition
        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                z[r][c] = x[r][c] + y[r][c];
            }
        }

        // Print result
        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                System.out.print(z[r][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
PSEUDOCODE

DECLARE x : ARRAY[3][3] OF INTEGER
DECLARE y : ARRAY[3][3] OF INTEGER
DECLARE z : ARRAY[3][3] OF INTEGER

FOR r := 0 TO 2
    FOR c := 0 TO 2
        READ x[r][c]
        READ y[r][c]
    END FOR
END FOR

FOR r := 0 TO 2
    FOR c := 0 TO 2
        z[r][c] := x[r][c] + y[r][c]
    END FOR
END FOR

FOR r := 0 TO 2
    FOR c := 0 TO 2
        PRINT z[r][c]
    END FOR
END FOR
*/