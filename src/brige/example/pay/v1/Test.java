package brige.example.pay.v1;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Pay alipay=new AliPay(new PayFingerPrintMode());
        alipay.pay("ali0000001","166666",new BigDecimal(6666666));
        Pay weixinPay=new WeiXinPay(new PayFaceMode());
        weixinPay.pay("wx00000001","00000666",new BigDecimal(8888888));
    }
}
