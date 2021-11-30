package composite.example.gof;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    List<Component> components=new ArrayList<>();

    String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name);
        for (Component component : components) {
          component.operate();
        }
    }

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }

    public Component get(int i){
        return components.get(i);
    }
}
