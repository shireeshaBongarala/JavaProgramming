import java.util.*;

public class FizzBuzz
{
		public static void main(String args[])
		{
			for(int i=1;i<=100;i++)
			{
				if(divisibleByFifteen(i))
					System.out.println("FizzBuzz");
				else if(divisibleByOnlyThree(i))
					System.out.println("Fizz");
				else if(divisibleByOnlyFive(i))
					System.out.println("Buzz");
				else
					System.out.println(i);

			}
		}

		public static boolean divisibleByFifteen(int i)
		{
				if(i%15==0) return true;
				return false;	
		}
		public static boolean divisibleByOnlyThree(int i)
		{
				if(i%3==0) return true;
				return false;
		}
		public static boolean divisibleByOnlyFive(int i)
		{	
				if(i%5==0)
				return true;
				return false;
		}
}
