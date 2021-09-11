package decorator.order;

public class FooterOrder extends OrderDecorator {
    public FooterOrder(Order order) {
        super(order);
    }

    @Override
    public void print() {
        super.order.print();
        printFooter();
    }

    public void printFooter() {
        System.out.println("===========================");
        System.out.println("总计：" + order.getTotalPrice());
    }
}
