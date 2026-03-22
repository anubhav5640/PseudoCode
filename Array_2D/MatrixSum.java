package Collage_Class.PseudoCode.Array_2D;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[2][2];
        int sum = 0;

        for (int r = 0; r <= 1; r++) {
            for (int c = 0; c <= 1; c++) {
                x[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r <= 1; r++) {
            for (int c = 0; c <= 1; c++) {
                sum = sum + x[r][c];
            }
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

/*
PSEUDOCODE

DECLARE x : ARRAY[2][2] OF INTEGER
DECLARE Sum : INTEGER
SET Sum := 0

FOR r := 0 TO 1
    FOR c := 0 TO 1
        READ x[r][c]
    END FOR
END FOR

FOR r := 0 TO 1
    FOR c := 0 TO 1
        Sum := Sum + x[r][c]
    END FOR
END FOR

PRINT Sum
*/