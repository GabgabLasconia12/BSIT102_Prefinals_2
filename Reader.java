import java.io.*;
import java.util.*;


 public class Reader
{
	
		public void function()throws IOException// I craeted another function to read the file that will input by user
		{
		Base64.Decoder dec = Base64.getDecoder();// return the string that decodes using basic type of base64 encoding scheme
        
        
	    System.out.println("Enter your file: ");
	    Scanner sc = new Scanner(System.in);
   
	    File fffile = new File(sc.nextLine() +".gil");// to read your file name
	    sc = new Scanner(fffile);
	   
	   
	    String b = sc.nextLine();
	    String decoded = new String(dec.decode(b));////converts the given base64 encryption word to a word or string
        System.out.println(decoded);// to print the decoded word
	    
	    sc.close();	
	}
  	  	public static void main (String[] args) throws IOException
    {
    	Reader rd = new Reader();
    	rd.function();
       
   
    }
   
   
}
