package composite.example.draw;

public class Circle implements Graphics{
    String content;

    public Circle(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("This is "+content);
    }
}
