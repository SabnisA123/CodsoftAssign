import java.util.*;
class RandomNo
{
	
	public static void main(String [] args)
	{
			Random random=new Random();
			int number=random.nextInt(100)+1;
			int guessNo;
			Scanner sc = new Scanner(System.in);
			 System.out.println("Welcome to Random Guessing Number Game!!");
			 System.out.println("Guess a number between 1 and 100:");
			 while(true)
			 {
			 	guessNo=sc.nextInt();
			 
			 if(guessNo==number)
			 {
			 	System.out.println("Yeahh! You guess Correct number");
			 
			 }
			 else if(guessNo<number)
			 {
			 	System.out.println("User number is smaller than Computer number");
			 }
			 else
			 {

			 	System.out.println("User number is bigger than Computer number");
			 
			 }
			}


	}
}