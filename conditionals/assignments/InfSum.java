import java.util.Scanner;

public class InfSum {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int sum = 0;
        while (true) {
            int n = ip.nextInt();
            sum += n;
            if (n == 0){
                System.out.println("The sum is " + sum);
                break;
            }
        }
    }
}
