package brige.example.pay.v1;

import java.util.logging.Logger;

public class PayFaceMode implements IPayMode{
    protected Logger logger=Logger.getLogger(PayFaceMode.class.getName());

    @Override
    public boolean payMode(String uid) {
        logger.info("通过人脸识别支付");
        return true;
    }
}
