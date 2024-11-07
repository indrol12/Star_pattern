package Day_five;

public class Reverse_Left_angle_star_pattern 
{

	public static void main(String[] args) 
	{

		int a=5;
		for(int r=1;r<=a;r--)
		{
			for(int s=1;s<r;s++)
			{
				System.out.print(" ");
			}
			for(int c=4;c>=a;c++)
			{
				System.out.print("*");
			}		
			System.out.println();
		}
	}

}
