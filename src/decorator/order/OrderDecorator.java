package decorator.order;

public class OrderDecorator extends Order{
    //声明为protect子类可以获取到，private是获取不到的
    protected Order order;

    public OrderDecorator(Order order) {
         this.order=order;
         this.setDate(order.getDate());
         this.setCustomerName(order.getCustomerName());
    }

    @Override
    public void print() {
        super.print();
    }
}
