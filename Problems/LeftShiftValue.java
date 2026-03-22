package Collage_Class.PseudoCode.Problems;
public class LeftShiftValue {
    public static void main(String[] args) {
        int value, n;

        value = 1;
        n = 45;

        while (value <= n) {
            value = value << 1;
        }

        System.out.println("Value = " + value);
    }
}

/*
PSEUDOCODE:

INTEGER value, n
SET value := 1, n := 45

WHILE value <= n
    value = value << 1
END WHILE

PRINT value
*/