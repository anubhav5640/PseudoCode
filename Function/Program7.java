package Collage_Class.PseudoCode.Function;
public class Program7 {
    public static int divisible(int number) {
        int even_counter = 0;
        int num_remainder = number;
        int digit;

        while (num_remainder > 0) {
            digit = num_remainder % 10;

            if (digit != 0 && number % digit == 0) {
                even_counter = even_counter + 1;
            }

            num_remainder = num_remainder / 10;
        }

        return even_counter;
    }

    public static void main(String[] args) {
        System.out.println(divisible(2630));
    }
}

/*
PSEUDOCODE

Read number
Function divisible(number)
    even_counter := 0
    num_remainder := number

    while (num_remainder > 0)
        digit := num_remainder % 10

        if digit != 0 AND number % digit == 0
            even_counter := even_counter + 1
        end if

        num_remainder := num_remainder / 10
    end while

    return even_counter
*/
