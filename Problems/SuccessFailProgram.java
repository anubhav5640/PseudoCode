package Collage_Class.PseudoCode.Problems;
public class SuccessFailProgram {
    public static void main(String[] args) {
        int p, q, r, sum;

        p = 3;
        q = 8;
        r = 1;

        sum = p + q + r;

        if ((p != 0) && (sum == 11) && (q == 4) && (r != 0)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}

/*
PSEUDOCODE

Integer p, q, r, sum
Read p, q, r
Set sum = p + q + r

if ((p NOT EQUALS 0) and (sum EQUALS 11) and (q EQUALS 4) and (r NOT EQUALS 0))
    Print "Success"
otherwise
    Print "Fail"
End if
*/
