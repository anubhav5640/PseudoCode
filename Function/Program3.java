package Collage_Class.PseudoCode.Function;
public class Program3 {
    public static int funn(int a, int b, int c) {

        if (((c ^ b) + a) < (a & c)) {
            b = a ^ b;
            c = (a + 3) + c;
        }

        if (((3 ^ b) + (c ^ c)) > (11 & c)) {
            b = (c + 12) ^ a;
        }

        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(funn(2, 6, 1));
    }
}

/*
PSEUDOCODE

INTEGER funn(Integer a, Integer b, Integer c)

IF (((c ^ b) + a) < (a & c))
    b := a ^ b
    c := (a + 3) + c
END IF

IF (((3 ^ b) + (c ^ c)) > (11 & c))
    b := (c + 12) ^ a
END IF

RETURN a + b + c
*/