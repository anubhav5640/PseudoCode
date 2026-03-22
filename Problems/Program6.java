package Collage_Class.PseudoCode.Problems;
public class Program6 {
    public static void main(String[] args) {

        int p, q, r;

        p = 6;
        q = 3;
        r = 5;

        q = 1 + r - 6;
        q = 5 + q;

        if ((5 < r) || ((p + r) > (r - p))) {
            p = (q & 7) + p + p;
            q = 5 + q + q;
        }

        System.out.println(p + q + r);

    }
}

/*
PSEUDOCODE

Integer p, q, r

Set p = 6, q = 3, r = 5

q = 1 + r - 6
q = 5 + q

If (5 < r OR (p + r) > (r - p))
    p = (q & 7) + p + p
    q = 5 + q + q
End if

Print p + q + r
*/
