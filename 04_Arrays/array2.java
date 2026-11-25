public class array2{
    // public static int  maxSum(int number[]){
    //     int CurrSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0; i<number.length; i++){
    //        int start=i;
    //         for(int j=i; j<number.length; j++){
    //             int end=j;
    //             CurrSum=0;
    //             for(int k=start; k<=end; k++){
    //                 CurrSum += number[k];
    //             }
    //             if(maxSum<CurrSum){
    //                 maxSum=CurrSum;                
    //             }
    //         }
    //     } 
    //     return maxSum;
    // }
    // public static void main(String[] args) {
    //     int number[]={4,5,6,7,8,9};
    //     System.out.println(maxSum(number));
    // }

    // public static int prefix_maxSum(int numbers[]){   // prefix sum method
    //     int CurrSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     int prefix[]=new int[numbers.length];
    //     prefix[0]=numbers[0];
    //     for(int i=1; i<numbers.length; i++){
    //         prefix[i]=prefix[i-1]+numbers[i];
    //     }
    //     for(int i=0; i<numbers.length; i++){
    //        int start=i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end=j;
    //             CurrSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
    //             if(maxSum<CurrSum){
    //                 maxSum=CurrSum;                
    //             }
    //         }
    //     } 
    //     return maxSum;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={3,4,5,6,7,8};
    //     System.out.println(prefix_maxSum(numbers));
    // }
     

    public static int max_sum_kadane(int numbers[]){   // kadane's algorithm
          int max_sum=Integer.MIN_VALUE;
          int curr_sum=0;                              //Time Complexity-O(n)
          for(int i=0; i<numbers.length; i++){
            curr_sum=curr_sum+numbers[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            max_sum=Math.max(curr_sum,max_sum);
          }
          return max_sum;
    }
    public static void main(String[] args) {
        int numbers[]={4,3,5,2,5,9};
        System.out.print("Maximum Sub-array sum is the "+max_sum_kadane(numbers));
    }
}