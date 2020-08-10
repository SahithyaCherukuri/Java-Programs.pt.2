/*java program to find sum of two complex number by overloading add() method. Pass object as parameter.
sample input/output:
Enter the real part and img part of the first complex number:                                                           
10                                                                                                                      
20                                                                                                                      
Enter the real part and img part of the second complex number:                                                          
15                                                                                                                      
25                                                                                                                      
10+20i                                                                                                                  
15+25i                                                                                                                  
25+45i                                                                                                                  
10+20i                                                                                                                  
15+25i                                                                                                                  
25+45i */

import java.util.*;

class Complex
{
    int r,i;
    Complex()
    {
        
    }
    Complex(int r ,int i)
    {
        this.r=r;
        this.i=i;
    }
    void add(Complex x,Complex y)
    {
        r=x.r+y.r;
        i=x.i+y.i;
    }
    Complex add(Complex y)
    {
        Complex z=new Complex();
        z.r=r+y.r;
        z.i=i+y.i;
        return z;
    }
    void output()
    {
        System.out.println(r+"+"+i+"i");
    }
}
class ComplexAdd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real part and img part of the first complex number:");
        int r,i;
        r=s.nextInt();
        i=s.nextInt();
        //read r and i values of first complex number
        Complex c1=new Complex(r,i);
        System.out.println("Enter the real part and img part of the second complex number:");
        //read r and i values of second complex number
        r=s.nextInt();
        i=s.nextInt();
        Complex c2=new Complex(r,i);
        Complex c3=new Complex();
        
        //invoke add() method using c3 with arguments c1,c2
        c3.add(c1,c2);
        c1.output();
        c2.output();
        c3.output();
        
        
        c3=c1.add(c2);// invoke add() method using c1 with argument c2 and assign to c3
        //c1.add(c2,c3);
        c1.output();
        c2.output();
        c3.output();
        
    }
    
}