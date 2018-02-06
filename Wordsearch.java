package wordsearch;
import java.util.Random;
import java.util.Arrays;

public class wordSearch {
	
	public static void main (String[] args)
	
	{
	
	System.out.println("      This is the awesome word search ");	
	System.out.println("-------------------------------------------------------------");
	String[] fangle = {"PHP", "ABSTRACTION","MYSQL",""};
			
	String[] ht = {"A","B","C","D","E","F","G","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] sw = {"T","E","C","H","N","O","L","O","G","Y"};
	display(fangle);
	matrix(ht);
	
	String[] backword;
	backword = reverseArray(sw);
	System.out.println("Reversed array elements");
	display(backword);
	
	
	}

	


public static void display(String[] fangle) 
	{
		for (int count=0;count < fangle.length;count++)
			System.out.println(fangle[count]);
		
		
		
	}

public static void matrix(String[] ht)// builds the character grid of random strings
	{
	Random r = new Random();
		int num2;
		String txt;
		
	
			for (int row=0;row<30;row++)	
			{
				
				for (int col=0;col<30;col++)
						{
							// this is the column builder
								num2 = r.nextInt(27);
								txt = ht[num2].toString();
								System.out.print(txt + " ");
								
				}
				
				System.out.println();
		}





	}


public static String[] reverseArray(String[] sw) //reverses an array
{
	String[] reverse = new String[sw.length];
	for(int i = 0, j = reverse.length -1; i<sw.length;i++,j--) {
		reverse[j] = sw[i];
	}
	return reverse;
}



}// class end

	
				
			
			
