package Collage_Class.PseudoCode.IF_ELSE;
import java.util.*;
public class Simple_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if(x>5){
            System.out.println(x + " is greater than 5.");
        }
    }
}
/*
DECLARE x : INTEGER
READ x
IF x>5 THEN
    PRINT " x is grater than 5. "
END IF
 */
