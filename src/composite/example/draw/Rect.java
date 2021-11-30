package composite.example.draw;

public class Rect implements Graphics{
    String content;

    public Rect(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("This is "+content);
    }
}
