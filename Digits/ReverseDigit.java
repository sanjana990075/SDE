package striversde;
import java.util.*;

public class ReverseDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=0;
		while(num>0)
		{
			int rem=num%10;
			num/=10;
			digit=digit*10+rem;
			
		}
		System.out.println(digit);

	}

}
