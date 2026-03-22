package Collage_Class.PseudoCode.IF_ELSE;
import java.util.*;
public class Marks_Grade {
    public static void main(String[] args) {
        int marks = 90;
        if(marks >= 80){
            System.out.println("A");
        } else if (marks > 60) {
            System.out.println("B");
        } else if (marks > 40) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }
    }
}
/*
DECLARE marks : INTEGER
READ marks
IF marks >= 80 THEN
PRINT " A "
ELSE IF marks >= 60 THEN
PRINT "B"
ELSE IF marks >= 40 THEN
PRINT "C"
ELSE
PRINT "F"
END IF
 */
