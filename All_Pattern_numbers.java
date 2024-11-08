package Test;

class squares
{
	void square_star()
	{
		System.out.println("___________Square pattern____________");
		int a=1; 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n;j++)
			{
				System.out.print(a+" ");
			}
			a++;

			System.out.println();
		}
		System.out.println();
	}
	
	
	void increasin_triangle_pattern()
	{
		System.out.println("___________increasing_triangle_pattern____________");
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" "+a);
			}
			a++;
			System.out.println();
		}
	}
	
	void decreasing_Triangle_pattern()
	{
		System.out.println("___________decreasing_triangle_pattern____________");
		int n=5;
		int a=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i; j<=n;j++)
			{
				System.out.print(" "+a);
			}
			a--;
			System.out.println();
		}
	}
	
	
	void leftangle_triangle()
	{
		System.out.println("___________Left_Angle_triangle_pattern____________");
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int s=i;s<=n;s++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print(" "+a);
			}
			a++;
			System.out.println();
		}
	}
	
	void leftangle_downside()
	{
		System.out.println("___________Left_Angle_Downside_pattern____________");
		int n=5;
		int a=5;
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print(a+" ");
			}
			a--;
			System.out.println();
		}
		
	}
	
	void hill_pattern()
	{
		System.out.println("___________Hill_pattern____________");
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int s=i;s<=n;s++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print(a+" ");
			}
			a++;
			for(int j=1; j<i;j++)
			{
				System.out.print(a+" ");
			}
			
			System.out.println();
	
		}
	}
	
	void Reverse_hill_pattern()
	{
		System.out.println("___________reverse_Hill_pattern____________");
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	
	void diamond_Pattern()
	{
		System.out.println("___________Diamond_Hill_pattern____________");
		int n=5;
		for(int i=1;i<n;i++)
		{
			for(int s=i;s<=n;s++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1; j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
	
		}
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}	
	}
}


	

public class All_Pattern_numbers 
{
	public static void main(String[] args) 
	{
		squares s=new squares();
		s.square_star();
		s.increasin_triangle_pattern();
		s.decreasing_Triangle_pattern();
		s.leftangle_triangle();
		s.leftangle_downside();
		s.hill_pattern();
		s.Reverse_hill_pattern();
		s.diamond_Pattern();
	}
}
