public class recurrslec {

    public static void printDEC(int n) {
        if (n == 1) {     //base case
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDEC(n - 1);
    }


    public static void printInc(int n){
        if (n == 1) {     //base case
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
    }


    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fn=n*fact(n-1);
        return fn;
    }


    public static int sum_of_numbers(int n){
        if(n==0) return 0;
        int sum=0;
        for(int i=1; i<=n; i++){   // using loop
            sum+=i;
        }
        return sum;
    }


    public static int sum_of_natural_numbers(int n){
        if(n==1) return 1;
        int snm1=sum_of_natural_numbers(n-1);
        int result=n+snm1;
        return result;
    }


    public static int fibonacci_number(int n){
        if(n==0 || n==1) return n;
        int fib1=fibonacci_number(n-1);
        int fib2=fibonacci_number(n-2);
        int fib=fib1+fib2;
        return fib;
    }


    public static void print_fibonacci(int n) {
        if (n <= 0) {       //base case
            return;
        }
        int fibonacci[] = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }


    //Check an array sorted or not
    public static boolean is_sorted(int arr[],int i){ //here i is the index
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) return false;
        return is_sorted(arr,i+1);     // complexity O(n)
    }


    //find first occurence of an element
    public static int first_occurence(int arr[],int key,int i){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return first_occurence(arr,key,i+1);
    }
    void main(String[] args) {
        int n = 8;
//        printDEC(n);
        printInc(n);
        System.out.println(fact(6));
        System.out.println("Sum of n natural numbers is : "+sum_of_numbers(n));
        System.out.println("Sum of n natural numbers is : "+sum_of_natural_numbers(n));
        System.out.println("Nth term of fibonacci number : "+fibonacci_number(25));
        print_fibonacci(6);
        int[] arr={67,353,34,5243,5,5,6,7,8};
        System.out.println(is_sorted(arr,2));
        System.out.println(first_occurence(arr,5,0));
    }
}