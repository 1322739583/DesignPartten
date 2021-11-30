package command;

public class Client {
    public static void main(String[] args) {
        Receive receive=new Receive();
        Command command=new ConcreteCommand(receive);
        Invoke invoke=new Invoke(command);
        invoke.invoke();

    }
}
