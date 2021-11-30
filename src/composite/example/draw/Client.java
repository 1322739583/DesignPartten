package composite.example.draw;

/**
 * 这个例子不是特别的恰当，搞得好像组合模式是用来做遍历的
 */
public class Client {
    public static void main(String[] args) {
        Picture picture=new Picture("picture");
        Line line=new Line("line");
        picture.add(line);
        Picture subPicture=new Picture("subPicture");
        Circle circle=new Circle("circle");
        subPicture.add(circle);
        Rect rect=new Rect("rect");
        subPicture.add(rect);
        picture.add(subPicture);
        picture.draw();


    }
}
