package Collage_Class.PseudoCode.Array;

import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}


/*IN
DECLARE A: ARRAY[10] OF INTEGER
DECLARE MIN: INTEGER
    FOR I:=0 TO 4
        READ A[I]
     END FOR
     SET MAX: = A[0]
     FOR I: = 0 TO 4
        IF A[I]>MAX THEN
            MAX: = A[I]
        END IF
     END FOR
PRINT MIN
 */