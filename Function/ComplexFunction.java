package Collage_Class.PseudoCode.Function;
public class ComplexFunction {
    public static int funn(int a, int b, int c) {

        if ((a + c) < (b - a)) {
            c = a + b;
            b = (c + c) + b;
        } else {
            c = (a + 3) ^ a;  // bitwise XOR
            c = (10 & 8) + b;
        }

        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(funn(9, 7, 20));
    }
}

/*
PSEUDOCODE

INTEGER funn(Integer a, Integer b, Integer c)

IF (a + c) < (b - a)
    c := a + b
    b := (c + c) + b
ELSE
    c := (a + 3) ^ a
    c := (10 & 8) + b
END IF

RETURN a + b + c
*/