import java.io.*;
import java.util.Scanner;
public class Apending2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try 
         {
            FileWriter f=new FileWriter("Krishna.txt",true);
            System.out.print("Enter the no.of values to insert : ");
            int num=sc.nextInt();
            int i=0;
            while(i<=num)
            {
                System.out.print("Enter the name to add : ");
                String name=sc.nextLine();
                f.write("\n"+name);
                i++;
            }
            System.out.println("Done");
            f.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        sc.close();
    }
}
