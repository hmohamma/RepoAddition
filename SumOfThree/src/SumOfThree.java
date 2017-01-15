import java.util.*;
public class SumOfThree {
	
	int a;
	int b;
	int c;
	
	public static int sumofthree(int a, int b, int c)
	{
		int result;
		
		result = a+b+c;
		
		return result;
		
	}
	
	
	public static void main(String [] args)
	{

		//Rayyan here
		int num1,num2,num3;
		System.out.println("Enter any 3 integers ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		int result = sumofthree(num1, num2, num3);
		System.out.println("Sum of three numbers: " +result );
		
	}

}
