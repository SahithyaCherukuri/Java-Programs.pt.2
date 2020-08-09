/*program to find longest word in a sentence.

sample input & output as follows:

Enter the String:                                                                                                       
James Gosling received a Bachelor of Science from the University of Calgary                                             
longest word is:University                                                                                              

*/
import java.util.*;
class Longest{
	String findLongestWord(String s1){
	    //String arr[]=new String[10];
	    String c;
	    int p;
	   /* for(int i=0;i<arr.length;i++){
	        String arr[i]=s1.split(" ");
	    }*/
	    String arr[]=s1.split(" ");
	    int n=arr[0].length();
	    c=arr[0];
	    for(int i=0;i<arr.length;i++){
	        p=arr[i].length();
	        if(p>n){
	            n=p;
	            c=arr[i];
	        }
	    }
	    return c;
	}
	//write the logic to find longest word in a sentence
	
	
	

}
class LongestWord 
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
    
    //read input sentence
    String s=sc.nextLine();
    
    Longest l=new Longest();
    System.out.println("longest word is:"+l.findLongestWord(s));
    }
}