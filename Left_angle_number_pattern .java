package Day_five;

public class Left_angle_number_pattern 
{

	public static void main(String[] args) 
	{

		int num=1;
		for(int r=1;r<=5;r++)
		{
			for(int s=1;s<r;s++)
			{
				System.out.print(" ");
			}
			for(int c=5;c>=r;c--)
			{
				System.out.print(num+"");
			}
			num++;
			System.out.println();
		}
	}

}
