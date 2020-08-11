/* program to print following pattern
sample input and output:
Enter no.of rows:                                                                                                       
5                                                                                                                       
* * * * *                                                                                                               
* * * *                                                                                                                 
* * *                                                                                                                   
* *                                                                                                                     
* 

*/

import java.util.*;

class PatterTest{
        int i,j,n;
        char arr[][];
    PatterTest(int n){
            arr=new char[n][n];
            this.n=n;
        }
       //Write your code here
       void pattern(){
           for(i=0;i<n;i++){
               for(j=0;j<n-i;j++){
                   arr[i][j]='*';
               }
           }
           for(i=0;i<n;i++){
               for(j=0;j<n-i;j++){
                   System.out.print(arr[i][j]+" ");
               }
               System.out.println();
           }
       }
}
class PatternTest{
    public static void main(String args[]){
        int n;
        System.out.println("Enter no.of rows:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        PatterTest d=new PatterTest(n);
        d.pattern();
    }
}