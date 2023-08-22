//write a program array of sum

import java.util.Scanner;

public class pr5 {
    public static void main(String [] args){
        Scanner k=new Scanner(System.in);
        int data[][]=new int [3][4];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("enter the value");
                data[i][j]=k.nextInt();
            }

        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                sum=sum+data[i][j];
            }
            System.out.println("sum of elements"+sum);


            }
        }
        
    
}
