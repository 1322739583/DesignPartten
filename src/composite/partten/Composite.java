package composite.partten;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {
    List<Component> componentList =new ArrayList<>();

    public String getName() {
        return name;
    }

    private String name;

    public Composite(String name) {
      this.name=name;
    }

    @Override
    public Composite getComposite() {
        return this;
    }

    @Override
    public void operation() {
        Iterator<Component> it = componentList.iterator();
        //相当于打印整棵树
        while (it.hasNext()){
            System.out.println(name);
            it.next().operation();
          //  System.out.println(it.next().getComposite().getName());
        }
    }

    public void add(Component component){
        componentList.add(component);
    }

    public boolean remove(Component component){
        return componentList.remove(component);
    }
}
