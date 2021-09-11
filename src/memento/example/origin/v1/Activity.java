package memento.example.origin.v1;

/**
 * 最初版本：v1
 * 通过一个Activity类的备份功能实现来一步步演化备忘录模式的实现过程。这是最粗暴，也是最简单的实现方式。
 */
public class Activity{
    //crash异常退出  onplay正在显示
    private String state="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
