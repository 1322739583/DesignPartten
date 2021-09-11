package flyweight.partten.single;

import flyweight.partten.FlyWeight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlyWeightFactory {
    private HashMap<Character, FlyWeight> files=new HashMap<>();

    public FlyWeightFactory() {
    }

    public FlyWeight factory(Character state){
        if (files.containsKey(state)){
            return files.get(state);
        }else {
            FlyWeight flyWeight=new ConcreteFlyWeight(state);
            files.put(state,flyWeight);
            return flyWeight;
        }
    }

    public void checkFlyWeight(){
        int i=0;
         for (Iterator it = files.entrySet().iterator(); it.hasNext();) {
             Map.Entry next = (Map.Entry) it.next();
             System.out.println("Item"+(++i)+":"+next.getKey());
         }
    }
}
