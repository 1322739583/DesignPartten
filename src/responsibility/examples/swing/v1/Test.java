package responsibility.examples.swing.v1;

public class Test {
    public static void main(String[] args) {
        Event event=new Event();
        event.setAction(Event.ACTION_DOWN);

        Button button=new Button();
        ViewGroup viewGroup=new ViewGroup();
        ViewGroup2 viewGroup2=new ViewGroup2();
        button.setTarget(viewGroup);
        viewGroup.setTarget(viewGroup2);
        button.onTouchEvent(event);

    }
}
