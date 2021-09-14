package strategy;

import java.math.BigDecimal;

public class Item<T>{

    IDiscount<T> discountStrategy;

    public Item(IDiscount<T> discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal discount(T discountInfo,BigDecimal skuPrice){

        return discountStrategy.discount(discountInfo,skuPrice);
    }
}
