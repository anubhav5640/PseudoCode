package Collage_Class.PseudoCode.Problems;
public class Program4Bitwise {
    public static void main(String[] args) {
        int p, q, r, s;

        p = 4;
        q = 2;
        r = 1;

        s = (p & q) | (r + 1);

        System.out.println(s);
    }
}

/*
PSEUDOCODE

INTEGER p, q, r, s
SET p := 4, q := 2, r := 1

s := (p AND q) OR (r + 1)

PRINT s
*/
