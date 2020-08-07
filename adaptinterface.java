/* there is a big interface called GUI with methods . Most of the windowing systems like 
microsoft windows or xwindows (for linux) import only some of the methods in this interface.
We will need a dummy implementation for remaining methods.

Sample output:

default implementation                                                                                                  
Windows implementation                                                                                                   
default implementation                                                                                                  
default implementation                                                                                                  
Windows implementation                                                                                                  
Windows implementation                                                                                                  
default implementation                                                                                                  
XWindows implementation                                                                                                 
XWindows implementation                                                                                                  
XWindows implementation                                                                                                 
default implementation                                                                                                  
XWindows implementation                                                                                                 
default implementation                                                                                                  
default implementation
*/
interface GUI{
	void mouseover();
	void mouseenter();
	void mouseexit();
	void keypressed();
	void keyreleased();
	void lbuttonpressed();
	void rbuttonpressed();

}
class Adaptx implements GUI{
    public void mouseover(){
        System.out.println("default implementation");
    }
    public void mouseenter(){
        System.out.println("default implementation");
    }
    public void mouseexit(){
        System.out.println("default implementation");
    }
    public void keypressed(){
        System.out.println("default implementation");
    }
    public void keyreleased(){
        System.out.println("default implementation");
    }
    public void lbuttonpressed(){
        System.out.println("default implementation");
    }
    public void rbuttonpressed(){
        System.out.println("default implementation");
    }
}
class Windows extends Adaptx{
    public void mouseenter(){
        System.out.println("Windows implementation");
    }
    public void keyreleased(){
        System.out.println("Windows implementation");
    }
    public void lbuttonpressed(){
        System.out.println("Windows implementation");
    }
}
class XWindows extends Adaptx{
    public void mouseover(){
        System.out.println("XWindows implementation");
    }
    public void mouseenter(){
        System.out.println("XWindows implementation");
    }
    public void mouseexit(){
        System.out.println("XWindows implementation");
    }
    public void keyreleased(){
        System.out.println("XWindows implementation");
    }
}
//Write code here
public class Test{
	public static void main(String args[]){
	
		GUI g;
		g=new Windows();
		
		g.mouseover();
		g.mouseenter();
		g.mouseexit();
		g.keypressed();
		g.keyreleased();
		g.lbuttonpressed();
		g.rbuttonpressed();


		g=new XWindows();
		
		g.mouseover();
		g.mouseenter();
		g.mouseexit();
		g.keypressed();
		g.keyreleased();
		g.lbuttonpressed();
		g.rbuttonpressed();


	}
}

