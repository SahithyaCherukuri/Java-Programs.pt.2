import java.util.*;
class PaperFactory{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PaperFactory pf=new PaperFactory();
		int con[],row,bun;
		System.out.println("number of rows");
		row=sc.nextInt();
		System.out.println("number of paper bundles");
		for(int i=0;i<row;i++){
			bun=sc.nextInt();	
			con[i]=new int[bun];
			//pf.winner(con,bun);
		}				
	}
	/*void winner(int a[],int s){
		int *b,*t;
		int i,j,count1=0,count2=0;
		for(i=0;i<s;i++){
			a[i]=sc.nextInt();
		}
		for(i=s;i>0;i--){
			count1=count1+a[i];
			if(count)
			for(j=0;j<s;j++){
				count2=count2+a[j];
			}
		}
	}*/
}
class Node {
	int data;
	Node *next,*prev;
	Node(int d){
        prev=NULL;
        next=NULL;
            info=d;
        }
}
class List{
	 Node *first,*last;
    List()
    {
        first=NULL;
        last=NULL;
      
    }
    void add(int n)
        {
            if(first==NULL){
                first=new Node(n);
                last=first;
            }
            else{
                Node *temp=new Node(n);
                last->next=temp;
                temp->prev=last;
                last=temp;
            }
            
        }
}