package Collage_Class.PseudoCode.Loop;

public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}

/*
FOR i := 1 TO 10
    IF i == 5 THEN
        CONTINUE
    END IF
    PRINT i
END FOR
*/
