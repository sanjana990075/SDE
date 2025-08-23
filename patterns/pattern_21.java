package patterns;

public class pattern_21 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=4-i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
