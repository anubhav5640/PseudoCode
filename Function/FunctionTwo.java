package Collage_Class.PseudoCode.Function;
public class FunctionTwo {

    public static int funn(int a, int b) {
        int c;

        c = a + a + b + b;
        b = c + c + b + b;
        a = b - a;

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(funn(7, 4));
    }
}

/*
PSEUDOCODE

INTEGER funn(Integer a, Integer b)
    INTEGER c
    SET c := a + a + b + b
    b := c + c + b + b
    a := b - a
    RETURN a + b
END FUNCTION funn()
*/