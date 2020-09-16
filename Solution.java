import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    //private static final Scanner scanner = new Scanner(System.in);

    /*public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((N%2)!=0){
            System.out.println("Weird");
        }
        else{
            if(N<=5){
                System.out.println("Not Weird");
            }
            else if(N<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }*/
	public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
		scan.next();
        String s = scan.next();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/
		Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println(String.format("%-15s",s1)+String.format("%03d",x));
                //Complete this line
            }
            System.out.println("================================");

    }
}
