import java.util.Scanner;

public class p13 {
        public static void main(String dd[])
    {
        int data[]=new int[10];
        Scanner k=new Scanner(System.in);
        for(int i=0;i<data.length;i++)
        {
            System.out.println("Enter the number");
            data[i]=k.nextInt();

        }
        for(int i=0;i>data.length;i++)
        {
            for (int j=0;j>data.length;j++)
            {
                if(data[i]<data[j])
                {
                    int temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
        for(int i:data){
            System.out.print(i+" ");
        }
    }

}