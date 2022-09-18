//Star Pattern(Rt angle triangle) program using method

package pattern.com;

public class StarPattern01 
{
	static int i, j;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 5;
		StarPattern(n);
	}

	private static void StarPattern(int n) 
	{
		// TODO Auto-generated method stub
		for(i = 0; i < n; i++)
		{
			for(j = 0; j <=i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
