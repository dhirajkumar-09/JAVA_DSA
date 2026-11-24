package DivideConquer;
public class quicksort {  // by use pivot and partition approach
    public static void quick_sort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int pivot=partition(arr,low,high);
        quick_sort(arr,low,pivot-1);//left
        quick_sort(arr,pivot+1,high);//right
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[high]=arr[i];
        arr[i]=temp;
        return i;
    }


    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void main(){
        int arr[]={1,2,4,5,6,3,10};
        quick_sort(arr,0,arr.length-1);
        printarr(arr);
    }
}