package arrayprblms;

public class EvenOddNumbrInArray 
{

	public static void main(String[] args) 
	{
		
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i<array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nEven values in the array : ");
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 0)
			{
				System.out.println(array[i]);
			}
		}
		
		System.out.println("Odd values in the array are : ");
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 != 0)
			{
				System.out.println(array[i]);
			}
		}
	}
}
