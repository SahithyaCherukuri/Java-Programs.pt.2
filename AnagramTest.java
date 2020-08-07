/* program to check whether two strings are Anagram or not.
sample input and output as follows:

Enter first string:                                                                                                     
keep                                                                                                                    
Enter second string:                                                                                                    
peek                                                                                                                    
keep and peek are anagrams                                                                                              
                                                                               

*/
import java.util.*; 
   
class AnagramString {

    void isAnagram(String s1,String s2){
        int[] a1=new int[26];
        int[] a2=new int[26];
        int an=1;
        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            a2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a1[i]!=a2[i]){
                an=0;
                break;
            }
        }
        if(an==1){
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
   
   //write your logic to check two strings are anagram or not
   
   
}
   
class AnagramTest{
    public static void main(String[] args) {  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string:");
    String str1=sc.next();
	System.out.println("Enter second string:");
	String str2=sc.next();
 	AnagramString an=new AnagramString();
  	an.isAnagram(str1,str2);
    }  
}  