package number.pattern.com;

public class NumberPattern2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i, j, k, n = 5;
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(k = 0; k <= i; k++)
			{
				System.out.print(k + 1);
			}
			System.out.println();
		}
	}

}


/*

OUTPUT :

     1
    12
   123
  1234
 12345
 
*/
