package patterns;

public class pattern_25 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++)
		{
			//space
			for(int j=0;j<3-i-1;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
			//space
			for(int j=0;j<3-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
