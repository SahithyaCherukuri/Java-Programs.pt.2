/*program to count no.of vowels in a given string.
sample input and output as follows:

Enter a string:                                                                                                          
welcome to KMIT                                                                                                         
Vowels: 4                                                                                                               
                                                                                                              
*/
import java.util.Scanner;
class CountVowel{
    int vowelCount(String s){
        int[] a1=new int[26];
        char c;
        int c1=0;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                c1++;
            }
        }
        return c1;
    }
    //write your code to count no.of vowels in sentence
    
    
    
}
class CountVowelTest{
    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a string:");
	String line = sc.nextLine();

    CountVowel cv=new CountVowel();
    System.out.println("Vowels: " + cv.vowelCount(line));
    }
}


