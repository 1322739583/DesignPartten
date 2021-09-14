package strategy;

import java.math.BigDecimal;

public interface IDiscount<T> {
      BigDecimal discount(T discountInfo,BigDecimal skuPrice);
}
