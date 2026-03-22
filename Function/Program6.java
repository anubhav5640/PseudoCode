package Collage_Class.PseudoCode.Function;
public class Program6 {
    public static int countBits(int n) {
        int count = 0;

        while (n > 0) {
            count = count + (n % 2);
            n = n / 2;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(42));
    }
}

/*
PSEUDOCODE

What's the output for n = 42?

Integer countBits(Integer n)
    Integer count := 0

    while (n > 0)
        count := count + (n mod 2)
        n := n / 2
    end while

    return count
End function
*/
