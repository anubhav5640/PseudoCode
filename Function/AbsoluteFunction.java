package Collage_Class.PseudoCode.Function;
public class AbsoluteFunction {
    public static int absolute(int a) {
        if (a < 0) {
            return a * (-1);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(absolute(-5));
    }
}

/*
PSEUDOCODE

FUNCTION absolute(a: INTEGER): INTEGER
    IF a < 0 THEN
        RETURN a * (-1)
    ELSE
        RETURN a
END FUNCTION

PRINT absolute value
*/