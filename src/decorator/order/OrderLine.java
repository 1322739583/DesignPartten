package decorator.order;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderLine {
    private String itemName;
    private int units;
    private double unitPrice;
    private double totalPrice;
    private Date date;

    public OrderLine(String itemName, int units, double unitPrice) {
        this.itemName = itemName;
        this.units = units;
        this.unitPrice = unitPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double subTotal(){
        return units*unitPrice;
    }

    public void printHeader(){
        System.out.println("\t**订单**");
        System.out.println("日期："+formatDate());
    }

    public void printItem(){

        System.out.println(itemName+"\t"+units+"\t"
        +formatCurrency(getUnitPrice())+"\t"
        +formatCurrency(subTotal()));

    }



    public String formatDate(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        return date;
    }

    public String formatCurrency(double money){
      return NumberFormat.getCurrencyInstance().format(money);
    }
}