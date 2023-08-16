/**
*In this program we will basically test all the basic fundamentals of the java program.
*We will concatenate two of more strings.
*We will make use of the Ternary Operator and the Logical Operators.
*We will make use of the Type Casting Techniques in the program.
*/
class Introduction 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		String j = "30";
		String x = "My Teacher is presently ";
		System.out.println(x +j +" years old");
		int k = 50 +Integer.parseInt(j);
		System.out.println("Value of k is:"+k);
		if (a++ == 10 & b++ == 20)
		{
			System.out.println(a +"  "+b);
		}
		int min = a<b ? a : b;
		int max = a>b ? a : b;
		System.out.println("MIN is:"+min);
		System.out.println("MAX is:"+max);
		System.out.println("For checking the 'Ternary' \"operator\"");
		
		int c = 0b1010;
		int d = 0B10;
		System.out.println("The sum is:"+c+d);
	}
}
