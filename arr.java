import java.lang.*;
public class arr
{
public static void main(String[] args)
{
	int sum=0;
	int avg=0;
   int array[]={5,2,3,4,6,8,7};
   for(int i=0;i<7;i++)
   {
	   System.out.println("Value is:"+array[i]);
   }
   for(int i=0;i<7;i++)
   {
	   sum=sum+array[i];
   }
   for(int i=0;i<7;i++)
   {
	   avg=sum/7;
   }
   System.out.println("Sum is:"+sum);
    System.out.println("Avg is:"+avg);
}
}