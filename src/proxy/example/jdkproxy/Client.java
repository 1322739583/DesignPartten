package proxy.example.jdkproxy;

import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {

        List v = (List) ListProxy.newInstance(new ArrayList(10));
        v.add("New");
        v.add("York");
        v.size();
      //  v.remove("New");
      //  v.clear();
    }
}
