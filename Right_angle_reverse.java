package Day_five;

public class Right_reverse_star_pattern 
{

	public static void main(String[] args) 
	{
		int a=5;
		System.out.println("Reverse right angle triangle :");
		for(int r=1;r<=a;r++)
		{
			for(int c=r;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
