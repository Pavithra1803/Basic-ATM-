package AtmManagement;
import java.util.Scanner;
public class Bank1
{
	public int acc_no,ac2,balance=0,pin,pin2=0,dep,wd,amt,ch,np;
	String name,r;
 	String r1="yes";
	double phno;
Scanner c=new Scanner(System.in);

	public void create()
	{
	System.out.println("\n\n~~~~Creating an Account~~\n");
	System.out.println("\nenter name of the person\n");
	name=c.nextLine();
	System.out.println("\nenter phone number\n");
	phno=c.nextDouble();
	acc_no=12345;
	System.out.println("\nset your atm pin number\n");
	pin = c.nextInt();
	System.out.println("\nconfirm your pin\n");

	while(pin!=pin2)
{
		pin2=c.nextInt();

		if(pin==pin2)
			System.out.println("\nAccount created Succesfully\n");
		else
			System.out.println("\nPlease try again\n");
	}
	}

	public void CheckBalance()
	{
		ch=1;
		System.out.println("\nYour current Balance is : \t"+balance);
		reciept();
	}

	public void Deposit()
	{
		ch=2;
		System.out.println("\nEnter Amount to be deposited\n"); 
		dep=c.nextInt();
		balance=balance+dep;
		reciept();
	}

	public void reciept()
	{
		
System.out.println("\nDo you want reciept?\n\nyes \t no\n");
	r=c.next();
	System.out.println("\n");
	if(r.equals(r1))
	{		
	System.out.println("\t|---------------------MY BANK----------------------|");
	System.out.println("\t|               jeypore road,salur		   |");
	System.out.println("\t|--------------------------------------------------|");
	System.out.println("\t|--------------------------------------------------|");
	System.out.println("\t|Account number       \t"+acc_no+"\t\t	   |");
	System.out.println("\t|Customer name         \t"+name+"\t	   |");
	switch(ch)
	{
	case 2:System.out.println("\t|Deposited  Amount\t"+dep+"\t\t	   |");
				break;
	case 3:System.out.println("\t|Withdrawn Amount\t"+wd+"\t\t	   |");
				break;
case 4:System.out.println("\t|Transferred Amount\t"+amt+"\t\t	   |");
				break;
}

System.out.println("\t|Current Balance   \t"+balance+"\t\t	   |");
System.out.println("\t|--------------------------------------------------|");
System.out.println("\t|--------------------------------------------------|");
System.out.println("\t|\t	    THANK YOU                      |");
System.out.println("\t|\t	 Visit us again                    |");
System.out.println("\t|--------------------------------------------------|\n\n");

	}
	}

public void Withdraw()
{
	ch=3;
		System.out.println("\nEnter amount to be withdrawn\n");
		wd=c.nextInt();
		if ( wd>50000)
		{
			System.out.println("\nlimit exceeded\n");
		}
		else if(balance < wd)
		{
			System.out.println("\nInsufficient Balance \n");
		}
		else 
		{
			balance = balance-wd;
			reciept();
		}
	}

	public void Transfer()
	{
		ch=4;
		System.out.println("Enter account number to be transferred\n");
		ac2=c.nextInt();
		System.out.println("\nEnter amount to be transferred\n");
		amt=c.nextInt();
		if(amt > balance)
		{
			System.out.println("\nInsufficient Balance\n");
}
		else
		{
			balance=balance-amt;
			reciept();
		}
	}	

	public void ChangePassword()
	{
		System.out.println("\nEnter previous Pin\n");
		pin2=c.nextInt();

		while(pin2!=pin)
		{
			System.out.println("Incorrect pin Please enter again\n");
			pin2=c.nextInt();
		}

		System.out.println("Enter new pin\n");
		np=c.nextInt();

		while(np==pin)
		{
			System.out.println("enter new one ");
			np=c.nextInt();
		}

		pin=pin2=np;
		System.out.println("\nPin updated successfully\n");	
	}
}