package Collage_Class.PseudoCode.Array_2D;
import java.util.*;
public class MatrixReadPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[2][2];

        for (int r = 0; r <= 1; r++) {
            for (int c = 0; c <= 1; c++) {
                x[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r <= 1; r++) {
            for (int c = 0; c <= 1; c++) {
                System.out.print(x[r][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
PSEUDOCODE

DECLARE x : ARRAY[2][2] OF INTEGER

FOR r := 0 TO 1
    FOR c := 0 TO 1
        READ x[r][c]
    END FOR
END FOR

FOR r := 0 TO 1
    FOR c := 0 TO 1
        PRINT x[r][c]
    END FOR
END FOR
*/
