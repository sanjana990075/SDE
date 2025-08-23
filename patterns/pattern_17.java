package patterns;

public class pattern_17 {

	public static void main(String[] args) {
		
		for(char i='D';i>='A';i--)
		{
			char charac=i;
			for(char j='D';j>=i;j--)
			{
				System.out.print(charac+" ");
				charac++;
				
			}
			System.out.println(" ");
			
		}

	}

}
