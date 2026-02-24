import java.io.*;
import java.util.Scanner;

public class FileOp{

    static final String FILE_NAME = "notes.txt";
    static Scanner sc = new Scanner(System.in);
    public static void addNote() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            System.out.print("Enter your note: ");
            String note = sc.nextLine();
            fw.write(note + "\n");
            fw.close();
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
    public static void viewNotes() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            System.out.println("\n--- Your Notes ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("No notes found.");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}