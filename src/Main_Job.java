import java.io.IOException;
import java.util.ArrayList;

public class Main_Job {
 public static void main(String[] args) throws IOException {
 Test t=new Test();
 Health_Professionals h1=new Health_Professionals("mo","Male",213,35,2,5);
 Citizen c =new Citizen("omar","male",123,34,0);
 Citizen c2 =new Citizen("hamza","male",124,34,1);
 t.addCitizen(c);
 t.addCitizen(c2);
 t.addDoseToCitizen(h1,new Dose());
 t.addDoseToCitizen(h1,new Dose("Moderna","Hos"));
 t.saveIntoFile();
 }
}
