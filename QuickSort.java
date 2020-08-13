import java.util.*;
class QuickSort{
	String names[]={"happy","sad","sweet","nice"};
	String word;
	int i,length;
	QuickSort(){
		Scanner s=new Scanner(System.in);
		/*System.out.println("number of names");
		i=s.nextInt();
		names=new String[i];
		System.out.println("Enter Names");
		for(int j=0;j<i;j++){
			names[j]=s.next();
		}*/
		//names={"happy","sad","sweet","nice"};
		for(String d:names){
			System.out.println(d);
		}
		length=names.length;
		sort(0,length-1);
		for(String d:names){
			System.out.println(d);
		}
	}
	void sort(int li,int hi){
		int i=li;
		int j=hi;
		int mid=li+(hi-li)/2;
		String pivot=this.names[mid];
		while(i<=j){
			while(this.names[i].compareToIgnoreCase(pivot)<0){
				i++;
			}
			while(this.names[j].compareToIgnoreCase(pivot)>0){
				j--;
			}
			if(i<=j){
				String temp=this.names[i];
				this.names[i]=this.names[j];
				this.names[j]=temp;i++;j--;
			}
		}
		if(li<j){
				sort(li,j);
			}
			if(hi>i){
				sort(i,hi);
			}
	}
	public static void main(String[] args){
		QuickSort q=new QuickSort();
		//not for mids do before internals
	}
}
/*
#include<iostream>
#include<conio.h> using namespace std;

//Function for partitioning array int part(int low,int high,int *a)
{
int i,h=high,l=low,p,t; //p==pivot p=a[low];
while(low<high)
{
while(a[l]<p)
{
l++;
}
while(a[h]>p)
{
 h--;

}
if(l<h)
{

t=a[l]; 
a[l]=a[h]; 
a[h]=t;
}
else
{
 
t=p; p=a[l];
a[l]=t; break;


}
}
return h;
}
 
 

void quick(int l,int h,int *a)
{
int index,i; if(l<h)
{
index=part(l,h,a); quick(l,index-1,a); quick(index+1,h,a);
}
}

int main()
 
{
int a[100],n,l,h,i;
cout<<"Enter number of elements:"; 
cin>>n;
cout<<"Enter the elements (Use Space As A Separator):";
 for(i=0;i<n;i++)
cin>>a[i];
cout<<"\nInitial Array:\n"; 
for(i=0;i<n;i++)
{
cout<<a[i]<<"\t";
}
h=n-1; l=0;
quick(l,h,a); 
cout<<"\nAfter Sorting:\n"; 
for(i=0;i<n;i++)
{
cout<<a[i]<<"\t";
}
getch(); 
return 0;
}
*/