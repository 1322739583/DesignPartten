package strategy;

import java.math.BigDecimal;

public class ZhiJiangDiscount implements IDiscount<BigDecimal>{

    @Override
    public BigDecimal discount(BigDecimal discountInfo, BigDecimal skuPrice) {
        BigDecimal discountPrice = skuPrice.subtract(discountInfo);
        if (discountPrice.compareTo(BigDecimal.ZERO)<1){
            return BigDecimal.ONE;
        }
        return discountPrice;
    }
}
