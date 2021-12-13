package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {

    private List<Human> humanList = new ArrayList<>();

    public List<String> getHumans() {
        return null;
    }


    public void readHumansFromFile(Path path) {
         List<String> lines = new ArrayList<>();
         try {
             lines = Files.readAllLines(path);
         } catch (IOException ioe) {
             //throw new NoSuchFileException();
         }

         for (String line : lines) {
             String[] tmp = line.split(";");
             humanList.add(new Human(tmp[0], tmp[1]));
         }
    }

    public void writeMaleHumansToFile(Path path) {
        //férfiak kiválagatása a listában, majd új lista, és azt visszaadni
        List<Human> maleList = new ArrayList<>();
        for (Human item : humanList) {
            if (item.getIdentityNumber().startsWith("1") || item.getIdentityNumber().startsWith("3")) {
                maleList.add(item);
            }
        }

        //az új listát kiírni
        List<String> lines = new ArrayList<>();

        try {
            Files.write(path, lines );
        } catch (IOException ioe)  {
            //throw new IOException();
        }
    }
}
