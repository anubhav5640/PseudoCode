package Collage_Class.PseudoCode.Function;
public class HarmonicSeries {
    public static double sum(int n) {
        double s = 0.0;

        for (int i = 1; i <= n; i++) {
            s = s + (1.0 / i);
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

/*
PSEUDOCODE

FUNCTION sum(n: INTEGER): REAL
    DECLARE s: REAL
    SET s := 0.0

    FOR i := 1 TO n
        s := s + 1/i
    END FOR

    RETURN s
END FUNCTION

PRINT sum(5)
*/