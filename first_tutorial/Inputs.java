import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Please enter some input: ");
        // int rollno = input.nextInt();
        // System.out.println("Your roll no is: " + rollno);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
