package arrayprblms;

public class FrequencyOfArray {

	public static void main(String[] args) 
	{
		int[] array = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1, 5 };
		int[] freq = new int[array.length];
		int num = 0, count = 0;
		
		System.out.print("Displaying the array = " );
		for(int i =0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		for (int n = 0; n < array.length; n++) 
		{
			for (int j = n + 1; j < array.length; j++) 
			{
				if (array[n] == array[j]) {
					count++;
					freq[j] = num;
				}
			}
			if (freq[n] != num)
				freq[n] = count;
		}

		System.out.println(" Elements and their Frequency");
		for (int n = 0; n < freq.length; n++) 
		{
			if (freq[n] != num)
			{
				System.out.println(array[n] + " " + " " + freq[n]);
				//System.out.println(freq[i]);
			}
		}
	}
}
