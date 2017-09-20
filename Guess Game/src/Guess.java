import java.util.Random;
import java.util.Scanner; 

public class Guess {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int num = rand.nextInt(1000)+1;
		Scanner reader = new Scanner(System.in); 
		
		while (true)
		{
			System.out.println("Enter a number: ");
			int n = reader.nextInt();
			
			if (n == num)
			{
				System.out.println("Good Job");
				break;
			}
			else if (n > num)
			{
				System.out.println("Too High");
			}
			else
			{
				System.out.println("Too Low");
			}
		}
		
		reader.close();
	}
}
