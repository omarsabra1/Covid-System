import java.awt.*;

public class Health_Professionals extends Citizen{
int experience;
int i;

    public Health_Professionals(String name, String gender, int id, int age, int dos, int experience) {
        super(name, gender, id, age, dos);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Health_Professionals{" +
                "experience=" + experience +
                '}';
    }
}
