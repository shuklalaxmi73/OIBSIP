import java.util.*;
import java.util.Random;

class Task1
{
void randN()
{
int n=0,c=0,size;
int guess;
int number;
Random rand=new Random();
Scanner sc=new Scanner(System.in);
number=rand.nextInt(1,101);
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("			           WELCOME TO THE GUSSEING NUMBER"                                  );
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("How many rounds do you want to play:");
size=sc.nextInt();
for(int i=0;i<size;i++)
{
System.out.println("Please Enter The Number:");
guess=sc.nextInt();
if(guess==number)
{
n++;
System.out.println("Congratulation!!! You Guess The Correct Number");
}
else if(guess>number)
{
System.out.println("Oops!!!You guess The Greater Number");
}
else{
System.out.println("Oops!!!You guess The Lower Number");
}
}
System.out.println("Your Score is:"+n+"/"+size);

}
}

class GuessNumber
{
public static void main(String args[])
{

Task1 t=new Task1();
t.randN();
}
}
