package Day_five;

public class Right_angle_number 
{

	public static void main(String[] args) 
	{

		int num=1;
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(num);
				num++;
			}
			num=1;
			System.out.println();
		}
	}

}
