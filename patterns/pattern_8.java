package patterns;

public class pattern_8 {

	public static void main(String[] args) {
		int col=1;
		for(int i=1;i<=4;i++)
		{
			int value=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+" ");
				value++;
				
			}
			System.out.println("");
			
		}

	}

}
