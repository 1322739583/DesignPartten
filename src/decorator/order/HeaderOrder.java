package decorator.order;

import java.text.SimpleDateFormat;

public class HeaderOrder extends OrderDecorator{

    public HeaderOrder(Order order) {
        super(order);
    }

    @Override
    public void print() {
        printHeader();
        super.order.print();

    }



    public void printHeader(){
        System.out.println("\t**订单**");
        System.out.println("日期："+formatDate());
        System.out.println("===========================");
    }

    public String formatDate(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(getDate());
        return date;
    }
}
