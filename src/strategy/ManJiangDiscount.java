package strategy;

import java.math.BigDecimal;
import java.util.Map;

public class ManJiangDiscount implements IDiscount<Map<String,String>> {
    @Override
    public BigDecimal discount(Map<String, String> discountInfo, BigDecimal skuPrice) {
        String n = discountInfo.get("n");
        String x = discountInfo.get("x");
        //不满足满减，原价返回
        if (skuPrice.compareTo(new BigDecimal(n))<0){
                return skuPrice;
        }
        //满减后价格
        BigDecimal discountPrice = skuPrice.subtract(new BigDecimal(x));
        //减后价格小于等于0,返回一元
        if (discountPrice.compareTo(BigDecimal.ZERO)<1){
            return BigDecimal.ONE;
        }
        return discountPrice;
    }
}
