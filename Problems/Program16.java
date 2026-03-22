package Collage_Class.PseudoCode.Problems;
public class Program16 {
    public static void main(String[] args) {
        int value, n;

        value = 32;
        n = 1;

        while (value >= n) {
            value = value >> 1;
        }

        System.out.println(value);
    }
}

/*
PSEUDOCODE

INTEGER value, n
SET value := 32, n := 1

WHILE value GREATER THAN OR EQUAL TO n LOOP
    value <- value >> 1
END LOOP

PRINT value
*/