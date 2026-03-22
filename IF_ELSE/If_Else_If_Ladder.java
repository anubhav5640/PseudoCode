package Collage_Class.PseudoCode.IF_ELSE;
import java.util.*;
public class If_Else_If_Ladder {
    public static void main(String[] args) {
        int num = 5;
        if(num > 5){
            System.out.println( num + " is grater than 5");
        }
        else if(num == 5){
            System.out.println(num + " is equal to 5");
        }
        else{
            System.out.println(num + " is less than 5");
        }
    }
}
/*
DECLARE num : INTEGER
READ num
IF x>5 THEN
PRINT " x is grater than 5. "
ELSE IF x == 5 THEN
PRINT " x is equal to 5"
ELSE
PRINT "X is less than 5. "
END IF
 */

