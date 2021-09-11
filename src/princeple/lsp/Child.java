package princeple.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Child extends Facher{


    public Collection<String> doSomeThing(HashMap map) {
        System.out.println("child is executing");
        return map.values();
    }
}
