package Collage_Class.PseudoCode.Function;
public class Program2 {
    public static int computeValue(int a, int b) {
        int result = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a;
            }

            a = a * a;
            b = b / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(computeValue(4, 3));
    }
}

/*
PSEUDOCODE

INTEGER ComputeValue(Integer a, Integer b)
    INTEGER result := 1

    WHILE (b > 0)
        IF (b MOD 2 EQUALS 1)
            result := result * a
        END IF

        a := a * a
        b := b / 2
    END WHILE

    RETURN result
END FUNCTION
*/