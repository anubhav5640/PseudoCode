package Collage_Class.PseudoCode.Loop;
public class LoopBreakExample {
    public static void main(String[] args) {

        int p = 0;
        int q = 2;
        int r = 9;

        r = 7 + p;
        q = q + r;

        for (r = 4; r <= 7; r++) {

            p = (p + p) & q;

            if ((p + q) < (r - p) && (8 < p)) {
                p = (p + 2) + q;
                break;
            }
        }

        System.out.println(p + q);
    }
}

/*
PSEUDOCODE

Integer p, q, r

Set p = 0, q = 2, r = 9

r = 7 + p
q = q + r

for each r from 4 to 7
    p = (p + p) & q
    if ((p + q) < (r - p) AND (8 < p))
        p = (p + 2) + q
        jump out of the loop
    end if
end for
*/