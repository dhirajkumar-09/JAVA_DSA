// public class function{
//     public static void printHello(){
//         System.out.println("Hello");
//         return;
//     }
//     public static void main(String[] args) {
//         printHello();
//     }
// }



// import java.util.Scanner;
// public class function{
//     public static int add(int a, int b){
//         return a+b;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("The sum of " + a + " and " + b + " is: " + add(a, b));
//     }


// }


// public class function{
//     public static int number(int a){
    
//         return a;
//     }
//     public static void main(String[] args){
//         int a=7;
//         System.out.println(number(a));
//     }
// }


// public class function{
//     public static int factorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println("The factorial of " + n + " is: " + factorial(n));
//     }
// }


// public class function{
//     public static int factorial(int n){
//         if(n==0 || n==1){
//             return 1;
// //         }
// //         else{
//             return n*factorial(n-1);
//         }
//     }
//     public static int bincoeff(int n , int r){
//         int fact_n=factorial(n);
//         int fact_r=factorial(r);
//         int fact_n_r=factorial(n-r);
//         return fact_n/(fact_r*fact_n_r);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int r=2;
//         System.out.println("The binomial coefficient of " + n + " and " + r + " is: " + bincoeff(n, r));
//     }
// }


// public class function{
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static int sum(int a, int b, int c ){
//         return a+b+c;
//     }
//     public static void main (String[] args) {
//         System.out.println("The sum of 5 and 10 is: " + sum(5, 10));
//         System.out.println("The sum of 5, 10 and 15 is: " + sum(5, 10, 15));
//     }
// }


// public class function{
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static float sum(float a, float b){
//         return a+b;
//     }
//     public static void main (String[] args) {
//         System.out.println("The sum of 5 and 10 is: " + sum(5, 10));
//         System.out.println("The sum of 5.5 and 10.5 is: " + sum(5.5f, 10.5f));
//     }
// }
// public class function{
//     public static boolean checkprime(int n){
//         boolean checkprime=true;
//         for(int i=2; i<=n-1; i++){
//             if(n%i==0){
//                 checkprime=false;
//                 break;
//             }
//         }
//         return checkprime;
//     }
//     public static void main(String[] args) {
//        System.out.println("The number 7 is prime: " + checkprime(7));
// }
// }


public class function{
    // public static boolean isprime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void printprime(int n){
    //     for(int i=2; i<=n; i++){
    //         if(isprime(i)){
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void main(String[] args){
    //     System.out.println("The number 7 is prime: " + isprime(7));
    //     System.out.println("The prime numbers from 1 to 20 are: ");
    //     printprime(20);
    // }




    // public static int binToDec(int binnum){
    //     int pow=0;
    //     int dec_num=0;
    //     while(binnum>0){
    //         int last_digit=binnum%10;
    //         dec_num+=last_digit*Math.pow(2, pow);
    //         pow++;
    //         binnum/=10;
    //     }
    //     return dec_num;
    // }
    // public static void main(String[] args){
    //     int binnum=101;
    //     System.out.println("The decimal equivalent of binary number " + binnum + " is: " + binToDec(binnum));
    // }


    public static int decToBin(int decnum){
        int pow=0;
        int binnum=0;
        while(decnum>0){
            int last_digit=decnum%2;
            binnum+=last_digit*Math.pow(10, pow);
            pow++;
            decnum/=2;
        }
        return binnum;
    } 
    public static void main(String[] args){
        int  decnum=898;
        System.out.println("The binary equivalent of decimal number " + decnum + " is: " + decToBin(decnum));
    }

    
    
}