package Collage_Class.PseudoCode.Function;

public class Area {

    public static double aot(double base, double height) {
        return 0.5 * base * height;
    }

    public static double aoc(double rad) {
        return 3.14 * rad * rad;
    }

    public static void main(String[] args) {
        System.out.println(aot(5.5, 9.2));
        System.out.println(aoc(6.6));

    }
}
/*
PSEUDOCODE

FUNCTION aoc(rad: REAL): REAL
    RETURN 3.14 * rad * rad
END FUNCTION

PRINT aoc(6.6)

PSEUDOCODE

FUNCTION aoc(rad: REAL): REAL
    RETURN 3.14 * rad * rad
END FUNCTION

PRINT aoc(6.6)
 */
