import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = ip.nextInt();

        // Shorthand division of a number
        // String ans = "1";
        // while(n > 1){
        //     if(n % 2 == 0){
        //         ans += ", 2";
        //         n = n/2;
        //     }else if(n % 3 == 0){
        //         ans += ", 3";
        //         n = n/3;
        //     }else if(n % 5 == 0){
        //         ans += ", 5";
        //         n = n/5;
        //     }else if(n % 7 == 0){
        //         ans += ", 7";
        //         n = n/7;
        //     }else if(n % 11 == 0){
        //         ans += ", 11";
        //         n = n/11;
        //     }
        // }
        System.out.print("Factors of " + n + " are: ");
        // Factors of a number
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}