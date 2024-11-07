package Day_five;

public class Reverse_Rightangle_number 
{

	public static void main(String[] args) 
	{
		int num=1;
		int a=5;
		System.out.println("Reverse right angle triangle numbers :");
		for(int r=1;r<=a;r++)
		{
			for(int c=r;c<=a;c++)
			{
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
		
	}

}

//
//int num=1;
//int a=5;
//System.out.println("Reverse right angle triangle numbers :");
//for(int r=1;r<=a;r++)
//{
//	for(int c=r;c<=a;c++)
//	{
//		System.out.print(num+" ");
//		num++;
//	}
//	num=1;
//	System.out.println();
//}







//
//int a=5;
//System.out.println("Reverse right angle triangle :");
//for(int r=1;r<=a;r++)
//{
//	for(int c=r;c<=a;c++)
//	{
//		System.out.print(c+" ");
//		num++;
//	}
//	System.out.println();
