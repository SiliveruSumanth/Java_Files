import java.io.*;
import java.util.Scanner;
public class NameFile {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        try {
            FileWriter fw=new FileWriter("Krishna.txt");
            System.out.print("Enter your name : ");
            String name=sc.nextLine();
            System.out.println("Name has Added to it successfully");
            fw.write(name);
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
  }  
}
