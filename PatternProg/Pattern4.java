/**
* Remember the slightest mistake can make the program look different like in the 1st program, if we use two spaces in the
  print section of the for loop than the pattern will be of entirely different shape.

*/
class Pattern4
{
	public static void main(String... args){
		for (int row = 0; row < 10; row++)
		{
			for (int spaces = 0;spaces < 9-row; spaces++)
			{
				System.out.print(" ");
			}
			for (int stars = 0;stars < row+1; stars++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("Another Program in which I will display even no. of stars only:");
		for (int row = 0;row < 5;row++ )
		{
			for (int sp = 0; sp < 5-row ;sp++)
			{
				System.out.print(" ");
			}
			for (int st = 0; st < 2*(row+1); st++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("Another Program in which I will display odd no. of stars only:");
		for (int row = 0; row < 5; row++)
		{
			for (int space = 0; space < 5-row; space++)
			{
				System.out.print(" ");
			}
			for (int star = 0; star < 2*row+1; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("Another Program in which we will display above patterns inverted:");
		for (int row = 0; row < 10; row++)
		{
			for (int space = 0; space < row; space++)
			{
				System.out.print(" ");
			}
			for (int star = 0; star < 10-row; star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("Another Program in which I will display even no. of stars only but inverted:");
		for (int row = 0; row < 5; row++)
		{
			for (int space = 0; space < row; space++)
			{
				System.out.print(" ");
			}
				for (int stars = 0; stars < 10-2*row; stars++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
	}
}
// Similarly we can do for odd no. of elements also.