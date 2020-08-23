/*program to illustarte single inheritance:
sample input and output as:
Enter l and b values of rectangle:                                                                                      
3                                                                                                                       
4                                                                                                                       
Enter height of the cuboid:                                                                                             
5                                                                                                                       
Area of Rectangle is:12                                                                                                 
volume of Cuboid is:60                                                                                                  
*/
import java.util.*;
class Rectangle{
    public int l,b;
    void getRect(int x,int y){
        //initialize l,b values
        l=x;b=y;
    }
    int area(){
        //return area of rectangle
        return (l*b);
    }
	Rectangle(){
		System.out.println("base class");
	}
}
//make class Cube as subclass of Rectangle
class Cube extends Rectangle{
    int h;
	Cube(){
		System.out.println("derived class");
	}
    void getCube(int z){
        //initialize h value
        h=z;
    }
    int volume(){
        //return volume of the cuboid
        return(h*b*l);
    }
}
public class SingleInheritance1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a,b,h;
		
		//Rectangle r=new Rectangle();
		Cube c=new Cube();
		//create an object c for class Cube
		
		System.out.println("Enter l and b values of rectangle:");
		a=sc.nextInt();
		b=sc.nextInt();
		//read a,b values
		c.getRect(a,b);
		//invoke  method getRect() using above object with a,b as parameters
		
		System.out.println("Enter height of the cuboid:");
		//read h value
		h=sc.nextInt();
		//invoke method getCube() using above object with h as parameter
		c.getCube(h);
		System.out.println("Area of Rectangle is:"+c.area());
		System.out.println("volume of Cuboid is:"+c.volume());
	}
}
