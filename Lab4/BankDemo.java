import java.util.*;
class BankAccount
{
	String name, account_type;
	long account_number;
    double balance, minimumBal;
	static double rate;

	static void setRate(double r)
	{
        rate=r;
	}

	BankAccount(String n, String at, long an, double b, double m)
	{
		name=n;
		account_type=at;
		account_number=an;
		balance=b;
		minimumBal=m;
	}
	
	static void displayRate()
	{
	    System.out.println("Rate of Interest: "+rate);
	} 
     
    void Deposit(double deposit)
    {
        balance+=deposit;
    }

    void Withdraw(double withdraw)
    {
        if(balance-withdraw<minimumBal)
        {
            System.out.println("Money is below minimum balance. Cannot be withdrawn.");
        }
        else
        balance-=withdraw;
    }

    void displayDetails()
    {
        System.out.println("Account Holder Details.");
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+ account_number);
        System.out.println("Account Type: "+account_type);
        System.out.println("Balance: "+balance);
    }
}

class BankDemo
{

    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Account details.");
    	System.out.println("Enter Name.");
    	String n=sc.nextLine();
        System.out.println("Enter Account Number.");
        long an=sc.nextLong();
        System.out.println("Enter Account Type.");
        String at=sc.next();
        System.out.println("Enter Balance.");
        double bal=sc.nextDouble();
        System.out.println("Enter Minimum Balance.");
        double minBal=sc.nextDouble();
        System.out.println("Enter Rate of Interest.");
        double rate=sc.nextDouble();

        BankAccount ba=new BankAccount(n, at, an, bal, minBal);
        BankAccount.setRate(rate);

        System.out.println("1.Deposit or 2.Withdraw");
        int d_w=sc.nextInt();
        if(d_w==1)
        {
        	System.out.println("Enter amount to be deposited.");
        	double depo=sc.nextDouble();
        	ba.Deposit(depo);
        }
        else
        {
        	System.out.println("Enter amount to be withdrawn.");
        	double wd=sc.nextDouble();
        	ba.Withdraw(wd);
        }

        ba.displayDetails();
        BankAccount.displayRate();
    }
}