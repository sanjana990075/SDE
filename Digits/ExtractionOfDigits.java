package striversde;
import java.util.*;

public class ExtractionOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			int digit=num%10;
			num/=10;
			System.out.println(digit);
		}
		

	}

}
