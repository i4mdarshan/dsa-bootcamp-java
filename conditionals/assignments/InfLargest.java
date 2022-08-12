import java.util.Scanner;

public class InfLargest {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int max = 0;
        while(true){
            int n = ip.nextInt();
            max = Math.max(n,max);
            if(n==0){
                System.out.println("Maximum is: " + max);
                break;
            }
        }

    }
}
