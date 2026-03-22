package Collage_Class.PseudoCode.Function;
public class FunctionOne {

    public static int funn(int a, int b, int c) {

        for (c = 3; c <= 5; c++) {
            a = (c + c) ^ b;

            if ((a + c) < (c + a)) {
                b = (a + 11) + c;
            } else {
                c = b + b;
                a = 3 + b;
                continue;
            }
        }

        return a + b;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = a;
        int c = 7;

        System.out.println(funn(a, b, c));
    }
}

/*
PSEUDOCODE

INTEGER funn(Integer a, Integer b, Integer c)

FOR each c from 3 to 5
    a := (c + c) ^ b

    IF ((a + c) < (c + a))
        b := (a + 11) + c
    ELSE
        c := b + b
        a := 3 + b
        CONTINUE
    END IF
END FOR

RETURN a + b
*/