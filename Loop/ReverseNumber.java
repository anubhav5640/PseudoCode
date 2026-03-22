package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, r, rev = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
        sc.close();
    }
}

/*
DECLARE n : INTEGER
DECLARE r : INTEGER
DECLARE rev : INTEGER
SET rev := 0
READ n
WHILE n > 0
    r := n MOD 10
    rev := rev * 10 + r
    n := n / 10
END WHILE
PRINT rev
*/
