/**
* These all given examples are of the same type of pattern .
* Here I have done simple printing of no's from 0 to 9 and also the char values.
* I have also printed the values in reverse order also, just for clearing the concepts.
* Next type of pattern I will practice in pattern 2.
*/
class Pattern1
{
	public static void main(String[] args){
		for (int i = 0; i < 10; i++){
			for (int j = 0; j <= i; j++)
			{
				System.out.print((9-j)+" " );
			}
			System.out.println();
	}
	System.out.println("Another approach for the above problem :");
	for (int i = 9; i >=0; i-- )
	{
		for (int j = 0;j <= 9-i ;j++ )
		{
			System.out.print((9-j)+" ");
		}
		System.out.println();
	}
	System.out.println("One more approach for the above situation but now if we want to print the row no's instead.");
	for (int row =9 ;row >= 0 ;row-- )
	{
		for (int col = 0;col <= 9-row ;col++ )
		{
			System.out.print(row+" ");
		}
		System.out.println();
	}
	System.out.println("An appoach to print * value in place of the no.s for the above pattern");
	for (int row = 0;row < 10 ; row++)
	{
		for (int col = 0;col <= row ;col++ )
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("Now we will print the characters in the above pattern :");
	for (int row = 0;row < 10 ; row++)
	{
		for (int col = 0; col <= row ; col++)
		{
			System.out.print((char)(65+col) +" ");
		}
		System.out.println();
	}
}
}
