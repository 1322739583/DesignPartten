package decorator.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Order {

    private String customerName;
    private Date date;
    private List<OrderLine> orderLines=new ArrayList<>();
    private double totalPrice;



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public void addItem(OrderLine orderLine){
        orderLines.add(orderLine);
    }

    public void removeItem(OrderLine orderLine){
    
    }

    public double getTotalPrice(){
        for (OrderLine orderLine : orderLines) {
            totalPrice+=orderLine.subTotal();
        }
        return totalPrice;
    }



    public void print(){
        for (OrderLine orderLine : orderLines) {
            orderLine.printItem();
        }
    }
}
