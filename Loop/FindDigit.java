package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class FindDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, r, digit;
        boolean found = false;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        System.out.print("Enter digit to find: ");
        digit = sc.nextInt();

        while (num > 0) {
            r = num % 10;

            if (r == digit) {
                found = true;
                break;
            }

            num = num / 10;
        }

        if (found) {
            System.out.println("Digit Found");
        } else {
            System.out.println("Digit Not Found");
        }

        sc.close();
    }
}

/*
DECLARE num : INTEGER
DECLARE r : INTEGER
DECLARE digit : INTEGER
DECLARE found : BOOLEAN
SET found := FALSE
READ num
READ digit
WHILE num > 0
    r := num MOD 10
    IF r == digit THEN
        found := TRUE
        BREAK
    END IF
    num := num / 10
END WHILE
IF found == TRUE THEN
    PRINT "Digit Found"
ELSE
    PRINT "Digit Not Found"
END IF
*/