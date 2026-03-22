package Collage_Class.PseudoCode.Function;
public class ReverseNumber {
    public static int reverse(int n) {
        int a, b = 0;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b * 10 + a;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}

/*
PSEUDOCODE

FUNCTION reverse(n: INTEGER): INTEGER
    DECLARE a, b: INTEGER
    SET b := 0

    WHILE n > 0
        a := n MOD 10
        n := n / 10
        b := b * 10 + a
    END WHILE

    RETURN b
END FUNCTION

PRINT reverse(1234)
*/
