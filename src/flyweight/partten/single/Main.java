package flyweight.partten.single;

import flyweight.partten.FlyWeight;

public class Main {
    public static void main(String[] args) {
      FlyWeightFactory factory=new FlyWeightFactory();
        FlyWeight flyWeight= factory.factory('a');
         flyWeight.operation("first call");
         flyWeight=factory.factory('b');
         flyWeight.operation("second call");
         flyWeight=factory.factory('a');
         flyWeight.operation("third call");

         factory.checkFlyWeight();
    }
}
