package arrayprblms;

public class CopyArray 
{

	public static void main(String[] args) 
	{

		int array1[] = { 1, 5, 3 };
		int array2[] = new int[array1.length];
		array2 = array1;
		array2[0]++;
		System.out.println("Elements of array1 = ");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.println(array1[i]);
		}
		System.out.println("Elements of array2 = ");
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.println(array2[i]);
		}
	}
}
