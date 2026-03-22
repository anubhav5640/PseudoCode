package Collage_Class.PseudoCode.IF_ELSE;

public class Nested_If {
    public static void main(String[] args) {
        String uid = "TIT";
        String pass = "Excellence";
        if(uid == "TIT"){
            if(pass == "Excellence"){
                System.out.println("WELCOME");
            }
            else{
                System.out.println("WRONG PASS");
            }
        }
        else{
            System.out.println("INVALID UID ");
        }
    }
}
/*
DECLARE uid : STRING
DECLARE pass : STRING
READ uid
READ pass
IF uid == "TIT" THEN
    IF pass == "Excellence" THEN
        PRINT "WELCOME"
    ELSE
        PRINT "WRONG PASS"
ELSE
    PRINT "INVALID UID"
END IF
*/