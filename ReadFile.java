import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File f = new File("Krishna.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String out = sc.nextLine();
                System.out.println(out);
            }
            System.out.println("done");
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}