package composite.example.school;

import java.util.ArrayList;
import java.util.List;

public class College extends OrgComponent{



    List<OrgComponent> componentList =new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrgComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(OrgComponent component) {
        componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println("---------"+getName()+"----------");
        for (OrgComponent component : componentList) {
            component.print();
        }
    }
}
