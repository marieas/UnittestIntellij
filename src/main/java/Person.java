import java.util.List; //namespaces ikke using men import
import java.util.ArrayList;

public class Person {

    private String name;
    public List<Organ> Organs;

    public String getName() //properties er ikke likt i java, kan skrives på denne måten
    {
        return this.name;
    }
    public void setName(String name) {this.name = name;}

    public Person(){

    }

    public void PersonIsBorn(){
        Organs = new ArrayList<Organ>();
        Organs.add(new Organ("Kidney"));
        Organs.add(new Organ("Kidney"));
        Organs.add(new Organ("Heart"));
        Organs.add(new Organ("Liver"));
        Organs.add(new Organ("Guts"));
        Organs.add(new Stomack());
    }

}
