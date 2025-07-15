
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileName {

    public static void checkfiletype(String filename) throws InvalidFileException {
        if (!filename.endsWith(".txt")) {
            throw new InvalidFileException("this is a invalid file type");

        } else {
            System.out.println("valid file type:" + filename);
        }
    }

    public static void main(String[] args) {
        String filename;
        Scanner yo = new Scanner(System.in);
        System.out.println("enter the file name:");
        filename = yo.nextLine();

        try {
            // checkfiletype(filename);
            FileWriter writer = new FileWriter("mytext.txt");
            File obj = new File("mytext.txt");
            Scanner reader = new Scanner(obj);

            if (obj.createNewFile()) {
                System.out.println("File created:" + obj.getName());
            } else {
                System.out.println("the file already exits");
            }
            writer.write("hi my name is james shrestha");
            writer.close();

            if (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println("an error has occured");
        }
    }

}
