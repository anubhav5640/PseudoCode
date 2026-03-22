package Collage_Class.PseudoCode.Problems;
public class Program14 {
    public static void main(String[] args) {
        int p, q, r;

        p = 6;
        q = 4;
        r = 4;

        r = (r + p) + q;

        if ((q + p) < (10 - q)) {
            r = 12 + q;
            p = r + r;
            q = (q + 4) + r;
        }

        System.out.println(p + q + r);
    }
}

/*
PSEUDOCODE

INTEGER p, q, r
SET p = 6, q = 4, r = 4

r = (r + p) + q

IF ((q + p) < (10 - q))
    r = 12 + q
    p = r + r
    q = (q + 4) + r
END IF

PRINT p + q + r
*/