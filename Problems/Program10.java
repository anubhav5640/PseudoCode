package Collage_Class.PseudoCode.Problems;
public class Program10 {
    public static void main(String[] args) {
        int a, b, c;

        b = 0;
        c = 0;

        for (a = 1; a <= 5; a++) {
            System.out.print(c + " ");
            b = b + 1;
            c = c + b;
        }
    }
}

/*
PSEUDOCODE

INTEGER a, b, c
SET b = 0, c = 0

FOR EACH a FROM 1 TO 5 LOOP
    PRINT c
    b = b + 1
    c = c + b
NEXT a
*/
