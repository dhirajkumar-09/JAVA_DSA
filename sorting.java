public class sorting{
    public static void bubble_Sort(int numbers[]){
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
    
    public static void main(String[] args) {
        int numbers[]={5,3,6,2};
       bubble_Sort(numbers);
       for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");
       }
    }
}

