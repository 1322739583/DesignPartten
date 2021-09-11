package responsibility.examples.swing.v1;

public class Event {

    public final static int ACTION_DOWN=0;//不声明为final,switch会报错

    public final static int ACTION_UP=1;

    public final static int ACTION_MOVE=2;

    private int action;

    public void setAction(int action) {
        this.action = action;
    }

    public int getAction(){
        return action;
       // return getNativeAction();
    }

    //屏幕事件Java是没办法处理的，交给C处理，不用关心
   // private   static native   int getNativeAction() ;

}
