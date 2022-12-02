
import java.util.*;
public class string
{
	public static void main(String[] args)
	{
		Bool b=false;
		String[] arr=new String[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		System.out.println("Enter the Name");
	    arr[i]=input.next();
		}
		String name1;
		System.out.println("Enter the name to search");
		name1=input.next();
		for (int i=0;i<10;i++)
		{
			if(arr[i].equals(name1))
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
		}
		if(b==1)
		{
			System.out.println("Contains");
	    }
		else
		{
			System.out.println("Not Contains");
		}
}
}
		
		