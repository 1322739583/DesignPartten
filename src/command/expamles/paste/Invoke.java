package command.expamles.paste;

public class Invoke {
    Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }
}
