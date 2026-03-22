package Collage_Class.PseudoCode.Function;
public class PalindromeNumber {

    public static String palindrome(int n) {
        int a;
        int b;
        int x;

        b = 0;
        x = n;

        while (n > 0) {
            a = n % 10;
            b = b * 10 + a;
            n = n / 10;
        }

        if (b == x) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }
}

/*
PSEUDOCODE

FUNCTION Palindrome(n: INTEGER)
    DECLARE a: INTEGER
    DECLARE b: INTEGER
    DECLARE x: INTEGER

    SET b := 0
    READ n
    SET x := n

    WHILE n > 0 LOOP
        a := n MOD 10
        b := b * 10 + a
        n := n / 10
    END WHILE

    IF b == x THEN
        RETURN Palindrome
    ELSE
        RETURN Not Palindrome
    END IF
END FUNCTION

PRINT Palindrome(12321)
*/