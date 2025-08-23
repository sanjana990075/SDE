package patterns;

public class pattern_18 {

	public static void main(String[] args) {
		for(char i='A';i<'D';i++)
		{
			char charac=i;
			for(char j='A';j<'D';j++)
			{
				System.out.print(charac+" ");
				charac++;
			}
			System.out.println(" ");
		}

	}

}
