package Day_five;

public class left_angle_alphabet_pattern 
{

	public static void main(String[] args) 
	{

		char ch='A';
		for(int r=1;r<=5;r++)
		{
			for(int s=1;s<r;s++)
			{
				System.out.print("  ");
			}
			for(int c=5;c>=r;c--)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}

}


