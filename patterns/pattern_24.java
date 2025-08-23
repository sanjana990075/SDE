package patterns;

public class pattern_24 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1+i;k<5;k++)
			{
				System.out.print(k);
			}
			System.out.println(" ");
		}

	}

}
