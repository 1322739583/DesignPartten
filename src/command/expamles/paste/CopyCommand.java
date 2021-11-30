package command.expamles.paste;

public class CopyCommand implements Command{

    Recieve recieve;

    public CopyCommand(Recieve recieve) {
        this.recieve = recieve;
    }

    @Override
    public void execute() {
        recieve.recieve();
    }
}
