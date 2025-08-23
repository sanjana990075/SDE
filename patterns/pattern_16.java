package patterns;

public class pattern_16 {

	public static void main(String[] args) {
		for(char i='A';i<='D';i++)
		{
			char ch=i;
			for(char j='A';j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println(" ");
		}

	}

}
