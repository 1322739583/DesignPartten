package responsibility.abstracts;

public class Test {
    public static void main(String[] args) {
        CreateHandler handler=new CreateHandler();
        CreateHandler2 handler2=new CreateHandler2();
        CreateHandler3 handler3=new CreateHandler3();
         handler.setDispatcher(handler2);
        handler.handleRequest();
    }
}
