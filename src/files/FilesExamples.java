package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesExamples {

    public static String readFile(String filePath) {
        String toReturn = "";
        try {
            File file = new File(filePath);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                toReturn += data + "\n";
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return toReturn;
    }

    public static void writeToFile(String filePath,String toWrite) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(toWrite);
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Error, nuk u shkrua FILE-i");
        }
    }
    public static void appendToFile(String filePath,String toWrite) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.append(toWrite);
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Error, nuk u shkrua FILE-i");
        }
    }

    public static void main(String[] args) {
        String result = readFile("myfile.txt");
        result = result + " une po e shkruaj kete file per here te 20";
        writeToFile("myfile.txt", result);
        result = readFile("myfile.txt");
        System.out.println(result);
    }
}
