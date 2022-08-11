import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter two integers seperated by space: ");
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();

        if (num1 > num2) {
            System.out.println("Largest number is " + num1);
        } else {
            System.out.println("Largest number is " + num2);
        }
    }
}
