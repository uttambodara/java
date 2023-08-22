import java.util.Scanner;

public class p15 {
       public static void main(String dd[])
    {
        Scanner k=new Scanner(System.in);
        String n="Abhi";
        String res="";

        for(int i=0;i<n.length();i++)
        {
            int c=(int)n.charAt(i)+2;

            res=res+(char)c;
        }
        System.out.println("The result is "+res);
    }

}

