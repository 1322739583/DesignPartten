package composite.example.antivitus.v1;

public class ImageFile extends AntiVirus{
    @Override
    void killVirus() {
        System.out.println("对图片文件杀毒");
    }
}
