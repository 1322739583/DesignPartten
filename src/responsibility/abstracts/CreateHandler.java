package responsibility.abstracts;

public class CreateHandler extends Handler {

    public CreateHandler() {
        System.out.println("CreateHandler");
    }

    @Override
    protected void handleRequest() {
        if (getDispatcher() != null) {//传给下一个处理者
            System.out.println("request handled by " + getDispatcher().getClass().getSimpleName());
            getDispatcher().handleRequest();
        }else {//当前处理者处理,如果没有下一个要处理，第一个就自己处理
            System.out.println(getClass().getSimpleName()+" handled the request");
        }
    }
}
