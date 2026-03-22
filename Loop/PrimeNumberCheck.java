package Collage_Class.PseudoCode.Loop;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            for (i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            }
        }

        sc.close();
    }
}

/*
PSEUDOCODE:

DECLARE n : INTEGER
DECLARE i : INTEGER

READ n

FOR i := 2 TO n - 1
    IF n MOD i == 0 THEN
        PRINT "Not Prime"
        BREAK
    END IF
END FOR

IF no divisor is found THEN
    PRINT "Prime"
END IF
*/