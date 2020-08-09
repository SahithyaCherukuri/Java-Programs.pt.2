/*import java.util.*;
class even implements Runnable{
	public int x;
	public even(int x){
		this.x=x;
	}
	public void run(){
		System.out.println("Even Thread: "+"the sqaure of "+x+" is "+x*x);
	}
}
class odd implements Runnable{
	public int x;
	public odd(int x){
		this.x=x;
	}
	public void run(){
		System.out.println("Odd Thread: "+"the cube of "+x+" is "+x*x*x);
	}
}
class MultiThread extends Thread{
	String tname;
	Random r;
	Thread t1,t2;
	public MultiThread(String s){
		tname=s;
	}
	public void run(){
		int num=0;
		r=new Random();
		try{
			for(int i=0;i<10;i++){
				num=r.nextInt(50);
				System.out.println("Main Thread: num is "+num);
				if(num%2==0){
					t1=new Thread(new even(num));
					t1.start();
				}
				else{
					t2=new Thread(new odd(num));
					t2.start();
				}
				Thread.sleep(1000);
				System.out.println("------------------------------");
			} 
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args){
		MultiThread td=new MultiThread("one");
		td.start();
	}
}*/
// Using join() to wait for threads to finish.
 class NewThread implements Runnable {  
  String name; // name of thread 
   Thread t; 
   NewThread(String threadname) {     
   name = threadname;     
   t = new Thread(this, name);     
   System.out.println("New thread: " + t);     
   t.start(); // Start the thread 
   } 
   // This is the entry point for thread.   
   public void run() {    
    		try {       
			for(int i = 5; i > 0; i--) {         
					System.out.println(name + ": " + i);
					Thread.sleep(1000);       
			}     
		} catch (InterruptedException e) { 
			      System.out.println(name + " interrupted.");
			 }
			 System.out.println(name + " exiting.");   } } 
 
	class DemoJoin {   
			public static void main(String args[]) {
			     NewThread ob1 = new NewThread("One");
				 NewThread ob2 = new NewThread("Two");     
				 NewThread ob3 = new NewThread("Three"); 

   				 System.out.println("Thread One is alive: " + ob1.t.isAlive());     
				 System.out.println("Thread Two is alive: "+ ob2.t.isAlive());     
				 System.out.println("Thread Three is alive: "+ ob3.t.isAlive());    
				  // wait for threads to finish    
				   try {       
				   		System.out.println("Waiting for threads to finish.");       
						ob1.t.join();       
						ob2.t.join();      
						 ob3.t.join();     
				} catch (InterruptedException e) {       
					System.out.println("Main thread Interrupted");  
				   } 
 
		    System.out.println("Thread One is alive: "+ ob1.t.isAlive());   
			 System.out.println("Thread Two is alive: "+ ob2.t.isAlive());     
			 System.out.println("Thread Three is alive: "+ ob3.t.isAlive()); 
		    System.out.println("Main thread exiting.");  
			} 
	}