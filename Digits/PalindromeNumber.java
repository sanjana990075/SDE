package striversde;
import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int digit=0;
		while(num>0)
		{
			int rem=num%10;
			num/=10;
			digit=digit*10+rem;
			
		}
		if(n==digit)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
