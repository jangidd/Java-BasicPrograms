// Here we have seen both the cases when the spaces are given at first and given at end.
class Pattern3 
{
	public static void main(String[] args) 
	{
		for (int row = 0; row < 19 ;row++)
		{
			if (row < 10)
			{
				for (int col = 0; col <= row ;col++ )
				{
					System.out.print("* ");
				}
				System.out.println();
			}else{
				for (int col = 0; col < 19-row ;col++ )
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Another Type of Pattern:"); 
		for (int i = 0;i < 19 ;i++ )
		{
			if (i < 10)
			{
				for (int j = 0; j <9-i; j++)
				{
					System.out.print("  ");
				}
				for(int k = 0; k < i+1; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}else{
				for (int j = 0; j < i-9; j++)
				{
					System.out.print("  ");
				}
				for (int k = 0; k < 19-i; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
