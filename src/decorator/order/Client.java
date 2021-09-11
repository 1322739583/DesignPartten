package decorator.order;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Order order=new SalesOrder();
        order.setCustomerName("张先生");
        order.setDate(new Date());
        OrderLine orderLine=new OrderLine("拿铁",1,10);
        OrderLine orderLine2=new OrderLine("布丁奶茶",2,22);
        OrderLine orderLine3=new OrderLine("卡布奇诺",1,12);
        order.addItem(orderLine);
        order.addItem(orderLine2);
        order.addItem(orderLine3);
        order=new HeaderOrder(new FooterOrder(order));
        order.print();
    }


}
