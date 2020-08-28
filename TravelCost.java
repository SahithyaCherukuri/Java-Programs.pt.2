import java.util.*;
public class TravelCost{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(),lockdown=0,count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==-1) {
                lockdown++;
            }
        }
        int skips=sc.nextInt();
        if(arr[n-1]==-1){
            System.out.println(-1);
            return;
        }
        if(skips<lockdown){
            System.out.println(-1);
            return;
        }
        skips-=lockdown;
        count+=arr[0];
        arr[0]=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-skips;i++){
            if(arr[i]==-1) continue;
            count+=arr[i];
        }
        System.out.println(count);
    }
}