package Collage_Class.PseudoCode.Array_2D;
import java.util.Scanner;

public class MatrixEvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[3][3];
        int odd = 0;
        int even = 0;

        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                x[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                if (x[r][c] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

        sc.close();
    }
}

/*
PSEUDOCODE

DECLARE x : ARRAY[3][3] OF INTEGER
DECLARE odd : INTEGER
DECLARE even : INTEGER
SET odd := 0, even := 0

FOR r := 0 TO 2
    FOR c := 0 TO 2
        READ x[r][c]
    END FOR
END FOR

FOR r := 0 TO 2
    FOR c := 0 TO 2
        IF x[r][c] MOD 2 EQUAL TO 0 THEN
            INCREMENT even
        ELSE
            INCREMENT odd
        END IF
    END FOR
END FOR

PRINT odd
PRINT even
*/