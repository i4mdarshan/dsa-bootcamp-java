import java.util.Scanner;

public class DigitProdSum {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt();

        int product = 1;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n = n/10;
        }

        System.out.println("The product of its digits is "+product+" and sum is "+sum);
    }
}
