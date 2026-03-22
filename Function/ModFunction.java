package Collage_Class.PseudoCode.Function;
public class ModFunction {
    public static int funn(int a, int b) {
        int c = 2;

        b = b % c;
        a = a % c;

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(funn(9, 7));
    }
}

/*
PSEUDOCODE

INTEGER funn(INTEGER a, INTEGER b)
    DECLARE c: INTEGER
    SET c := 2

    b := b mod c
    a := a mod c

    RETURN a + b
END FUNCTION
*/