import java.lang.*;
public class factorial
{
	public static void main(String[] args)
	{
		int a=5;
		int fac=1;
		for(int i=5;i>0;i--)
		{
			fac=fac*i;
		}
		System.out.println("Factorial is :"+fac);
	}
}