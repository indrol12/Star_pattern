package Day_five;

public class Reverse_rightangle_alphabet 
{

	public static void main(String[] args) 
	{

		char ch='A';
		int a=5;
		System.out.println("Reverse right angle triangle :");
		for(int r=1;r<=a;r++)
		{
			for(int c=r;c<=a;c++)
			{
				System.out.print(ch+" ");
			}
			ch++;

			System.out.println();
		}
	}

}
