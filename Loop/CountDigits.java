package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, count = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Digits = " + count);

        sc.close();
    }
}

/*
DECLARE n : INTEGER
DECLARE count : INTEGER
SET count := 0
READ n
WHILE n > 0
    n := n / 10
    INCREMENT count
END WHILE
PRINT count
*/
