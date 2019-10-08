import java.util.*;
import java.io.*;

 public class Prefinals_Activity2
 	 {
		
	    ArrayList<String> words = new ArrayList<String>();//This is to store for the word that the user entered
	    Scanner scan = new Scanner(System.in);
        Base64.Encoder enc = Base64.getEncoder();// return the string that encodes using basic type of base64 encoding scheme
        String Fileko;
	    String Input_name;
	    String encoded;
	    String wordss;
   
    	public void function()throws IOException// i created a function that handle the conversion and inputing a texts
	    {
	    Boolean x = false;
	        while(!x)
	    {
	   
	    wordss = scan.nextLine();
	 
	   
	    if(!wordss.equals(":q"))//if the entered word is not exactly as ":q" it will continues and when it exactly it will stop
	    {
	    
	    encoded = enc.encodeToString(wordss.getBytes());//converts the given String to base64 encryption
	    words.add(encoded);// to add the word in arraylist
	    System.out.println(encoded);// to print the encrypted the word
	    }
	    else
	    {
	    x = true;//to stop the condition
	    }
	        }
       
        System.out.println("Do u want to save it? ");
        System.out.println("Yes or No? ");
        String save = scan.nextLine();
        if(save.equals("yes"))
        {
        System.out.println("Enter your file name: ");
	    Input_name = scan.nextLine();
	    Writer writer = new FileWriter(Input_name +".gil");//to save the word in the file
	   
	    for(String b: words)// to get the store words in array list and to transferred it to string
	    {
	    writer.write(b);// to get the encrypted word and transferred it to the file
	    }
	    writer.close();
   
   
        }
        else
        	{
        		System.out.println("Not saved!");
        }
       
    }
   
   
	    public static void main(String[] args) throws IOException
	    {
	   
	    Prefinals_Activity2 pf = new Prefinals_Activity2();//this is the constructor
	    pf.function();//this is the function that I created and I call it
	    }
   
}