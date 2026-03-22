package Collage_Class.PseudoCode.Loop;
import java.util.*;
public class SumOfSeries_1_to_n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}

/*
DECLARE n : INTEGER
DECLARE sum : INTEGER
SET sum := 0
READ n
FOR i := 1 TO n
    sum := sum + i
END FOR
PRINT sum
*/