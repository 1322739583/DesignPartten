package responsibility.abstracts;

public class CreateHandler2 extends Handler {
    public CreateHandler2() {
        System.out.println("CreateHandler2");
    }

    @Override
    protected void handleRequest() {
        if (getDispatcher() != null) {//传给下一个处理者
            System.out.println("request handled by " + getDispatcher().getClass().getSimpleName());
            getDispatcher().handleRequest();
        }else {//当前处理者处理
            System.out.println(getClass().getSimpleName()+" handled the request");
        }
    }
}
