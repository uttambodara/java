//write a program sum of array.
import java.util.*;
public class pr2 {
 public static void main(String args[]){
    int[]arr=new int []{1,3,4,2,4,5};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    System.out.println("sum of all the elements of array:"+sum);

    }
 }

