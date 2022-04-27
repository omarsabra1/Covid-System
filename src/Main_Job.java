import java.io.IOException;
import java.util.ArrayList;

public class Main_Job {
 public static void main(String[] args) throws IOException {
 Test t=new Test();
 Health_Professionals h1=new Health_Professionals("mo","Male",213,35,2,5);
 Citizen c =new Citizen("omar","female",123,34,0);
 t.addCitizen(c);
 t.addDoseToCitizen(h1,new Dose("omar","care"));
 t.saveIntoFile();
 }
}
