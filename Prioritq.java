import java.util.*;
class Test2{
	public static void main(String[] args){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(5);
		pq.add(15);
		pq.add(4);
		pq.add(7);
		pq.add(11);
		for(int i=0;i<5;i++){
			int e=pq.poll();
			System.out.println(e);
		}
	}
}