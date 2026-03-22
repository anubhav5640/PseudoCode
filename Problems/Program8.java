package Collage_Class.PseudoCode.Problems;
public class Program8 {
    public static void main(String[] args) {
        int a, b;

        a = 2;
        b = 50;

        while (b > 0) {
            a = (b % 2) + a;

            if (a % 3 == 0) {
                System.out.println(a);
            } else {
                System.out.println(b - 1);
            }

            b = b / 5;
            a = a + 1;
        }
    }
}

/*
PSEUDOCODE

Integer a, b
Set a = 2, b = 50

while (b > 0)
    a = b MOD 2 + a

    if (a MOD 3 IS EQUAL TO 0)
        Print(a)
    else
        Print(b - 1)
    end if

    b = b / 5
    a = a + 1
end while
*/
