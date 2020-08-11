/* Program to print following pattern
sample input and output:
Enter no.of rows:                                                                                                       
5                                                                                                                       
1                                                                                                                       
1 2                                                                                                                     
1 2 3                                                                                                                   
1 2 3 4                                                                                                                 
1 2 3 4 5                                                                                                              
*/
import java.util.*;

class DArray{
    int i,j,n;
    int arr[][];
    DArray(int x){
        n=x;
        arr=new int[n][n];
    }
    void pattern(){
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                arr[i][j]=j+1;
            }
        }
        //write your code here 
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
}
}
class PatternTEst10{
    public static void main(String args[]){
        int n;
        System.out.println("Enter no.of rows:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        DArray d=new DArray(n);
        d.pattern();
    }
}
