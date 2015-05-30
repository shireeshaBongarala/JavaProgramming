import java.util.*;
import java.util.ArrayList;
public class PrimeFactor
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		ArrayList<Integer> factors= new ArrayList<Integer>();
		generateFactors(n,factors);
		findPrimeFromFactors(factors);

	}
		public static  void generateFactors(int n,ArrayList<Integer> arr)
		{
					 for(int i=2;i<=n;i++)
					{		
							if(n%i==0) arr.add(i);
					}
	
		}
		public static void findPrimeFromFactors(ArrayList<Integer> arr)
		{		boolean prime=true;
				for(int i : arr)
				{
						if(isPrime(i))  System.out.print(i+" ");
					
				}
		}

		public static boolean isPrime(int n)
		{
					 boolean  prime=true;
					for(int j=2;j<n/2;j++)
						if(n%j==0){prime=false; break;}

					return prime;

		}
		
		}

