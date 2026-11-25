import java.util.*;
public class calculator{
    public static void main(String args[]){          //Boilerplate Code
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator=sc.next().charAt(0);
        System.out.print("Enter the first number : ");
        float f=sc.nextFloat();
        System.out.print("Enter the second number : ");
        float g=sc.nextFloat();
        switch(operator){
            case '+':
                System.out.println("You have selected addition and the result is: "+(f+g));
                break;
            case '-':
                System.out.println("You have selected subtraction and the result is: "+(f-g));
                break;
            case '*':
                System.out.println("You have selected multiplication and the result is: "+(f*g));
                break;
            case '/':
                System.out.println("You have selected division and the result is: "+(f/g));
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
}