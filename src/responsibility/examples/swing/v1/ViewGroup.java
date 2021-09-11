package responsibility.examples.swing.v1;

public class ViewGroup extends View{

    @Override
    public boolean interceptRequest() {
        return false;
    }
}
