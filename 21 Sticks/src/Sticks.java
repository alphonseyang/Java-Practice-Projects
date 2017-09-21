import java.util.Scanner; 
import java.util.Random;

public class Sticks {
	public static void main(String[] args)
	{
		int remain = 21;
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		Boolean firstWin = false;

		while(remain > 0)
		{
			System.out.print("Please Enter the Nubmer: ");
			int n = reader.nextInt();
			while (n > 2 || n < 1)
			{
				System.out.print("Please enter the number between 1 and 2: ");
				n = reader.nextInt();
			}
			remain -= n;
			
			if (remain <= 0)
			{
				firstWin = true;
				break;
			}
			
			int com = rand.nextInt(2) + 1;
			System.out.println("Computer takes " + com + " sticks");
			
			remain -= com;
			System.out.println("Remaining sticks are " + remain);
		}
		
		if (firstWin)
			System.out.println("user wins");
		else
			System.out.println("computer wins");
	}
}
