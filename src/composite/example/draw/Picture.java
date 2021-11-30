package composite.example.draw;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphics{
    public Picture(String content) {
        this.content = content;
    }

    List<Graphics> graphicsList=new ArrayList<>();

    String content;

    @Override
    public void draw() {
        System.out.println("this is "+content);
        for (Graphics graphics : graphicsList) {

           graphics.draw();
        }
    }

    public void add(Graphics graphics){
        graphicsList.add(graphics);
    }

    public void remove(Graphics graphics){
        graphicsList.remove(graphics);
    }

    public List<Graphics> getGraphicsList() {
        return graphicsList;
    }
}
