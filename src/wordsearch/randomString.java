
package wordsearch;

import java.util.Random;



/**
 *
 * @author Mike
 */
public class randomString {
    
    public static String matrix(String[] ht)// builds the character grid of random strings
{
	Random r = new Random();
		int num2;
		String txt = null;
               
               // List test = new ArrayList();
               
			for (int col=0;col<30;col++)
						{
						    // this is the column builder
                                                    num2 = r.nextInt(27);
                                                    txt=(ht[num2] + " ") ;
                                                   //test.add(txt = ht[num2]);
                                                    System.out.print(txt);
                                                   // System.out.print(test);
                                                }// innner loop
                           
                            //System.out.println();
                      
                
               return txt;
}


}
