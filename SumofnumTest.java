/* program to compute sum of numbers in a given string
sample input and output as follows:

Enter the String:                                                                                                       
12345                                                                                                                   
Sum of numbers in a string 12345 is:15                                                                                  
                                                                                                                        
*/
import java.util.*;

class Sumofnum
    {
        int findSum(String s){
            int st=0;
            for(int i=0;i<s.length();i++){
                st=st+s.charAt(i)-'0';
            }
            return st;
        }
    // write your to find sum of digits in a string
    
    }
class SumofnumTest{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		Sumofnum s=new Sumofnum();
		System.out.println("Sum of numbers in a string "+str+" is:"+s.findSum(str));
		}
	} 
		
