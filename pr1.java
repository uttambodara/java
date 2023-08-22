//prime number in java
public class pr1{
    public static void main(String[] args) {
        int num=29;
        boolean j=false;
        for(int i=2;i<=num/2;++i){
            //condition for nonprime number 
            if (num%2==0){
                j=true;
                break;
            }
        }
        if(!j)
        System.out.println(num+ "is a prime number");
        else
        System.out.println(num+ "is not  a prime number");
    }
}