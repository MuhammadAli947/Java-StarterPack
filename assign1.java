import java.lang.*;
import java.util.*;
import java.util.Date;
import javax.swing.*;
public class assign1
{
	public static void main(String[] args)
	{
		String user; // use to compare in while 
		do
		{
			
		Scanner input=new Scanner(System.in);
		String num1=JOptionPane.showInputDialog("Please enter the Id for account"); 
		int log=Integer.parseInt(num1);
		String num2=JOptionPane.showInputDialog("Please enter the initial amount for account & not less than 100"); 
		double baln=Double.parseDouble(num2);
		account a=new account(log,baln);
		System.out.println("Your Account has been created "); 
		System.out.println("Please enter the Id to log into your account"); /** asking user to enter id to log into his account*/
		String num3=JOptionPane.showInputDialog("Enter ID");
		int Logid=Integer.parseInt(num3);
		while(Logid!=a.getId()) /** checking while the id is correct or not if not than will move into while loop*/
		{
			System.out.println("Enter the Correct Id");
			String value=JOptionPane.showInputDialog("Please enter the Id for account"); /** afte wronng input will ask user again to enter correct id until he do*/
		    int loginid=Integer.parseInt(value);
		}
		System.out.println("Choice 1 for viewing the current balance");   /** providing menu to select a choice*/
        System.out.println("Choice 2 for withdrawing money");
        System.out.println("Choice 3 for depositing money");
        System.out.println("Choice 4 for account created date");
		System.out.println("Choice 5 for monthly interest rate on the available balance, use 2.5% interest rate");
        System.out.println("Choice 6 for exiting the main menu");
		int choice=input.nextInt();
		switch(choice)
		{
		     case 1:
		    {
			  System.out.println("Current Balance is :"+	a.getBalance()); /** gettter for displayinng the current balance*/
			}
			  break;
			
			case 2:
			{
			System.out.println("Enter the amount to withdraw:");
		    double money=input.nextDouble();
			System.out.println("Balance after withdrwaing"+ money +"is :"+a.withdraw(money));    /** setting and gettter current balance after withdrawing*/
			}
			break;
			case 3:
			{
			System.out.println("Enter the amount to Deposit:");    /** giving choice to deposit amount */
		    double demoney=input.nextDouble();
			System.out.println("Balance after depositinng"+ demoney +"is :"+a.deposit(demoney));   /** displaying the new amount after depositing*/
			}
			break;
			case 4:
			{
				a.getdate();
			}
			break;
			case 5:
			{
				System.out.println("Monthly innterest rate is:"+a.getMOnthlyInterestRate());    /** displayinng the uset monthly interest*/
			}
			break;
			case 6:
			{
				return;
			}
			default:
			{
				System.out.println("Invalid choice");
			}
			
	    }
		String option=JOptionPane.showInputDialog("Enter yes if wanna create new account else no");  /** asking user whether wanna create new account or not*/
		user=option; //user is declared at top to compare in while out of do loop*/
		}
		
		while(user=="yes");
	}
}
     class account
	{
		private int id;     /** private int id to store id*/
		private double balance;         /** private int id to store balance*/
		private double annualInnterestRate;        /** private int id to store annualInnterestRate*/
	    private Date datecreated=new Date();          /** private int id to store datecreated*/
		public account()    /** default constructor*/
		{
			id=0;
			balance=0.0;
			annualInnterestRate=2.5;
			java.util.Date dateCreated = new java.util.Date();
			
		}
		public account(int Id,double bal) /** paramerterize constructor to initializer the value given by user*/
		{
			id=Id;
		    balance=bal;
			annualInnterestRate=2.5;
		}
		
		public void setId(int Id)      /** setter for setting id taken by user*/
		{
			id=Id;
		}
		public void setBalance(double bal)    /** setter for setting balance taken by user*/
		{
			balance=bal;
		}
		
		public void getdate()     /** setter for setting date taken by system*/
		{
			System.out.println(datecreated.toString());
		}
		public void setAnnualInterestRate(double ann)     /** setting annual interest rate given*/
		{
			annualInnterestRate=ann;
		}
		public int getId()        /** getter for id*/
		{
			return id;
		}
		public double getBalance()     /** getter for balance*/
		{
			return balance;
		}
		public double getMOnthlyInterestRate()      /** getter for getMOnthlyInterestRate*/
		{
			return annualInnterestRate/12;
		}
		public double getMOnthlyInterest()
		{
			return (100*getMOnthlyInterestRate())/balance;
		}
		public double deposit(double amount)
		{
			
			return balance+=amount;
		}
		public double withdraw(double amount)
		{
			return balance-=amount;
		}
		
		
	}


	/**id of account to create the account
	* inital balance of account 
    * displaying message that account has been created
	* asking user to enter id to log into his account
	* checking while the id is correct or not if not than will move into while loop
	* afte wronng input will ask user again to enter correct id until he do
	* providing menu to select a choice
	* gettter for displayinng the current balance
	* setting and gettter current balance after withdrawing
	* giving choice to deposit amount 
	* displaying the new amount after depositing
	* displayinng the uset monthly interest
	* asking user whether wanna create new account or not
	*user is declared at top to compare in while out of do loop
	* private int id to store id
	* private int id to store balance
	* private int id to store annualInnterestRate
	* private int id to store datecreated
	* default constructor
	* paramerterize constructor to initializer the value given by user
	* setter for setting id taken by user
	* setter for setting balance taken by user
	* setter for setting date taken by system
	* setting annual interest rate given
	* getter for id
	* getter for balance
	* getter for getMOnthlyInterestRate
	*/
			
		
		