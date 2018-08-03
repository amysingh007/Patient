package Demo;
class Patient {
    private String pname, phealthissue,pgender,pphno;
        private int page;
        public void insert(String name,int age,String gender,String phno,String healthissue)
        {
            pname=name;
            page=age;
            pgender=gender;
            pphno=phno;
            phealthissue=healthissue; 
        }
        public void display()
        {
             System.out.println("Patient name:" +pname);
             System.out.println("Patient age:" +page);
             System.out.println("Patient gender:" +pgender);
             System.out.println("Phone number:" +pphno);
             System.out.println("Patient's health issue:" +phealthissue); 
        }
}
public class PatientMainClass{
  public static void main(String args[])
    {
        
        Patient p=new Patient();
        p.insert("Amy",24,"f","423423423","eye");
        p.display();     
    }   
}