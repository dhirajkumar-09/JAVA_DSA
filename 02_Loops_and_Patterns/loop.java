import java.util.Scanner;
public class loop{
    public static void main(String args[]){          //Boilerplate Code
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int number=sc.nextInt();
        // // for(int i=1;i<=number;i++){         //For loop
        // //     System.out.println(i);
        // // }
        // int sum=0;
        // int j=2;
        // while(j<=number){           // while loop
        //     System.out.println(j);
        //     j+=2;
        // sum+=j;
        // }
        // System.out.println("Sum of even numbers is : "+sum);
        

        // int summ=0;
        // for(int i=0; i<=5; i++){      // for(initialization; condition; increment/decrement)
        //     summ+=i;
        // }
        // System.out.println("Sum of numbers from 0 to 5 is : "+summ);


        // for(int i=1;i<=4; i++){
        //     System.out.println("****");
        // }

        // int n=1088889;                 //print the number in reverse order and count the number of digits
        // int count=0;
        // while(n>0){
        //     int lastdigit=n%10;
        //     System.out.print(lastdigit);
        //     n/=10;
        //     count++;
        // }
        // System.out.println();
        // System.out.println("Number of digits: " + count);


        // int m=1088889;                 //print the number in reverse order and count the number of digits
        // int reverse=0;
        // while(m>0){
        //     int lastdigit=m%10;
        //     reverse=reverse*10+lastdigit;
        //     m/=10;
        // }
        // System.out.println("Reverse of the number: " + reverse);


        // int i=1;
        // while(i<=5){
        //     if (i==3){
        //         i++;
        //         break;  // break statement is used to terminate the loop when i=3
        //     }
        //     System.out.println(i);
        //     i++;
        // }


        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter a number: ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         break;  // break statement is used to terminate the loop when a number divisible by 10 is entered
        //     }
        //     System.out.println("You entered: " + num);
        // }
        // while(true);

    
    // System.out.println("Loop terminated because a number divisible by 10 was entered.");

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    for(int i=2;i<=num;i++){
        if (num%i==0){
            System.out.println("number is not prime");
            break;
        }
        if (i==num){
            System.out.println("number is prime");
            break;
        }
        else{
            System.out.println("number is prime");
            break;
        }
}
    }}
