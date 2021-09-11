package memento.example.origin.v4;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
    public static Map<String,Object> backup(Object bean){
         Map<String,Object> result=new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String fieldName=propertyDescriptor.getName();
                Method getter=propertyDescriptor.getReadMethod();
                Object fieldValue = getter.invoke(bean, null);
                //排除class这个属性，这是Introspector默认会多出来的一个属性。
                if (!fieldName.equalsIgnoreCase("class")){
                    result.put(fieldName,fieldValue);
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void restore(Object bean, Map<String,Object> map){
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String fieldName = propertyDescriptor.getName();
                if (map.containsKey(fieldName)) {
                    Method setter = propertyDescriptor.getWriteMethod();
                    setter.invoke(bean, map.get(fieldName));
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
