package command;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCommand implements Command{

    List<Receive> receives=new ArrayList<>();
   // Receive receive;

    public ConcreteCommand(Receive receive) {
     //   this.receive = receive;
        receives.add(receive);
    }

    @Override
    public void execute() {
        for (Receive receive : receives) {
            receive.action();
        }
    }
}
