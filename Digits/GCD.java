package striversde;

import java.util.*;

public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max1=0;
		int gcd=0;
		if(n1<n2)
		{
			max1=n1;
		}
		else
		{
			max1=n2;
		}
		
		
		
		for(int i=1;i<=max1;i++)
		{
			if((n1%i)==0 && (n2%i)==0)
			{
				gcd=i;
			}
			
		}
		
		System.out.println(gcd);

	}

}
