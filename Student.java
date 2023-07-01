public class Student {
    private String USN;
    private String Name;
    
     public Student(String USN , String Name){
        
         this.USN=USN;
         this.Name=Name;
     } 
     public String getUSN(){
        return USN;
     }
     public void setUSN(String usn){
        this.USN=usn;
     }
     public String getName()  {
        return Name;
    }
    public void setName (String name)   {
        this.Name =name ;
    }
    
}
