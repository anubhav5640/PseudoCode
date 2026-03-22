package Collage_Class.PseudoCode.Problems;
public class Program4 {
    public static void main(String[] args) {

        int a, b, c;

        a = 2;
        b = 5;
        c = 10;

        for (c = 3; c <= 6; c++) {

            a = (a + a) + a;
            a = (a ^ 11) + c;
        }

        b = (c + 7) + a;

        System.out.println(a + b);

    }
}

/*
PSEUDOCODE

Integer a, b, c
Set a = 2, b = 5, c = 10

for each c from 3 to 6
    a = (a + a) + a
    a = (a ^ 11) + c
End for

b = (c + 7) + a

Print a + b
*/