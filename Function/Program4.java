package Collage_Class.PseudoCode.Function;
public class Program4 {
    public static int funn(int a, int b, int c) {
        if ((a ^ 8) < 8) {
            c = a + c;
            c = a + c;
        }

        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(funn(3, 8, 7));
    }
}

/*
PSEUDOCODE

INTEGER funn(Integer a, Integer b, Integer c)
    IF ((a ^ 8) < 8)
        c := a + c
        c := a + c
    END IF

    RETURN a + b + c
END FUNCTION
*/