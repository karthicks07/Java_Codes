import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Hey buddy!, Enter your details here for creating account.");
		System.out.print("Enter your name - ");
		String name=s.nextLine();
		System.out.print("Enter your account number - ");
		int accno=s.nextInt();
		System.out.print("Enter your account type - ");
		String type=s.next();
		System.out.print("Enter your current account balance - ");
		float balance=s.nextFloat();
		Bank b=new Bank();
		b.details(accno,name,type,balance);
	}
}
class Bank
{
    Scanner s=new Scanner(System.in);
    private int accno;
    private String name;
    private  String type;
    private float balance;
    
    public void details(int accno,String name,String type, float balance)
    {
        this.accno=accno;
        this.name=name;
        this.type=type;
        this.balance=balance;
        System.out.println("Account Created!\n");
        options(s);
    }
    
    void options(Scanner s)
    {
        System.out.print("Choose what to be done,\n1. Check Balance\n2. Deposit\n3. Withdrawl\n4. Exit --> ");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
                Check_balance();
                break;
            case 2:
                Deposit();
                break;
            case 3:
                Withdrawl();
                break;
            case 4:
                System.out.println("Exiting from Bank Management System...");
                System.exit(0);
        }
        
    }
    void Check_balance()
    {
        System.out.printf("Account Balance - %.1f\n",balance);
        System.out.println();
        options(s);
    }
    
    void Deposit()
    {
        System.out.print("Enter the amount to be deposited - ");
        float dep_amt=s.nextFloat();
        balance+=dep_amt;
        System.out.println("Amount Deposited Sucessfullly!\n");
        options(s);
    }
    
    void Withdrawl()
    {
        System.out.print("Enter the amount to be withdrawn - ");
        float with_amt=s.nextFloat();
        if(with_amt>balance)
        {
            System.out.println("Unable to withdrawl due to insufficient account balance!");
            options(s);
        }
        else if (with_amt<=balance)
        {
            balance-=with_amt;
            System.out.println("Amount Withdrawn Sucessfullly!\n");
            options(s);
        }
    }
    
}
