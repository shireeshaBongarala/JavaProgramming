import java.util.*;

public class diamond
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter n:");
		int n= scan.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			
			for(int j=0;j<(2*i+1);j++)
				System.out.print("*");

			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=i;j<=n;j++)
				System.out.print(" ");

			for(int j=0;j<(2*i-1);j++)
				System.out.print("*");

			System.out.println();
		}
		
	}
}
