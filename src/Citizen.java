import java.util.ArrayList;
import java.util.Objects;

public class Citizen {
    private String name ;
    private String gender;
    private int id;
    private int age;
    private int dos ;

    public Citizen() {
    }

    public Citizen(String name, String gender, int id, int age, int dos) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.dos = dos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDos() {
        if(dos==0) {
            System.out.println("You need dos");
            return 0;
        }else
            return dos;
    }

    public void setDos(int dos) {

        this.dos = dos;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", dos=" + dos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return id == citizen.id && age == citizen.age && dos == citizen.dos && Objects.equals(name, citizen.name) && Objects.equals(gender, citizen.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, id, age, dos);
    }
}
