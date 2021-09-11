package composite.partten;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {
    List<Component> componentList =new ArrayList<>();

    @Override
    public Composite getComposite() {
        return this;
    }

    @Override
    public void operation() {
        Iterator<Component> it = componentList.iterator();
        //相当于打印整棵树
        while (it.hasNext()){
            it.next().operation();
        }
    }

    public void add(Component component){
        componentList.add(component);
    }

    public boolean remove(Component component){
        return componentList.remove(component);
    }
}
