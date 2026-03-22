package Collage_Class.PseudoCode.Function;
public class MaxFunction {
    public static int max(int a, int b) {
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(max(23, 6));
    }
}

/*
PSEUDOCODE

FUNCTION max(a: INTEGER, b: INTEGER): INTEGER
    DECLARE c: INTEGER
    IF a > b THEN
        c := a
    ELSE
        c := b
    END IF
    RETURN c
END FUNCTION

PRINT max(23, 6)
*/