import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Files {

    // 1.3.7
    public static void info(String filename) {
        File file = new File(filename);
        System.out.println("name: " + file.getName());
        System.out.println("absolute path: " + file.getAbsolutePath());
        if(file.exists()) {
            System.out.println("the file exists");
            System.out.println("length: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    // 1.3.8 and 1.3.9
    public static void printFile(String filename) throws IOException {
        FileReader fReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fReader);
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        fReader.close();
        reader.close();

    }

    public static void main(String[] args) {
        info("Day03/some_file.txt");
       // info("Calculon_2.class");
       // info("Calculon_2.java1");

        try {
            printFile("Day03/some_file.txt");
        } catch(IOException e) {
            System.out.println("Failed to print file!");
        }
    }
    
}
