import java.util.*;
class Input{
int n,m;
	int[] a,b,c;
	Input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("total number of players that got selected");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("their scores");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("number of matches rahul played");
		m=sc.nextInt();
		b=new int[m];
		c=new int[m];
		System.out.println("score of rahul");
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		/*for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<m;i++){
			System.out.print(b[i]+" ");
		}*/	
	}
	void setRank(){
		for(int j=0;j<m;j++){
			c[j]=5;
			for(int i=n-1;i>=0;i--){
		
				if(b[j]>=a[i]){
					c[j]=i+1;
	
				}
			}
		}
	}
	void getRank(){	
		for(int j=0;j<m;j++){
			System.out.println(c[j]);
		}
	}
}
class Rank{
	public static void main(String[] args)
{
	Input r=new Input();
	r.setRank();		
	r.getRank();		
}	
}