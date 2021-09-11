package responsibility.examples.swing.v1;

public  class View {

    //public abstract void dispatcherRequest();

    public View getTarget() {
        return target;
    }

    public void setTarget(View target) {
        this.target = target;
    }

    private View target;


    public void onTouchEvent(Event event) {
        if (getTarget() != null && !interceptRequest()) {
            getTarget().onTouchEvent(event);
        } else {
            System.out.println(getClass().getSimpleName() + " handled the request");
            switch (event.getAction()) {
                case Event.ACTION_DOWN:

                    break;
                case Event.ACTION_MOVE:
                    break;
                case Event.ACTION_UP:
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Intercept the requestChain if return true;
     *
     * @return
     */
    public boolean interceptRequest() {
        return false;
    }

}
