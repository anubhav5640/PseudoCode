package Collage_Class.PseudoCode.Problems;

public class Program11 {
        public static void main(String[] args) {
            int a, b, c;

            a = 7;
            b = 10;
            c = 9;

            for (c = 3; c <= 4; c++) {
                a = b ;

                if ((b - a + c) < (c + b)) {
                    continue;
                } else {
                    break;
                }

                // This line is written in pseudocode,
                // but because of continue/break above, it never executes.
                // a = (5 + 6) ^ c;
            }

            System.out.println(a + b);
        }
    }

/*
PSEUDOCODE

Integer a, b, c
Set a = 7, b = 10, c = 9

for each c from 3 to 4
    a = b * a

    if ((b - a + c) < (c + b))
        continue
    else
        jump out of the loop
    end if

    a = (5 + 6) ^ c
end for

Print a + b
*/

