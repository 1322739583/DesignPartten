package composite.example.antivitus.v1;

public class TextFile extends AntiVirus{

    @Override
    public void killVirus() {
        System.out.println("对文本文件杀毒");
    }
}
