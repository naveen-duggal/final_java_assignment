package in.ineuron.com;
import java.util.Scanner;

public class User {

	public static void main(String[] args)throws NegativeNumberException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		
		int num=sc.nextInt();
		if(num<0)
		{
			throw new NegativeNumberException("Wrong input Please give valid positive Number");
		}
		else
		{
		System.out.println(num);
		}
		}
}
