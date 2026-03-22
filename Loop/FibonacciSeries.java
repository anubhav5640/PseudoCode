package Collage_Class.PseudoCode.Loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int prev;
        int next;
        int sum;

        prev = 0;
        next = 1;
        sum = 0;

        System.out.print("Enter limit: ");
        n = sc.nextInt();

        System.out.print(prev + " " + next + " ");

        while (sum <= n) {
            sum = prev + next;

            if (sum <= n) {
                System.out.print(sum + " ");
            }

            prev = next;
            next = sum;
        }

        sc.close();
    }
}

/*
PSEUDOCODE:

DECLARE n : INTEGER
DECLARE prev : INTEGER
DECLARE next : INTEGER
DECLARE sum : INTEGER

SET prev := 0, next := 1, sum := 0
READ n
PRINT prev
PRINT next

WHILE sum <= n
    sum := prev + next
    IF sum <= n THEN
        PRINT sum
    END IF
    prev := next
    next := sum
END WHILE
*/