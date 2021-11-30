package proxy.example.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 可以参考官方例子
 * https://docs.oracle.com/javase/8/docs/technotes/guides/reflection/proxy.html
 *
 * 这个例子的主要功能就是监听list的各种操作，如add,remove，clear。实现前后都可以自定义内容的功能。
 * 并且可以知道这些方法具体传入了什么参数
 */
class ListProxy implements InvocationHandler {

    private Object proxyObj;

    public ListProxy(Object obj) {
        this.proxyObj = obj;
    }

    /**
     * JDK官方例子就是这个名字，还是非常好的
     * JDK的代理精髓就在下面这行代码，正常情况下我们List list=new ArrayList(10)就可以了。
     * 但通过我们半实现的newInstance这个方法后，List的new过程被套了一层。
     * 也就是通过ListProxy.newInstance(new ArrayList(10))来创建对象了。
     * List v = (List) ListProxy.newInstance(new ArrayList(10));
     *
     * JDK的这种方式实际上分为两步，这是第一步。第二步就是通过提供的invoke方法进行调用。
     * 第一步相对于是把new对象的过程给拦截了，变成通过反射来创建。
     * 因为只有通过方式，你才有能力实现在方法调用前后做一些事情。
     *
     * @param obj 需要被代理的对象
     * @return 返回的这个值就是创建出来的代理对象，这个值将会传给invoke方法
     */
    public static Object newInstance(Object obj){
        Class<?> cls = obj.getClass();
        //创建代理对象，三个参数其实都是固定的
        return Proxy.newProxyInstance(
                cls.getClassLoader(),
                cls.getInterfaces(),
                new ListProxy(obj)
        );
    }

    /**
     *
     * @param proxy 不知道是干什么的，在这个例子中并没有被用到
     *       官方文档给出的解释是代理类自身，如果将这个值给method.invoke(Object,int[])当第一个参数的话，会栈溢出;
     *       因为自己调用自己。
     *       这个proxy就是newInstance(Object obj)的返回值，也就是真正的代理对象。
     *       而InvocationHandler的接口的方法都是被这个代理对象调用的，所有出现了上面的栈溢出情况
     * @param method 代理对象
     * @param args 被代理对象调用方法时候传入的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy start..."+method.getName());
        if (args!=null){
            for (int i = 0; i < args.length; i++) {
                //这里打印的是被“监听”方法的参数，如list.add("str")里面的字符串
                System.out.println(args[i]+"");
            }
        }
        //com.sun.proxy.$Proxy0这是在源码中规定的前缀加数字
        System.out.println(proxy.getClass().getName());
        //真实调用，可以在这之前之后做想要的事情
        Object o = method.invoke(proxyObj, args);
        //这个返回值指的是被代理对象调用方法后的返回值，如list.size()的返回值
        if (o instanceof Integer){
            System.out.println(o);
        }
        System.out.println("Proxy end..."+method.getName());
        System.out.println("...................");
        return o;
    }

}
