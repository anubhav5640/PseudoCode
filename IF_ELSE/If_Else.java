package Collage_Class.PseudoCode.IF_ELSE;
import java.util.*;
public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if(x>5){
            System.out.println(x + " is greater than 5.");
        }
        else{
            System.out.println(x + " is less than 5. ");
        }
    }
}
/*
DECLARE x : INTEGER
READ x
IF x>5 THEN
    PRINT " x is grater than 5. "
ELSE
    PRINT "X is less than 5. "
END IF
 */
