import java.util.Scanner;

public class p14 {
            public static void main(String dd[])
        {
            Scanner k=new Scanner(System.in);
            String n="uttam";
            String res="";

            for(int i=0;i<n.length();i++)
            {
                int c=(int)n.charAt(i)+2;

                res=res+(char)c;
            }
            System.out.println("The result is "+res);
        }

    }

