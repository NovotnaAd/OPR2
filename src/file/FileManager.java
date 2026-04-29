package file;

import java.net.URL;

public class FileManager {
    public String getFullPath(String filename){
        URL fileUrl = FileManager.class.getClassLoader().getResource(filename);

        if(fileUrl == null){
            throw new RuntimeException("soubor" + filename "neexistuje");
        }

    }
}
