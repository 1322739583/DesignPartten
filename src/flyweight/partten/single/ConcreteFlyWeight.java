package flyweight.partten.single;

import flyweight.partten.FlyWeight;

public class ConcreteFlyWeight extends FlyWeight {

    private Character intrinsicState=null;

    public ConcreteFlyWeight(Character state) {
        this.intrinsicState=state;
    }

    @Override
    public void operation(String state) {
        System.out.println("\nIntrinsicState="+intrinsicState+"\nExtrinsicState="+state);
    }
}
