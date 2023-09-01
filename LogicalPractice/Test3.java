/**
* The first program is to check the repetition of a particular digit in the no.
* The second program is to check whether an dynamic i/p no. is duck no. or not.
* The third program checks if it is a perfect no.
* The fourth program checks whether if it is Niven no. or not.

* PerfectNo.= The sum of its divisors exclusing itself should be equal to the og no.
* Duck No. = It must contain atleast one 0.
* Niven No. = The sum of the digits must be a perfect divisor of the actual no.

*/
import java.util.*;
class Test3
{
	public static void main(String ...  Honey){
		System.out.print("Provide the no. : ");
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		System.out.print("Provide the digit whose iteration need to be checked: ");
		int digit = s.nextInt();
		int count = 0;

		while (num != 0)
		{
			if (num % 10 == digit)
			{
				count++;
			}
			num /= 10;
		}
		System.out.println("Digit " +digit + " is repeated "+count+" times in the provied no.");
	}
}
// Duck No. Program
class E
{
	public static void main (String... args){
		System.out.println("Provide the No.");
		Scanner sc = new Scanner(System.in);
		/*
		String num = sc.nextLine();
		if (num.contains("0")){
			sout("duck");
	}else{
		sout("not duck");
	}
		*/
		int num = sc.nextInt();
		int count = 0;
		// In place of count we can take use 0f boolean variable also.
		while (num != 0)
		{
			if (num % 10 == 0)
			{
				count++;
			}
			num /= 10;
		}
		if (count>0)
		{
			System.out.println("It is a Duck No.");
		}else{
			System.out.println("It is not a Duck No.");
		}
	}

}
// Perfect No. Program
class F
{
	public static void main(String... Honey){
		System.out.print("Provide the no.");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int val = 1;
		int sum = 0;
		while (val <= num/2)
		{
			if (num % val == 0)
			{
				sum += val;
			}
			val++;

		}
		if (sum == num)
		{
			System.out.println(num +" is an Perfect No.");
		}else{
			System.out.println(num +" is not a Perfect No.");
		}
	}
}
//Niven No.
class G
{
	public static void main(String random[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide the no.");
		int num = sc.nextInt();
		int og = num;
		int sum = 0;
		while (num != 0)
		{
			sum += num % 10;
			num /= 10;
		}
		if (og % sum == 0)
		{
			System.out.println(og + " is a Niven No.");
		}else{
			System.out.println(og + " is not a Niven No.");
		}
	}
}