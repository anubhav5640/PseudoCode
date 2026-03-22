package Collage_Class.PseudoCode.IF_ELSE;
import java.util.*;
public class Quadrant {
    public static void main(String[] args) {
        int x = 5;
        int y = -3;

        if(x >= 0 && y > 0 ){
            System.out.println("1st Quadrant");
        }
        else if (x < 0 && y > 0 ){
            System.out.println("2nd Quadrant");
        }
        else if (x < 0 && y < 0 ){
            System.out.println("2nd Quadrant");
        }
        else if (x > 0 && y < 0 ){
            System.out.println("4nd Quadrant");
        }
        else{
            System.out.println("Point is in Origin");
        }
    }
}
/*
DECLARE x : INTEGER
DECLARE y : INTEGER
READ x
READ y
IF x > 0 AND y > 0 THEN
PRINT " 1nd Quadrant "
ELSE IF x < 0 AND y > 0 THEN
PRINT "2nd Quadrant"
ELSE IF x < 0 AND y < 0 THEN
PRINT "3nd Quadrant"
ELSE IF x > 0 AND y < 0 THEN
PRINT "4nd Quadrant"
ELSE
PRINT "Point is in Origin"
END IF
 */

