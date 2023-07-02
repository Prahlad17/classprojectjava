
public class UGStudent extends Student {
    private int semester;
    private String branch;
     
    public UGStudent(String USN,String Name,int semester,String branch){
        super(USN,Name);
        this.semester=semester;
        this.branch = branch;

    }
    //Getter and setter methods for the instance variables
    public int getSemester(){
        return semester ;
    }
    public void setSemester(int sem){
        this.semester =sem;
    }
    public String getbranch(String branch){
        return branch;
    }
    public void setbranch(String branch){
        this.branch = branch;
    }
}
