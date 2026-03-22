package Collage_Class.PseudoCode.Problems;
public class Program9 {
    public static void main(String[] args) {
        int a, b, c;

        b = 4;
        c = 5;

        for (a = 2; a <= 4; a++) {
            System.out.print(c + " ");
            b = b - 1;
            c = c + b;
        }
    }
}

/*
PSEUDOCODE

INTEGER a, b, c
SET b = 4, c = 5

FOR EACH a FROM 2 TO 4 LOOP
    PRINT c
    b = b - 1
    c = c + b
NEXT FOR
*/