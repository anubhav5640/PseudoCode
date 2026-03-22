package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, r, sum = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

/*
DECLARE n : INTEGER
DECLARE r : INTEGER
DECLARE sum : INTEGER
SET sum := 0
READ n
WHILE n > 0
    r := n MOD 10
    sum := sum + r
    n := n / 10
END WHILE
PRINT sum
*/