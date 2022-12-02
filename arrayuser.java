
import java.util.*;
public class arrayuser
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		System.out.println("Enter the Number");
	    arr[i]=input.nextInt();
		}
		for (int i=0;i<10;i++)
		{
		System.out.println("Result of two number :"+arr[i]);
		}
	}
}
		
		