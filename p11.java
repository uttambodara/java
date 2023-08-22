import java.util.Scanner;

public class p11 {
        public static void main(String mm[]) {
        Scanner k = new Scanner(System.in);
        String data[]=new String[10];
        for (int i = 0; i < data.length; i++) {
            System.out.println("enter the name");
            data[i] = k.next();
        }
        p11 d=new p11();//clas object// static method ko non static menthod ko call kene ke liye
        System.out.println("The number of starting with vowel is"+d.vowelCount(data));//array paass
    }
    public int vowelCount(String data[])
    {



        int count=0;
        for(int i=0;i< data.length;i++)
        {
            char c=data[i].charAt(0);
            if(c=='A' || c=='E'|| c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o')
                count++;
        }
        return count;
    }
}