package Collage_Class.PseudoCode.Loop;
public class WhileLoopExample {
    public static void main(String[] args) {

        int a = 50;
        int b = 3;
        int c = 3;
        int d;
        int e = 0;

        while (c > 0) {
            d = a % b;
            e = e + d + a;
            c = c - 1;
        }

        System.out.println(e);
    }
}

/*
PSEUDOCODE

Integer a, b, c, d, e
Set a = 50, b = 3, c = 3, e = 0

while (c > 0)
    d = a mod b
    e = e + d + a
    c = c - 1
end while

Print e
*/