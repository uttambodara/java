//array given name 
import java.util.Scanner;
public class p7 {
    public static void main(String mm[])
    {
        String names[]=new String[10];
        String n;
        Scanner k=new Scanner(System.in);//all method is non sataic
        for(int i=0;i<names.length;i++)
        {
            System.out.print("enter the name:");
            names[i]=k.next();
}
        System.out.println("Enter the name to search in the array ");
        n=k.next();
        boolean check=false;
        for (int i=0;i<names.length;i++) {
            if (names[i].equals(n))
                check = true;
        }
            if(check)
                System.out.println("name found in the array ");
            else
                System.out.println("name not found");
        }
    }