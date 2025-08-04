package striversde;
import java.util.*;

public class CountDigits2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=(int)(Math.log10(num)+1);
		System.out.println(count);
		

	}

}
