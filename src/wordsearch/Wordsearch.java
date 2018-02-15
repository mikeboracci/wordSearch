package wordsearch;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Wordsearch {
	
	public static void main (String[] args)
	
	{
	
	System.out.println("      This is the awesome word search ");	
	System.out.println("-------------------------------------------------------------");
	String[] fangle = {"ABSTRACTION", "hello","eat my shorts"};
	String[] ht = {"A","B","C","D","E","F","G","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
        String sw;
        int rep = 0;
        int i;
            for(i=0;i<30;i++){        
        System.out.println(randomString.matrix(ht));
        }
             
        
        
        
        //sw = fangle[1];
	       
       // display(fangle);
	       
        // This is calling the RSR array reverse class
            //RSR backword = new RSR();        
	   // String [] rev = {"SNORT"};
           // rev = RSR.reverseArray(rev);
           // System.out.println("Reversed array elements");
           //System.out.println(Arrays.toString(rev));

	
	//diss(fangle);
	//stringrep(fangle);
        
        
  
	
	} //end Main


    
    





        
	


public static void display(String[] fangle) 
	{
		for (int count=0;count < fangle.length;count++){
			System.out.println(fangle[count]);
                }
        }









public static void grid(String[] ht)// builds the character grid of random strings
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
								txt = ht[num2];
								System.out.print(txt + " ".substring(0, 30));
				}
                                System.out.println("This is the string");
				System.out.println();
		}
	}






public static String[] fangleArray(String[] sw) //display an array at 45 deg. angle
{
	String[] reverse = new String[sw.length];
	for(int i = 0, j = reverse.length -1; i<sw.length;i++,j--) {
		reverse[j] = sw[i];
	}
	return reverse;
}


    


    






public static void stringrep(String[] fangle)// changes first string in fangle
	{
		    for(int i = 0; i<1;i++){
                         
                        System.out.println("Before " + fangle[i]);
                        
                        fangle = new String[]{"testes"};
                        
                        System.out.println("After ");
                        System.out.println(Arrays.toString(fangle));
                         
                    }  
       }

public static void diss(String[] fangle) //take a string apart and create an Array of characters from it
{
        String x = new String(fangle[0]);
	char[] characters = x.toCharArray();
	System.out.print(x.toCharArray());
        System.out.println(" " +  characters[0]);

} 




}// Wordsearch class end

	
				
			
			
