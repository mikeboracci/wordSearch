/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

/**
 *
 * @author Mike
 */
public class RSR {
    public static String[] reverseArray(String[] rev) //reverses an array
{
	String[] reverse = new String[rev.length];
	for(int i = 0, j = reverse.length -1; i<rev.length;i++,j--) {
		reverse[j] = rev[i];
	}
	return reverse;
}
}
