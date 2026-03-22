package Collage_Class.PseudoCode.Problems;
public class Program3 {
    public static void main(String[] args) {

        int a, b, c;

        a = 4;
        b = 4;
        c = 4;

        if ((a & (b ^ b) & c) != 0) {
            a = a >> 1;
        }

        System.out.println(a + b + c);

    }
}

/*
PSEUDOCODE

Set a = 4, b = 4, c = 4

if (a & (b ^ b) & c)
    a = a >> 1
End if

Print a + b + c
*/