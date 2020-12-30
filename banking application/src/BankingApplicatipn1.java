import java.util.Scanner;

public class BankingApplicatipn1 {
	
	public static void main(String[] args) {
		bankAccount obj=new bankAccount("xyz","ba001");
	}
}
	class bankAccount {
	  private static final String Deposite = null;
	  int balance;
	  int previoustransaction;
	  String customername;
	  String customerId;
	  bankAccount(String cname, String cid) 
	  {
          
            customername=cname;
		    customerId=cid;
	}
	void Deopsite( int amount)
	 {
		
		if(amount!=0)
		 {
			 balance=balance+amount;
			 previoustransaction=amount;
			 
		 }
	 }
	void withdraw(int amount)
	{
		
		if(amount!=0)
		{
			 balance=balance-amount;
			 previoustransaction =-amount;
		}
	}
	  void getprevioustransaction() 
	  {
		 if(previoustransaction>0)
		 {
			  System.out.println("Deposite" +previoustransaction);
			 
		 }
		 else if(previoustransaction<0)
		 {
			 System.out.println("withdraw" +Math.abs(previoustransaction));
		 }
		 else
		 {
              System.out.println("No transaction occurence");
     	 }
      }
	   void showMenu()
	   {
		    char option='\0';
		    Scanner sc=new Scanner(System.in);
		    
		     String customerName = null;
			 System.out.println("welecome" +customerName);
		     System.out.println("your Id is" +customerId);
		     System.out.println("\n");
		     System.out.println("A"+Deposite);
		     String checkBalance = null;
			 System.out.println("B"+checkBalance);
		     String withdraw = null;
			 System.out.println("C"+withdraw);
		     System.out.println("D"+previoustransaction);
		     System.out.println("E:Exit");
		
		     do
		     {
		    	 System.out.println("*********************************");
		    	 System.out.println("enter an Option");
		    	 System.out.println("*********************************");
		    	 option= (char)sc.nextInt(0);
		    	 System.out.println('\n');
		    	 switch(option)
		    	 {
		    	 case'A':
		    		  System.out.println("__________________________");
		              System.out.println("Balence"+balance);
		              System.out.println("___________________________");
		              System.out.println("\n");
		              break;
		    	 case 'B':
		    		 System.out.println("Enter an amount to deposite");
		    		 int amount=sc.nextInt();
		    		 Deopsite(amount);
		    		 System.out.println("\n");
		    		 break;
		    	 case 'C':
		    		 System.out.println("*************************");
		    		 System.out.println("Enetr an amount to withdraw");
		    		 int amount1=sc.nextInt();
		    		 withdraw(amount1);
		    		 System.out.println("\n");
		    	 case 'D':
		    		 System.out.println("**************************");
		    		 getprevioustransaction();
		    		 System.out.println("___________________________");
		    		 break;
		    	 case 'E':
		    		 System.out.println("**********************");
		    		 break;
		    		 
		    	default:
		    		System.out.println("Invalid option:please enter again");
		    		break;
		    	
		    	 }
		     }
		     while(option!='E');
		    {
		    	  System.out.println("Thankyou for using our service");
		    }
		     
	   }
 }
