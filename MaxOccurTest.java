/* program to find and print maximum occurring character in a string
sample input and output as follows:

Enter the String
shakespeare    
Maximum occured character is:e has occured 3

*/
import java.util.Scanner;
class MaxChar
	{
	void maxChar(String str)
		{
		    int a[]=new int[26];
		    String rstr;
		    char mchar;
		    mchar=str.charAt(0);
		    for(int i=0;i<str.length();i++){
		        a[str.charAt(i)-'a']++;
		    }
		    int max=a[0],ind=0;
		    for(int i=0;i<26;i++){
		        if(max<a[i]){
		            max=a[i];
		            ind=i;
		        }
		        
		    }
		    mchar=(char)(ind+'a');
		    
		//write your code to find maximum occured character
		
		
		System.out.print("Maximum occured character is:"+mchar+" has occured "+max);
   		 }
	}

class MaxOccurTest
	{
	public static void main(String [] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		MaxChar m=new MaxChar();
		m.maxChar(str);
		}
	}