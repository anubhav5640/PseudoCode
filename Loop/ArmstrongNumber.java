package Collage_Class.PseudoCode.Loop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, r, b = 0, x;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        x = n;

        while (n > 0) {
            r = n % 10;
            b = b + (r * r * r);
            n = n / 10;
        }

        if (b == x) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}

/*
DECLARE n : INTEGER
DECLARE r : INTEGER
DECLARE b : INTEGER
DECLARE x : INTEGER
SET b := 0
READ n
SET x := n
WHILE n > 0
    r := n MOD 10
    b := b + r*r*r
    n := n / 10
END WHILE
IF b == x THEN
    PRINT "Armstrong"
ELSE
    PRINT "Not Armstrong"
END IF
*/
