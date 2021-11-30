package proxy.pattern;

public class ProxySubject extends Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        //额外功能1
        preRequest();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        //真实关联的部分
        realSubject.request();
        //额外功能2
        afterRequest();
    }

    /**
     * 这个方法是自定义的，根据业务想写什么都行，执行时机也可以随便，不过要换个名字而已。
     */
    public void preRequest() {

    }

    /**
     * 含义同preRequest方法
     */
    public void afterRequest() {

    }


}
