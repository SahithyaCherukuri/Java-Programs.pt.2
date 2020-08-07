import java.util.*;
class Diamonds{
	int a,b=1,g,d,h=0,i,k;
	ArrayList<Integer> c,n;
	Diamonds(){
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		c=new ArrayList<Integer>(a);
		n=new ArrayList<Integer>((a+1)*a);
		//n=new int[a];
		for(i=0;i<a;i++){
			k=s.nextInt();
			c.add(k);
		}
		for(int j : c){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	void earn(){
		for(int j : c){
				h=h+(b*j);
			}
		n.add(h);
		/*for(i=0;i<a;i++){
			h=0;			
			for(int j : c){
				if(c.get(i)!=j){
					b=2;
					h=h+(b*j);
				}
			}
			n.add(h);
		}*/
		//n.clear();
		int a1=1;	
		for(int m=0;m<a;m++){
		if(a1<a){
			for(i=0;i<a;i=i+a1){
				h=0;	
				for(int j : c){
					if(c.get(i)!=j){
						b=a1+1;
						h=h+(b*j);
					}
				}
				n.add(h);
			}		
			a1=a1+1;
		}
		}
		System.out.println(h);
		for(int j: n){
			//System.out.print(j+" ");
		}
		System.out.println(n);
	}
}
class Test{
	public static void main(String[] args){
		Diamonds dia=new Diamonds();
		dia.earn();
	}
}