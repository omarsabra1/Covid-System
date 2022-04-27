import javax.xml.crypto.Data;
import java.util.Date;

public class Dose {
  String manufactory;
  Date dateCreated;
  String place;
  int i;
  public Dose(){}

  public Dose(String manufactory , String place) {
    this.manufactory = manufactory;
    this.place=place;
    i++;
  }

  public String getManufactory() {
    return manufactory;
  }

  public void setManufactory(String manufactory) {
    this.manufactory = manufactory;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  @Override
  public String toString() {
    return "Dose{" +
            "manufactory='" + manufactory + '\'' +
            ", dateCreated=" + dateCreated +
            ", place='" + place + '\'' +
            '}';
  }
}
