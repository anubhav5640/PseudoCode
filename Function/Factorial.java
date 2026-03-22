package Collage_Class.PseudoCode.Function;
public class Factorial {
    public static int factorial(int n) {
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

/*
PSEUDOCODE

FUNCTION factorial(n: INTEGER)
    DECLARE fact: INTEGER
    SET fact := 1

    FOR i := n TO 1 STEP -1
        fact := fact * i
    END FOR

    RETURN fact
END FUNCTION

PRINT factorial(5)
*/