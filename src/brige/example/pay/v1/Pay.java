package brige.example.pay.v1;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * 实现例子并不重要，最重要的是明白使用的场景
 */
public abstract class Pay {

    protected Logger logger = Logger.getLogger(Pay.class.getName());

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String pay(String uid, String tradeId, BigDecimal amount);

}
