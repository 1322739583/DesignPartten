package composite.example.school;

import java.util.ArrayList;
import java.util.List;

public abstract class OrgComponent {

    private String name;
    private String des;

    public OrgComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void add(OrgComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrgComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();

}
