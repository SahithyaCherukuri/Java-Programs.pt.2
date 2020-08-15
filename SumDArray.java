/* program to find sum of the diagonal elements of a given matrix
sample input & output:
Enter the size of the matrix:                                                                                           
2                                                                                                                       
2                                                                                                                       
Enter the contents of the array:                                                                                        
1 2 3 4                                                                                                                 
The contents of the array:                                                                                              
1 2                                                                                                                     
3 4                                                                                                                     
sum:5                                                                                                                   

*/
import java.util.*;
class Array
{
    int a[][],i,j,m,n,sum;
    //write your code
    Array(int x,int y){
        m=x;
        n=y;
        sum=0;
        a=new int[m][n];
    }
    void printArray(){
        System.out.println("The contents of the array:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void diagonal(){
        for (i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println("sum:"+sum);
    }
    
}
class SumDArray
{
    public static void main(String args[])
    {
        int m,n,i,j;
        System.out.println("Enter the size of the matrix:");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        Array a1=new Array(m,n);
        System.out.println("Enter the contents of the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a1.a[i][j]=sc.nextInt();
        }
        a1.printArray();
        a1.diagonal();
    }
}