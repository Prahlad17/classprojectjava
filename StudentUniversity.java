import java.util.*;
public class University {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] stud1 = new Student[10]();
       
       String USN=in.nextLine();
       String Name=in.nextLine();
       int semester=in.nextInt();
       String branch=in.nextLine();
       String specialization=in.nextLine();
       String UGDegree=in.nextLine();
       UGStudent(USN,Name,semester,branch);
       PGStudent(USN,Name,specialization,UGDegree);

    }
    
}
