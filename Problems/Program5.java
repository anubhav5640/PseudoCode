package Collage_Class.PseudoCode.Problems;
public class Program5 {
    public static void main(String[] args) {

        int a, b, c;

        a = 7;
        b = 8;
        c = 9;

        if ((a ^ b ^ c) < (b + c + a)) {
            b = 6 + a;
        }

        a = 8 ^ b;

        System.out.println(a + b + c);

    }
}

/*
PSEUDOCODE

Integer a, b, c
Set a = 7, b = 8, c = 9

if ((a ^ b ^ c) < (b + c + a))
    b = 6 + a
End if

a = 8 ^ b

Print a + b + c
*/
