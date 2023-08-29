/**
* First program is to take dynamically 3 i/p's and then display the sum of them.
* I have used different class for the other type of question so that it can be executed separately also after compilation of all
  We just have to use "java Main" in place of "java Test"
*/
import java.util.*;
class Test
{
	public static void main(String... atgs) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("First no.   :");
		int num1 = sc.nextInt();
		System.out.print("Second no.  :");
		int num2 = sc.nextInt();
		System.out.print("Third no.   :");
		int num3 = sc.nextInt();
		System.out.println("Addition of the above given no's is :"+(num1+num2+num3));
		System.out.println();
		Main m = new Main();
		m.main();

	}
}
class Main
{
	public static void main(String... abcd){
		System.out.print("Enter the no.  :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2 == 0)
		{
			System.out.println(num +"is a Even No.");
		}else{
			System.out.println(num + "is a Odd No.");
		}
	}
}
