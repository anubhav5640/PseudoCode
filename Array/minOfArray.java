package Collage_Class.PseudoCode.Array;

import java.util.Scanner;

public class minOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
    }
}

/*IN
DECLARE A: ARRAY[10] OF INTEGER
DECLARE MIN: INTEGER
    FOR I:=0 TO 9
        READ A[I]
     END FOR
     SET MIN: = A[0]
     FOR I: = 0 TO 9
        IF A[I]<MIN THEN
            MIN: = A[I]
        END IF
     END FOR
PRINT MIN
 */