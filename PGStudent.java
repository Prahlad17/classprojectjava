public class PGStudent extends Student{
    private String specialization;
    private final String UGDegree;
    
 
   public PGStudent (String USN,String name,String specialization,String UGDegree){
    super(USN,name);


   }
   public String getSpecialization(){
    return specialization;
   }
   public void setSpecialization(String specialization){
    this.specialization=specialization;
   }
   public String c(){
    return UGDegree;
   }
   public void setUGDegree(String UGDegree){
    this.UGDegree=UGDegree;
   }
    
}
