package Collage_Class.PseudoCode.Loop;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}

/*
FOR i := 1 TO 10
    IF i == 5 THEN
        BREAK
    END IF
    PRINT i
END FOR
*/