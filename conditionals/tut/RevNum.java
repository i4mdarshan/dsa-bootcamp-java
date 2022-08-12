import java.util.Scanner;

public class RevNum {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt();
        // String ans = "";

        // while (n > 0) {
        //     int units = n % 10;
        //     ans += units;
        //     n = n/10;
        // }

        // Second approach
        int ans = 0;
        while (n > 0) {
            int units = n % 10;
            ans = (ans * 10) + units;
            n = n/10;
        }

        System.out.println("The reverse of the number is " + ans);


    }
}
