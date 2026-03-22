package Collage_Class.PseudoCode.Loop;
import java.util.*;
public class Do_While {
    public static void main(String[] args) {
        // 1 to 10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("-----");

        // 10 to 1
        int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);
    }
}


/*

1) PRINT 1 TO 10

DECLARE i : INTEGER
SET i := 1
REPEAT
    PRINT i
    INCREMENT i
UNTIL i > 10
END WHILEp

2) PRINT 10 TO 1

DECLARE j : INTEGER
SET j := 10
REPEAT
    PRINT j
    DECREMENT j
UNTIL j > 0
END WHILE
*/