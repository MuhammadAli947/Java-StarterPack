import java.util.*;
import javax.swing.*;
public class joption{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String num1=JOptionPane.showInputDialog("Enter First no");
		int number1=Integer.parseInt(num1);
		String num=JOptionPane.showInputDialog("Enter Second no");
		int number=Integer.parseInt(num);
		int result=number1+number;
		JOptionPane.showMessageDialog(null,result);
		}
	}
	