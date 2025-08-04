package striversde;
import java.util.*;
public class CountDivisors2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	List<Integer> list=new ArrayList<>();
	
	int n=sc.nextInt();
	for(int i=1;i<Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
			list.add(i);
			if((n/i)!=i)
			{
				System.out.println(n/i);
				list.add(n/i);
			}
		}
	}
	Collections.sort(list);
	System.out.println(list);
	
}
}
