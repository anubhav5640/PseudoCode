package Collage_Class.PseudoCode.Function;
public class Program5 {
    public static int funn(int a, int b, int c) {

        b = (a ^ 11) & b;

        for (c = 3; c <= 6; c++) {
            b = 3 + c;

            if ((1 < b) || ((a & c) < (5 - a))) {
                a = (c + 2) + c;
                b = c + c;
                break;
            }
        }

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(funn(4, 8, 57));
    }
}

/*
PSEUDOCODE

a := 4, b := 8, c := 57

Integer funn(Integer a, Integer b, Integer c)
    b := (a ^ 11) & b

    for each c from 3 to 6
        b := 3 + c

        if (1 < b || (a & c) < (5 - a))
            a := (c + 2) + c
            b := c + c
            jump out of the loop
        end if
    end for

    return a + b
End fun
*/
