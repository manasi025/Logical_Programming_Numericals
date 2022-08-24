//Program to take user input as an integer and reverse it using method
package bridgelabz;

import java.util.Scanner;

public class ReverseNumber1 {

	private static int rev;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ennter the no to be reversed = ");
		int num = sc.nextInt(); 
		int rev = 0;
		//Method calling
		ReverseNumber1(num);
	}

	//Derived Method
	private static void ReverseNumber1(int num) {
		// TODO Auto-generated method stub
		for(; num != 0; num = num/10)
		{
			int remainder = num % 10;
			rev = ((rev * 10) + remainder);
		}
		System.out.println("Reverse of given no is : " + rev);
	}
}
