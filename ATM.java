import java.util.*;

class ATM_interface
{
void display()
{
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("			          					 WELCOME TO THE OASIS BANK                                                    ");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

System.out.println("                                                                          About Bank                                                                   ");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


System.out.println("		When a customer deposits money into the bank, this money is on loan to the bank and the bank’s most important obligation is to follow the "); 
System.out.println(" customers instructions in relation to this money. The customer can withdraw money from the account at any point, and they can also stop payment of");
System.out.println(" a cheque by informing the bank. If an overdraft agreement is in place, the bank must also give reasonable written notice of any decision to reduce");
System.out.println(" credit");
}
}

class Login
{
String username,password;
void getdata()
{
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("			          					      Login                                                           ");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
Scanner sc=new Scanner(System.in);
System.out.print("Please Enter a Username:");
username=sc.next();
System.out.print("Please Enter a Password:");
password=sc.next();
System.out.println();
System.out.println("You Login Successfully!");
}
}

class Transaction 
{
int amount=10000;
int deposite,withdraw;
 String history="";
Scanner sc=new Scanner(System.in);
 
void T_Deposite()
{
System.out.print("Please Enter the Amount :");
deposite=sc.nextInt();
amount=amount+deposite;
System.out.println("Your balance is:"+amount);
String s="\n"+ deposite+" is Deposited";
history=history.concat(s);
}

void T_Withdraw()
{
System.out.print("Please Enter the Amount :");
withdraw=sc.nextInt();
if(amount<withdraw)
{
System.out.println("Insufficient Balance!");
}
else
{
amount=amount-withdraw;
System.out.println("Your balance is:"+amount);
String s="\n"+withdraw +" is Withdraw";
history=history.concat(s);
}
}

String Reciepient_name;
int Account_no,transfer;

void T_Transfer()
{
System.out.print("Please Enter a Reciepient's Name:");
Reciepient_name=sc.next();
System.out.print("Please Enter a Account No.");
Account_no=sc.nextInt();
System.out.print("Please Enter the Amount :");
transfer=sc.nextInt();
if(amount<transfer)
{
System.out.println("Insufficient Balance!");
}
else
{
System.out.println("Amount is Transferd!");
String s= "\n"+ transfer +" is Tranfered";
history=history.concat(s);
}
}
}

class Transaction_history extends Transaction
{

void T_History()
{
System.out.println( history); 
}
}







class ATM
{
public static void main(String args[])
{
int op;
Scanner sc=new Scanner(System.in);
Transaction_history t=new Transaction_history();
ATM_interface a=new ATM_interface();
a.display();
Login l=new Login();
l.getdata();
while(true)
{
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("			          					 OUR AWESOME FACILITIES                                                    ");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("1.Transaction History");
System.out.println("2.Deposite");
System.out.println("3.Withdraw");
System.out.println("4.Transfer");
System.out.println("5.Exit");
System.out.print("Please Select option:");
op=sc.nextInt();
if(op==1)
{
t.T_History();
}
if(op==2)
{
t.T_Deposite();
}
if(op==3)
{
t.T_Withdraw();
}
if(op==4)
{
t.T_Transfer();
}
if(op==5)
{
System.exit(0);
}
}
}
}




