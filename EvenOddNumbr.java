//Program to take user input and display whether the given no. is Even or Odd using method

package bridgelabz;

import java.util.Scanner;

public class EvenOddNumbr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. = ");
		int num = sc.nextInt();
		EvenOddNumbr(num);
	}
	public static void EvenOddNumbr(int num)
	{
		if(num % 2 == 0)
			System.out.println("Given number is an Even number!!");
		else
			System.out.println("Given number is an odd number!!");
	}
}
