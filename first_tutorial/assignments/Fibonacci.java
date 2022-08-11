import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = ip.nextInt();
        int prevSum = 0;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(prevSum);
            int nextSum = prevSum + sum;
            sum = prevSum;
            prevSum = nextSum;
        }
    }
}
