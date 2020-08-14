import java.awt.*; 
class ScrollBarExample extends Frame 
{ 
     ScrollBarExample() 
     { 
           setLayout(new FlowLayout()); 
           //Horizontal Scrollbar with min value 0,max value 100,initial value 50 and visible amount 10 
           Label lblHor =new Label("Horizontal Scrollbar"); 
           Scrollbar sl = new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100); 
           //Vertical Scrollbar with min value 0,max value 255,initial value 10 and visible amount 5 
           Label lblver =new Label("Vertical Scrollbar"); 
           Scrollbar s2 = new Scrollbar(Scrollbar.VERTICAL,10,5,0,10); 
           add(lblHor); add(sl); 
           add(lblver); add(s2); 
     } 
} 
     class ScrollBarJavaExample 
     { 
           public static void main(String args[]) 
          { 
               ScrollBarExample frame = new ScrollBarExample(); 
               frame.setTitle("Scrollbar in Java Example"); 
               frame.setSize(520,200); 
               frame.setVisible(true); 
          } 
     } 