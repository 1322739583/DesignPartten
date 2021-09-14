package strategy;

import java.math.BigDecimal;

public class ZheKouDiscount implements IDiscount<Double>{
    @Override
    public BigDecimal discount(Double discountInfo, BigDecimal skuPrice) {
//        if (discountInfo>1||discountInfo<0){
//            //抛异常，这里不做了
//        }

        BigDecimal discountPrice = skuPrice.multiply(new BigDecimal(discountInfo));
        if (discountPrice.compareTo(BigDecimal.ZERO)<1){
            return BigDecimal.ONE;
        }
        return discountPrice;
    }
}
