package princeple.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Facher {


    public Collection<String> doSomeThing(Map hashMap){
        System.out.println("father is executing");
        return hashMap.values();
    }
}
