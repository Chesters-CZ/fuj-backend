package cz.brightbox.fujbackend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonLoader {
    public static String loadJson(String filename) throws FileNotFoundException {
        System.out.println(new File(".").getAbsolutePath());
        StringBuilder out = new StringBuilder();
        File myObj = new File("./"+filename);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            out.append(data).append("\n");
        }
        myReader.close();
        return String.valueOf(out);
    }
}
