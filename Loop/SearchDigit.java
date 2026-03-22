package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class SearchDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, r, d;
        boolean found = false;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        System.out.print("Enter digit to search: ");
        d = sc.nextInt();

        while (num > 0) {
            r = num % 10;
            num = num / 10;

            if (r == d) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Search Successful");
        } else {
            System.out.println("Search Unsuccessful");
        }

        sc.close();
    }
}

/*
DECLARE num : INTEGER
DECLARE r : INTEGER
DECLARE d : INTEGER
DECLARE found : BOOLEAN
READ num
READ d
WHILE num > 0
    r := num MOD 10
    num := num / 10
    IF r == d THEN
        found := TRUE
        BREAK
    END IF
END WHILE
IF found == TRUE THEN
    PRINT "Search Successful"
ELSE
    PRINT "Search Unsuccessful"
END IF
*/