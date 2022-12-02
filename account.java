import java.lang.*;
import java.util.date;
import javax.swing.*;
public class assign1
{
	    
	public static void main(String[] args)
	{
		account a;
	double amount=0.0;
	JOptionPane.showMessageDialog(null,"Enter Deposit Amount :"+amount);
	double amount=0.0;
	JOptionPane.showMessageDialog(null,"Enter withdrawl Amount ",+amount);
	}
	class account
	{
		private int id;
		private double balance;
		private double annualInnterestRate;
	    private String dateCreated;
		account()
		{
			id=0;
			balance=0.0;
			annualInnterestRate=0.0;
			java.util.Date dateCreated = new java.util.Date();
			
		}
		account(int Id,double bal)
		{
			id=Id;
			balance=bal;
			java.util.Date dateCreated = new java.util.Date();
		}
		void setId(int Id)
		{
			id=Id;
		}
		void setBalance(double bal)
		{
			balance=bal;
		}
		void setAnnualInterestRate(double ann)
		{
			annualInnterestRate=ann;
		}
		int getId()
		{
			return id;
		}
		double getBalance()
		{
			return balance;
		}
		double getMOnthlyInterestRate()
		{
			return annualInnterestRate/12;
		}
		double getMOnthlyInterest()
		{
			return (balance*2.5)/100;
		}
		double deposit(double amount)
		{
			
			return balance+=amount;
		}
		double withdraw(double amount)
		{
			return balance-=amount;
		}
		
		
		
	}
}
		
		
		
		