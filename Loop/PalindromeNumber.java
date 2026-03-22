package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, r, rev = 0, original;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        original = n;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
DECLARE n : INTEGER
DECLARE r : INTEGER
DECLARE rev : INTEGER
DECLARE original : INTEGER
SET rev := 0
READ n
SET original := n
WHILE n > 0
    r := n MOD 10
    rev := rev * 10 + r
    n := n / 10
END WHILE
IF rev == original THEN
    PRINT "Palindrome"
ELSE
    PRINT "Not Palindrome"
END IF
*/