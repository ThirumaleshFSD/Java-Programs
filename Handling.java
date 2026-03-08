import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Handling {
    public static void main(String[] args) {
         try {
            // Read from input file
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            // Write to output file
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            // Read line by line and write
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();   // move to next line
            }

            br.close();
            bw.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
