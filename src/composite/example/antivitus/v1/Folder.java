package composite.example.antivitus.v1;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AntiVirus {

    private List<ImageFile> imageFiles = new ArrayList<>();
    private List<TextFile> textFiles = new ArrayList<>();
    private List<Folder> folders=new ArrayList<>();

    public void addImageFile(ImageFile imageFile) {
        imageFiles.add(imageFile);
    }

    public void addTextFile(TextFile textFile) {
        textFiles.add(textFile);
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    @Override
    void killVirus() {
        for (ImageFile imageFile : imageFiles) {
            //
        }

        for (TextFile textFile : textFiles) {

        }

        for (Folder folder : folders) {

        }
    }
}
