import java.util.Scanner;

public class NumOperator {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter two integers seperated by space: ");
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter you choice: ");
        int choice = ip.nextInt();
        if(choice == 1){
            System.out.println("Your output is: " + (num1 + num2));
        }else if (choice == 2){
            System.out.println("Your output is: " + (num1 - num2));
        }else if (choice == 3){
            System.out.println("Your output is: " + (num1 * num2));
        }else if (choice == 4){
            System.out.println("Your output is: " + (num1 / num2));
        }else{
            System.out.println("You have entered and invalid operator");
        }
    }
}
