/**
* First program is to take dynamic i/p and display sum of its digits.\
* Second program for the addition of Even digits,Odd digits and Prime digits separately for a dynamic i/p no.
* Third program counts the above types of different digits individually.
* Fourth program gives the no. in reversed way and the alternate approach is also given afterwards.
*/
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter the no. :");
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0)
		{
			sum += num % 10;
			num = num / 10;
		}
		System.out.println(sum);

	}
}
class A
{
	public static void main(String... args){
		System.out.print(" Enter the no. :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("The no. provided is : " + num);
		int val = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int sumPrime = 0;
		while (num != 0)
		{
			val = num % 10;
			if (val % 2 == 0 )
			{
				sumEven += val;
			}else{
				sumOdd += val;
			}
			if (val == 2 || val == 3 || val == 5 || val == 7)
			{
				sumPrime += val;
			}
			// if we write the else part here then we can get the non prime no.'s also.
			num /= 10;
		}
		System.out.println("Sum of the Even Digits is :"+ sumEven);
		System.out.println("Sum of the Odd Digits is :"+ sumOdd);
		System.out.println("Sum of the prime Digits is:" + sumPrime);
		
	}
}
class B
{
	public static void main(String... args){
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no. :");
		int num = s.nextInt();
		int val = 0;
		int valCount = 0; 
		int evenCount = 0;
		int oddCount = 0;
		int primeCount = 0;
		int nonPrimeCount = 0;
		while (num != 0)
		{
			val = num % 10;
			valCount++;
			if (val % 2 == 0)
			{
				evenCount++;
			}else{
				oddCount++;
			}
			if (val == 2|| val == 3|| val == 5|| val == 7)
			{
				primeCount++;
			}else{
				nonPrimeCount++;
			}
			num /= 10;
		}
			System.out.println("The total no. of digits are :"+ valCount);
			System.out.println("The no. of Even digits are :" + evenCount);
			System.out.println("The no. of Odd digits are :" + oddCount);
			System.out.println("The no. of Prime digits are :" + primeCount);
			System.out.println("The no. of NonPrime digits are :" + nonPrimeCount);
	}
}
class C
{
	public static void main(String... args){
		System.out.print("Provide the no.:");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int ogNum = num;
		int val = 0;
		while (num != 0)
		{
			val = val*10 + num % 10;
			num /= 10;
		}
		System.out.println("The reversed no. is :" + val);
		if (val == ogNum)
		{
			System.out.println("The no. is a pallindrome");
		}else{
			System.out.println("The no. is not a pallindrome");
		}
	}
}
class D
{
	public static void main(String Honey[]){
		System.out.print("Provide the no. : ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String numReversed = new StringBuffer(num).reverse().toString();
		System.out.println("The reversed string value is: " + numReversed);
		if (num.equals(numReversed))//If we use here num == numReversed then the o/p will not come as expected.
		{
			System.out.println(num + "is a pallindrome no.");
		}else{
			System.out.println(num + "is not a Pallindrome no.");
		}


	}
}
