package Collage_Class.PseudoCode.IF_ELSE;
import java.util.*;
public class CaseOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value;
        System.out.print("Enter value: ");
        value = sc.nextInt();

        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
/*
CASE OF

DECLARE value : INTEGER
READ value

CASE OF valuee4sz
    1 : PRINT "One"
    2 : PRINT "Two"
    3 : PRINT "Three"
    4 : PRINT "Four"
OTHERWISE
    PRINT "Wrong"
END CASE7
 */
