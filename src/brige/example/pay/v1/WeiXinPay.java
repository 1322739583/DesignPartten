package brige.example.pay.v1;

import java.math.BigDecimal;

public class WeiXinPay extends Pay {
    public WeiXinPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String pay(String uid, String tradeId, BigDecimal amount) {
        boolean security = payMode.payMode(uid);
        if (security){
            logger.info("Paying by WeiXinPay.UId is "+uid+",tradeId is "+tradeId+",amount is "+amount);
            return "0001";
        }
        logger.info("支付失败，支付回滚");
        return "0000";
    }
}
