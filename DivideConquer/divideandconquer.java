package DivideConquer;
public class divideandconquer {
    public static void mergesort(int arr[],int si, int ei){
        if(si>=ei){
           return;
        }
        int mid=si+(ei-si)/2;  //(si+ei)/2
        mergesort(arr,si,mid);  //left
        mergesort(arr,mid+1,ei);  //right
        merge(arr,si,mid,ei);   //sorted merge both parts
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void main(){
        int arr[]={1,2,4,5,6,3,10};
        mergesort(arr,0,arr.length-1);
        printarr(arr);
    }
}  //Timecomplexity O(nlogn)
//Space O(n)

