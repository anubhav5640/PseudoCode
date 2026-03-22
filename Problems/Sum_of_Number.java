package Collage_Class.PseudoCode.Problems;
public class Sum_of_Number {
    public static void main(String[] args) {
        int a, b, c, d;

        b = 10;
        c = 11;
        a = b - c;

        for (c = 2; c >= 0; c--) {
            b = b + c + 10;
            b = b / 2;
        }

        c = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

/*
PSEUDOCODE

INTEGER a, b, c, d
SET b := 10, c := 11
a := b - c

FOR EACH c FROM 2 TO 0 LOOP
    b := b + c + 10
    b := b / 2
NEXT c

c := a + b + c
PRINT a, b, c
*/