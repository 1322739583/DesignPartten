package strategy;

import responsibility.abstracts.Handler;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //直减
        Item<BigDecimal> zhiJianItem=new Item<>(new ZhiJiangDiscount());
        BigDecimal zhiJianDiscount = zhiJianItem.discount(new BigDecimal(5), new BigDecimal(10));
        System.out.println("ZhiJiang price is "+zhiJianDiscount.setScale(2,RoundingMode.HALF_EVEN));
        //满减
        Item<Map<String,String>>  manJianItem=new Item<>(new ManJiangDiscount());
        Map<String,String> map=new HashMap<>();
        map.put("n","200");
        map.put("x","30");
        BigDecimal manJianDiscount=manJianItem.discount(map,new BigDecimal(500));
        System.out.println("ManJian price is "+manJianDiscount.setScale(2,RoundingMode.HALF_EVEN));
        //折扣
        Item<Double>  zheKouItem=new Item<>(new ZheKouDiscount());
        BigDecimal zheDiscount=zheKouItem.discount(0.5,new BigDecimal(200));
        System.out.println("ZheKou price is "+zheDiscount.setScale(2,RoundingMode.HALF_EVEN));
        //n元减
        Item<BigDecimal>  nYuanJianItem=new Item<>(new NYuanGouDiscount());
        BigDecimal nYuanJianDiscount=nYuanJianItem.discount(new BigDecimal(100),new BigDecimal(200));
        System.out.println("NYuanJian price is "+nYuanJianDiscount.setScale(2,RoundingMode.HALF_EVEN));
    }
}
