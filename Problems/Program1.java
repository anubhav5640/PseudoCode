package Collage_Class.PseudoCode.Problems;
public class Program1 {
    public static void main(String[] args) {

        int x, y;

        x = 15;
        y = 12;

        y = x - 1;

        do {
            System.out.println(x);
            x = y + (x - 2);
        } while (x < 40);

    }
}

/*
PSEUDOCODE

Integer x, y
Set x = 15, y = 12
y = x - 1

do
    Print x
    x = y + (x - 2)
while (x < 40)

end do while
*/