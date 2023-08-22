/**
* All the given patterns are almost similar to each other.
* I've shown all type of display values i.e. integer, char, * etc. for the respective patterns.
*/
class Pattern2 
{
	public static void main(String[] args) 
	{
		for (int row = 0; row < 10 ;row++ )
		{
			for (int spaces = 0; spaces < 9-row; spaces++ )
			{
				System.out.print("  ");
			}
			for (int star = 0; star <= row ; star++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		System.out.println("Another approach for writing above program and in place of * i will display col values:");
		for (int i = 0; i < 10 ;i++ )
		{
			for (int j = 0; j < 10 ;j++ )
			{
				if (j <= 8-i)
				{
					System.out.print("  ");
				}else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		System.out.println("Another Type of Program for Practice Purpose");
		for (int row = 0;row < 10 ;row++ )
		{
			for (int star = 0; star <= 9-row ; star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		System.out.println("Another Type of Pattern");
		for (int row = 0; row < 10; row++)
		{
			for (int space = 0; space < row ;space++ )
			{
				System.out.print("  ");
			}for (int value = 0;value <= 9-row ;value++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("Let's display characters in reverse order for the above pattern:");
		for (int row = 0; row <10; row++ )
		{
			for (int space = 0; space < row; space++ )
			{
				System.out.print("  ");
			}
			for (int val = 0; val <= 9-row; val++ )
			{
				System.out.print((char)(74-val)+" ");
			}
			System.out.println();
		}
	}
}
