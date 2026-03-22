package Collage_Class.PseudoCode.Function;
public class SumSeries {
    public static int sum(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + i;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

/*
PSEUDOCODE

FUNCTION sum(n: INTEGER): INTEGER
    DECLARE s: INTEGER
    SET s := 0

    FOR i := 1 TO n
        s := s + i
    END FOR

    RETURN s
END FUNCTION

PRINT sum(5)
*/