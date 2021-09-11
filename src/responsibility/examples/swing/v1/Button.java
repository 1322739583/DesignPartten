package responsibility.examples.swing.v1;

public class Button extends View{

    @Override
    public boolean interceptRequest() {
        return true;
    }
}
