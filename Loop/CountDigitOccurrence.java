package Collage_Class.PseudoCode.Loop;
import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, r, d, cnt = 0;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        System.out.print("Enter digit to count: ");
        d = sc.nextInt();

        while (num > 0) {
            r = num % 10;
            num = num / 10;

            if (r == d) {
                cnt++;
            }
        }

        System.out.println("Count = " + cnt);

        sc.close();
    }
}

/*
DECLARE num : INTEGER
DECLARE r : INTEGER
DECLARE d : INTEGER
DECLARE cnt : INTEGER
SET cnt := 0
READ num
READ d
WHILE num > 0
    r := num MOD 10
    num := num / 10
    IF r == d THEN
        INCREMENT cnt
    END IF
END WHILE
PRINT cnt
*/
