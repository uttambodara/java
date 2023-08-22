//write a program array in largest number

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int data[]=new int[5];
    int Max=data[0];
    for (int i=0;i<data.length;i++){
        System.out.println("enter the value");
        data[i]=obj.nextInt();
    }
   Max=data[0];
    for(int i=0;i<data.length;i++){
        if(Max<data[i])
        Max=data[i];

    }
    System.out.println("the largest element in array"+Max);
}
}



































  
  
    

