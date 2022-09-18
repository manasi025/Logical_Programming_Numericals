package arrayprblms;

public class EvenOdd2 
{

	public class EvenOddNumbrInArray 
	{

		public static void main(String[] args) 
		{
			
			int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			EvenOdd2();
		}

		private static void EvenOdd2() 
		{
			// TODO Auto-generated method stub
			int array[] = null;
			for (int i = 0; i < array.length; i++) 
			{
				System.out.print( array[i] + "  ");
			}
			
			System.out.println("Even values in the array : ");
			for (int j = 0; j < array.length; j++)
			{
				if(array[j] % 2 == 0)
				{
					System.out.println(array[j]);
				}
				else
				{
					System.out.println("Odd values in array : ");
			
				}
			}
		}
	}
		
}

		
			
			