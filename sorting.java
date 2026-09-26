public class sorting{
    public static void bubble_Sort(int numbers[]){     //bubble sort 
        for(int turn=0; turn<numbers.length-1; turn++){
            for(int j=0; j<numbers.length-1-turn; j++){
                if(numbers[j]>numbers[j+1]){
                    //swapping the number
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }


    public static void selection_sort(int numbers[]){
        for (int i = 0; i <numbers.length; i++){
            int minPos=i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[minPos]>numbers[j]){       // if we want to sorting array in decreasing then just put opposite comparison symbol(>)
                    minPos=j;
                }
            } 
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
        }
    }


    public static void insertion_sort(int numbers[]){
        for(int i=1; i<numbers.length; i++){
            int curr=numbers[i];
            int previous=(i-1);
            // finding out the correct pos to insert 
            while(previous>=0 && numbers[previous]>curr){
                numbers[previous+1]=numbers[previous];
                previous --;
            }
            numbers[previous+1]=curr;
        }
    }
    
          // in build sort function 

    public static void main(String[] args) {
        int numbers[]={5,3,6,2};
    //    selection_sort(numbers);
    insertion_sort(numbers);
       for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");
       }
    }   
}