//write a program number is perfect or not perfect.
import java.util.Scanner;
public class pr3{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int num=obj.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
            sum=sum+i;
        }
        if(num==sum)
        System.out.println("the number is perfect");
        else
        System.out.println("the number is not perfect");


        }
    }