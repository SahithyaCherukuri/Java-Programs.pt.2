/* program to read a line and find the punctuation marks(. , : ; ! ?) in the text

sample input and output as follows:

Enter your text:                                                                                                        
This dog eats anything!!!.It eats chicken,candy,caterpillar?                                                            
Total punctation marks:7                                                                                                

*/
import java.util.*;
import java.util.regex.*;
class Punctuation{
    //write your code here
    void findPunctuation(String s){
        int count=0;
        Pattern p=Pattern.compile("[.,:;!?]");
        //Pattern p=Pattern.compile("[^\\w]");
        Matcher m=p.matcher(s);
        while(m.find()){
            count++;
        }
        System.out.println("Total punctation marks:"+count);
    }
}
public class PunctuationDemo
{
	public static void main(String[] args) {
		System.out.println("Enter your text:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Punctuation p=new Punctuation();
		p.findPunctuation(str);
	}
	
}

