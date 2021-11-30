package command.expamles.paste;

public class Client {
    public static void main(String[] args) {
        Recieve recieve=new Recieve();
        Command command=new CopyCommand(recieve);
        Invoke invoke=new Invoke(command);
        invoke.invoke();
    }
}
