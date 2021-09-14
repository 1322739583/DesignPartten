package strategy;

import java.math.BigDecimal;

/**
 * 无论原价多少元，都按固定价格购买
 */
public class NYuanGouDiscount implements IDiscount<BigDecimal>{

    @Override
    public BigDecimal discount(BigDecimal discountInfo, BigDecimal skuPrice) {
        return discountInfo;
    }
}
