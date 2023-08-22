class Pattern6
{
	public static void main(String []Honey){
		for (int row = 0; row < 19; row++)
		{
			if (row < 10)
			{
				for (int sp = 0; sp < row ; sp++ )
				{
					System.out.print(" ");
				}
				for (int str = 0; str < 10-row; str++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}else{
				for (int sp = 0; sp < 18-row; sp++)
				{
					System.out.print(" ");
				}
				for (int str = 0; str < row-8; str++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		System.out.println("------------------------------------------");
		System.out.println("Another Program in which I will display odd no. of stars only:");
		for (int row = 0; row < 10; row++)
		{
			if (row < 5)
			{
				for (int sp = 0; sp < row; sp++)
				{
					System.out.print(" ");
				}
				for (int str = 0; str < 9-2*row; str++)
				{
					System.out.print("*");
				}
				System.out.println();
			}else{
				for (int sp = 0; sp < 9-row; sp++)
				{
					System.out.print(" ");
				}
				for (int str = 0; str < 2*row-9; str++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}