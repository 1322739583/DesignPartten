package decorator.beverage;

import java.text.DecimalFormat;

public class FormatUtil {
   public static String format(double monney){
       DecimalFormat format=new DecimalFormat(".##");
       return format.format(monney);
   }
}
