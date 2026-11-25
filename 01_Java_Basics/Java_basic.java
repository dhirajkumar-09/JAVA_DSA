import java.util.*;
public class Java_basic{
    public static void main(String args[]){          //Boilerplate Code
    // System.out.print("Hello World\n");
    // System.out.println("Hello World");  // space of line
    // System.out.println("****");
    // System.out.println("***");
    // System.out.println("**");
    // System.out.println("*");


    // Scanner sc = new Scanner(System.in);
    // float a = sc.nextInt();
    // System.out.println(a);
    // int b= sc.nextFloat();      // here we are taking float value and storing it in int variable so it will give error
    // System.out.println(b);
    // int a=10;
    // float b=25.5f;
    // long c= 30  ;
    // double d= 35;
    // double ans= a+b+c+d;
    // System.out.println(ans);
    // System.out.println("Addition of two numbers:"+ (a+b));
    // int a=10;
    // int b=++a;
    // System.out.println(a);
    // System.out.println(b);
    // int c= a++;
    // System.out.println(a);
    // System.out.println(c);

    // System.out.println(9<8 && 8>7);    // logical operator
    // System.out.println(9<8 || 8>7);
    // System.out.println(!(9<10));

    // int z=10;
    // System.out.println(z+=9);
    //     Scanner sc = new Scanner(System.in);
    // int income=sc.nextInt();
    // if(income>100000){
    //     System.out.println("You are in 30% tax slab:"+income*0.3);
    // }
    // else if(income>50000 && income<=100000){
    //     System.out.println("You are in 20% tax slab:"+income*0.2);
    // }
    // else if(income>25000 && income<=50000){
    //     System.out.println("You are in 5% tax slab:"+income*0.05);
    // }
    // else{
    //     System.out.println("You are in 0% tax slab:"+income*0);
    // }
    Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
        case 1:
            System.out.println("You have selected 1");
            break;
        case 2:
            System.out.println("You have selected 2");
            break;
        case 3:
            System.out.println("You have selected 3");
            break;
        default:
            System.out.println("You have selected wrong number");

    }
}
}