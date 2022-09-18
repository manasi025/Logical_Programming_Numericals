package number.pattern.com;

public class NumberPattern1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i, j, n = 5;
		for(i = 0; i < n; i++)
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print(j + 1);
			}
			System.out.println(" ");
		}
	}

}
