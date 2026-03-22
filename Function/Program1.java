package Collage_Class.PseudoCode.Function;
public class Program1 {
    public static int fun(int a, int b, int c) {
        if (((c & a) < a) && ((a ^ b) < b)) {
            c = (a ^ 2) + b;
        }

        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(fun(5, 5, 5));
    }
}

/*
PSEUDOCODE

INTEGER fun(Integer a, Integer b, Integer c)
    IF ((c & a) < a && (a ^ b) < b)
        c := (a ^ 2) + b
    END IF

    RETURN a + b + c
END fun
*/