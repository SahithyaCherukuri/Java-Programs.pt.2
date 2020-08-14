/* Program to implement producer consumer problem.
sample input and output:
Put 1                                                                                                                   
Get 1                                                                                                                   
Put 2                                                                                                                   
Get 2                                                                                                                   
Put 3                                                                                                                   
Get 3                                                                                                                   
Put 4                                                                                                                   
Get 4                                                                                                                   
Put 5                                                                                                                   
Get 5                                                                                                                   
Put 6                                                                                                                   
Get 6                                                                                                                   
Put 7                                                                                                                   
Get 7                                                                                                                   
Put 8                                                                                                                   
Get 8                                                                                                                   
Put 9                                                                                                                   
Get 9                                                                                                                   
Put 10                                                                                                                  
Get 10                                                                                                                  

*/
class Shared {
    int signal,count=0;
    boolean flag;
    synchronized public void put(){
        try{
            while(flag){
                wait();
            }
            signal=count;
            flag=true;
            count++;
            System.out.println("Put "+count);
            notify();
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    } 
    synchronized public void get(){
        try{
            while(!flag){
                wait();
            }
            flag=false;
            System.out.println("Get "+count);
            notify();
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
    
    //declare required variables
    //implement put() and get() methods 
}
class Producer extends Thread
	{
	Shared sh;
	public Producer(Shared sh) {
		this.sh=sh;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			sh.put();
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread
	{
	Shared sh;
	public Consumer(Shared sh){
		this.sh=sh;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			sh.get();
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerTest {
	public static void main(String[] args) {
		Shared sh=new Shared();
		Producer p=new Producer(sh);
		Consumer c=new Consumer(sh);
		p.start();
		c.start();
	}
}