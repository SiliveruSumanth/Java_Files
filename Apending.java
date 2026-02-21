import java.io.*;
import java.util.Scanner;
public class Apending {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       try {
           FileWriter f=new FileWriter("Krishna.txt",true);
           System.out.println("Enter the name to add :");
           String name=sc.nextLine();
           f.write("\n" + name);
           f.close();
           System.out.println("Done ");
       } catch (Exception e) {
        System.out.println(e);
       }
   } 
}
