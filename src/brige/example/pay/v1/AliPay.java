package brige.example.pay.v1;

import java.math.BigDecimal;

public class AliPay extends Pay{
    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String pay(String uid, String tradeId, BigDecimal amount) {
        boolean security = payMode.payMode(uid);
        if (security){
            logger.info("Paying by Alipay.UId is "+uid+",tradeId is "+tradeId+",amount is "+amount);
            return "0001";
        }
        logger.info("支付失败，支付回滚");
        return "0000";
    }
}
