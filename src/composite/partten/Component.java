package composite.partten;
/**
 * 顶层组件
 */
public interface Component {
    /**
     * 返回容器实例，这个有点意义不明，好像不需要也是可以的，而且在Leaf实现还会空指针
     * @return
     */
    Composite getComposite();

    /**
     * 一些操作，可以根据需要多写几个
     */
    void operation();
}
