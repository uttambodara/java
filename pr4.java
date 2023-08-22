//write a program array of square
import java.util.*;
public class pr4 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int data[]=new int[5];
        for(int i=0;i<data.length;i++){
            System.out.println("enter the value");
            data[i]=obj.nextInt();
        }
        System.out.println("\n The square of the number:");
        for(int j=0;j<data.length;j++){
            System.out.println(data[j]*data[j]);
        }

        }
  }

