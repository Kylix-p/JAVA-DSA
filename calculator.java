import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Select operation: ");
        int operator = sc.nextInt();

        switch (operator){
            case 1 : System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
            break;
            case 2 : System.out.println("Sub of "+a+" and "+b+" is "+(a-b));
            break;
            case 3 : System.out.println("Mul of "+a+" and "+b+" is "+(a*b));
            break;
            case 4 : System.out.println("Div of "+a+" and "+b+" is "+(a/b));
            break;
            default : System.out.println("Invalid");

        }
    }
}
