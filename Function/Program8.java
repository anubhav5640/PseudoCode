package Collage_Class.PseudoCode.Function;
public class Program8 {
    public static int sample(int n) {
        int i = 0;
        int s = 0;
        int r, p;

        while (n > 0) {
            r = n % 10;
            p = 8 ^ i;
            s = s + p * r;
            i++;
            n = n / 10;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(sample(127));
    }
}

/*
PSEUDOCODE

Read n
i := 0, s := 0

Function Sample(int n)
    while (n > 0)
        r := n % 10
        p := 8 ^ i
        s := s + p * r
        i++
        n := n / 10
    end while

    return s
*/