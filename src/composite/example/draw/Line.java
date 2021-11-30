package composite.example.draw;

public class Line implements Graphics{
    String content;

    public Line(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("This is "+content);
    }
}
