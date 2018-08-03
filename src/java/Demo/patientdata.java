
package Patient;


class Patdata {
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

class overdata extends Patdata
{
    private String dname, specialist,hospitalname;
    int docid;
    
    public void insert(String name,int id,String special,String hospname)
        {
            dname=name;
            docid=id;
            specialist=special;
            hospitalname=hospname;

        }
        public void display()
        {
             System.out.println("Doctor name:" +dname);
             System.out.println("Doctor id:" +docid);
             System.out.println("Specialist:" +specialist);
             System.out.println("Hospital name:" +hospitalname);
             
        }
}

public class patientdata {
    public static void main(String args[])
    {
         Patdata p=new Patdata();
        p.insert("Amy",24,"f","423423423","eye");
        p.display();
    
        overdata o=new overdata();
        o.insert("Amy",24,"eye","jss");
        o.display();
      
    
    }   
    
}
