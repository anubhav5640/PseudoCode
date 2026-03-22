package Collage_Class.PseudoCode.Loop;
public class SumLoop {
    public static void main(String[] args) {

        int x = 0;
        int n = 1;

        while (n <= 100) {
            x = x + n;
            n = n + 1;
        }

        System.out.println(x);
    }
}

/*
PSEUDOCODE

Set x = 0
Set n = 1

while (n <= 100)
    x = x + n
    n = n + 1
end while

write x
*/