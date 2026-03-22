package Collage_Class.PseudoCode.Function;
public class ComplexLoop {
    public static int funn(int a, int b, int c) {

        for (c = 4; c <= 7; c++) {
            a = (a + 11) * b;
            a = (c + 3) + b;
        }

        b = (5 + 10) + 9;   // = 24
        a = (10 + 8) + 9;   // = 27

        for (c = 2; c <= 5; c++) {
            a = (10 + 2) & a;
            b = (3 + 4) + 9;
        }

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(funn(6, 9, 2));
    }
}

/*
PSEUDOCODE

INTEGER funn(Integer a, Integer b, Integer c)

FOR each c from 4 to 7
    a := (a + 11) * b
    a := (c + 3) + b
END FOR

b := (5 + 10) + 9
a := (10 + 8) + 9

FOR each c from 2 to 5
    a := (10 + 2) & a
    b := (3 + 4) + 9
END FOR

RETURN a + b
*/
