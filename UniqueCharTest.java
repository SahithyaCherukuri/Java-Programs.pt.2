/* Program to print unique characters in a string
sample input and output as follows:

Enter the String:                                                                                                        
tessellator                                                                                                             
Unique characters are:                                                                                                  
aor                                                                                                                     
   

*/
import java.util.Scanner;
class UniqueChar
	{
	     void findUnique(String s){
		int ar[]=new int[26];
	     int flag=0;
		 String rstr="";
        	char p[]=new char[s.length()];
			for(int i=0;i<s.length();i++){
					ar[s.charAt(i)-'a']++;
			}
			for(int i=0;i<s.length();i++){
					if(ar[s.charAt(i)-'a']==1){
						rstr=rstr+s.charAt(i);
					}
			}
			System.out.println("Unique characters are:");
			System.out.println(rstr);
	    }
	//write your code to find unique characters in string 
	}

class UniqueCharTest
	{
	public static void main(String [] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		UniqueChar uc=new UniqueChar();
		uc.findUnique(str);
		}
	}