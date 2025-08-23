package patterns;

public class pattern_19 {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++)
		{
			for(int j=i;j<3;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
