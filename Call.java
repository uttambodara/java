import java.util.*;
public class Call{
    public static void main(String mm[]){
        Scanner k=new Scanner(System.in);
        Studs data[]=new Studs[10];
        for(int i=0;i<data.length;i++)
        {
            System.out.println("enter the name");
            String nm=k.next();
            System.out.println("enter the marks");
            int rn=k.nextInt();
            System.out.println("enter the percentage");
            float per=k.nextFloat();
            data[i]=new Studs(nm,rn,per);

        }
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i].name+""+data[i].marks+""+data[i].percent+"");
    }
 }
}