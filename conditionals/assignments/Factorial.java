import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = ip.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        System.out.println("Factorial of number is: " + ans);
    }
}
