// Controlling the main Thread.
/*class CurrentThreadDemo {
 public static void main(String args[]) {
 Thread t = Thread.currentThread();
 System.out.println("Current thread: " + t);
 // change the name of the thread
 t.setName("My Thread");
 System.out.println("After name change: " + t);
 try {
 for(int n = 5; n > 0; n--) {
 System.out.println(n);
 Thread.sleep(1000);
 }
 } catch (InterruptedException e) {
 System.out.println("Main thread interrupted");
 }
 }
}****
// Create a second thread.
class NewThread implements Runnable {
 Thread t;
 NewThread() {
 // Create a new, second thread
 t = new Thread(this, "Demo Thread");
 System.out.println("Child thread: " + t);
 t.start(); // Start the thread
 }
 // This is the entry point for the second thread.
 public void run() {
 try {
 for(int i = 5; i > 0; i--) {
 System.out.println("Child Thread: " + i);
 Thread.sleep(500);
 }
 } catch (InterruptedException e) {
 System.out.println("Child interrupted.");
 }
 System.out.println("Exiting child thread.");
 }
 }
class ThreadDemo {
 public static void main(String args[ ] ) {
 new NewThread(); // create a new thread
 try {
 for(int i = 5; i > 0; i--) {
 System.out.println("Main Thread: " + i);
 Thread.sleep(1000);
 }
 } catch (InterruptedException e) {
 System.out.println("Main thread interrupted.");
 }
 System.out.println("Main thread exiting.");
 }
}*******
// Create a second thread by extending Thread
class NewThread extends Thread {
 NewThread() {
 // Create a new, second thread
 super("Demo Thread");
 System.out.println("Child thread: " + this);
 start(); // Start the thread
 }
 // This is the entry point for the second thread.
 public void run() {
 try {
 for(int i = 5; i > 0; i--) {
 System.out.println("Child Thread: " + i);
 Thread.sleep(500);
 }
 } catch (InterruptedException e) {
 System.out.println("Child interrupted.");
 }
 System.out.println("Exiting child thread.");
 }
}
class ExtendThread {
 public static void main(String args[]) {
 new NewThread(); // create a new thread
 try {
 for(int i = 5; i > 0; i--) {
 System.out.println("Main Thread: " + i);
 Thread.sleep(1000);
 }
 } catch (InterruptedException e) {
 System.out.println("Main thread interrupted.");
 }
 System.out.println("Main thread exiting.");
 }
}*/
// Create multiple threads.
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
 System.out.println(name + "Interrupted");
 }
 System.out.println(name + " exiting.");
 }
 }
/* class MultiThreadDemo {
 public static void main(String args[]) {
 new NewThread("One"); // start threads
 new NewThread("Two");
 new NewThread("Three");
 try {
 // wait for other threads to end
 Thread.sleep(10000);
 } catch (InterruptedException e) {
 System.out.println("Main thread Interrupted");
 }
 System.out.println("Main thread exiting.");
 }
}*/
class DemoJoin {
 public static void main(String args[]) {
 NewThread ob1 = new NewThread("One");
 NewThread ob2 = new NewThread("Two");
 NewThread ob3 = new NewThread("Three");
 System.out.println("Thread One is alive: "
 + ob1.t.isAlive());
 System.out.println("Thread Two is alive: "
 + ob2.t.isAlive());
 System.out.println("Thread Three is alive: "
 + ob3.t.isAlive());
 // wait for threads to finish
 try {
 System.out.println("Waiting for threads to finish.");
 ob1.t.join();
 ob2.t.join();
 ob3.t.join();
 } catch (InterruptedException e) {
 System.out.println("Main thread Interrupted");
 }
 System.out.println("Thread One is alive: "
 + ob1.t.isAlive());
 System.out.println("Thread Two is alive: "
 + ob2.t.isAlive());
 System.out.println("Thread Three is alive: "
 + ob3.t.isAlive());
 System.out.println("Main thread exiting.");
 }
}