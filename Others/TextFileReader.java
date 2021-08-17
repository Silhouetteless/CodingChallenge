import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReader {

    public static void main(String[] args) throws IOException {
      //creating an url to read a text directly from the Internet
      URL url = new URL("http://textfiles.com/100/captmidn.txt");
      Scanner scan = new Scanner(url.openStream());

/*in case the file is on your computer use this:

        File file = new File("/Users/.../captmidn.txt");

        Scanner scan = new Scanner(file);
*/
        

        while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
        }

//creating a new file:

        String fileContent = "This is a new file created by Java. ";

        
        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
            }
       


        FileWriter writer = new FileWriter("/Users/.../newfile.txt");
        writer.write(fileContent);
        writer.close();
        

        scan.close();
    }

}
