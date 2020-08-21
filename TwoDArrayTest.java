 /*program to find sum of the elements of given integer array
Sample input & output:
Enter the size of the matrices:                                                                                         
2                                                                                                                       
2                                                                                                                       
Enter the contents of the array:                                                                                        
1                                                                                                                       
2                                                                                                                       
3                                                                                                                       
4                                                                                                                       
The contents of the array:                                                                                              
1 2 3 4                                                                                                                 
Enter the contents of the array:                                                                                        
1                                                                                                                       
2                                                                                                                       
3                                                                                                                       
4                                                                                                                       
The contents of the array:                                                                                              
1 2 3 4                                                                                                                 
2 4                                                                                                                     
6 8                                                                                                                     

*/
import java.util.*;
class Array
{
    int a[][],i,j,m,n,sum,c[][];
    Array(int x,int y)
    {
        m=x;
        n=y;
        System.out.println("Enter the size of the matrices:");
        a=new int[m][n];
        c=new int[m][n];
    }
   
    void printArray()
    {
        System.out.println("The contents of the array:");
        //disp[lay array
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
    }
    void add(Array x)
    {
        //Write your code to perform addition
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]+=x.a[i][j];
            }
        }
        
    }
    void display()
    {
        //display the contents of array
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
class TwoDArrayTest
{
    public static void main(String args[])
    {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        Array a1=new Array(m,n);
        Array a2=new Array(m,n);
        
        
        System.out.println("Enter the contents of the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a1.a[i][j]=sc.nextInt();
        }
        a1.printArray();
        
          System.out.println("Enter the contents of the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a2.a[i][j]=sc.nextInt();
        }
        a2.printArray();
        a1.add(a2);
       // invoke method add() using a1 object with parameter as a2
        a1.display();
    }
}