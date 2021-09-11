package responsibility.abstracts;

/**
 *
 */
//可以考虑把Handler这个类名也换成Dispatcher之类的名字
public  abstract  class Handler {
    protected Handler dispatcher;//这个名字更形象点

    protected abstract void handleRequest();

    public void setDispatcher(Handler dispatcher) {
        this.dispatcher = dispatcher;
    }

    public Handler getDispatcher() {
        return dispatcher;
    }
}
