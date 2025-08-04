package striversde;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		int digits=(int)(Math.log10(num))+1;
		while(num>0)
		{
			int rem=num%10;
			sum+=Math.pow(rem,digits);
			num/=10;
		}
		if(sum==n)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
