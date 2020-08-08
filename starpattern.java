/*Program to read and print a two dimentional array as follows:
Enter no.of rows:                                                                                                       
5                                                                                                                       
*                                                                                                                       
* *                                                                                                                     
* * *                                                                                                                   
* * * *                                                                                                                 
* * * * *                                                                                                               
*/
import java.util.*;

class DArray{
    char arr[][];
    int i,j,n;
    DArray(int x){
        n=x;
        //initialize arr
        arr=new char[n][n];
        }
    void pattern(){
        //read array
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                arr[i][j]='*';
            }
        }
    }
    void print2D(){
        //Display array
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class PatternDemo1{
    public static void main(String args[]){
        int n;
        System.out.println("Enter no.of rows:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        DArray d=new DArray(n);
        d.pattern();
        d.print2D();
    }
}