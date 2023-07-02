import java.util.Scanner;

public class StudentUniversity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 =new Scanner(System.in);
        UGStudent[] stud1= new UGStudent[10];
        Student[] stud2= new PGStudent[10];
        
        System.out.println("Data inputs for the UG Students");
        for (int i = 0; i < 1; i++) {
            String USN=in.nextLine();
            String Name=in.nextLine();
            int semester=in1.nextInt();
            String branch=in1.nextLine();

           stud1[i]=new UGStudent(USN,Name,semester,branch);
        }
        System.out.println("Data inputs for the PG Students");
        for (int i = 0; i < 1; i++) {
            String USN=in.nextLine();
            String Name=in.nextLine();
            String specialization=in.nextLine();
            String UGDegree=in.nextLine();

            stud2[i]=new PGStudent(USN,Name,specialization,UGDegree);
        }



    }
}
