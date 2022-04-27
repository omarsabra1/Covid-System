import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
       static ArrayList<Citizen> citizenList=new ArrayList<>();
       static ArrayList<String>doseArrayList=new ArrayList<>();
       static int count;
        int i;

    public Test() {
        i++;
    }

    public ArrayList<Citizen> getCitizenArrayList() {
        return citizenList;
    }

    public void setCitizenArrayList(ArrayList<Citizen> citizenArrayList) {
        this.citizenList = citizenArrayList;
    }

    public ArrayList<String> getDoseArrayList() {
        return doseArrayList;
    }

    public void setDoseArrayList(ArrayList<String> doseArrayList) {
        this.doseArrayList = doseArrayList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void addCitizen(Citizen newCitizen){
        citizenList.add(newCitizen);
    }

    public void addDoseToCitizen(Health_Professionals hp,Dose dose){
       doseArrayList.add(dose.manufactory);
    }

    public void saveIntoFile() throws IOException {
        File file;

        BufferedWriter writer=new BufferedWriter(new FileWriter("out.txt"));
        for (int i = 0; i< citizenList.size(); i++) {
            writer.write(citizenList.get(i) + " "
                    +     doseArrayList.get(i) + " "
            );
        }
        writer.close();

    }

}
