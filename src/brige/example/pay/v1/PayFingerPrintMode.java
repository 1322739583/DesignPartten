package brige.example.pay.v1;

import java.util.logging.Logger;

public class PayFingerPrintMode implements IPayMode{
    protected Logger logger=Logger.getLogger(PayFingerPrintMode.class.getName());

    @Override
    public boolean payMode(String uid) {
        logger.info("通过指纹模式支付");
        return true;
    }
}
