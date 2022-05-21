import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filing {
    public static void main(String[] args) {
        //creating a file
        /*try {
            File myfile = new File("filing.txt");
            if (myfile.createNewFile()) {
                System.out.println("File created:"+myfile.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }*/
        //Write to a file
        try {
            FileWriter writer=new FileWriter("filing.txt");
            writer.write("THis is written to the file ");
            writer.close();
            System.out.println("Successfully wrote in the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        //Reading a file


    }
}