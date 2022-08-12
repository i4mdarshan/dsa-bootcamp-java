import java.util.Scanner;

public class CountingOcurrences {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // String num = ip.next();
        // System.out.print("Enter occurence number: ");
        // char n = ip.next().trim().charAt(0);
        // int count = 0;
        // for (int i = 0; i < num.length(); i++) {
        //     if(num.charAt(i) == n){
        //         count++;
        //     }
        // }

        // Second approach
        System.out.print("Enter a number: ");
        int num = ip.nextInt();
        System.out.print("Enter occurence number: ");
        int n = ip.nextInt();
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == n){
                count++;
            }
            num = num/10;
        }

        System.out.println("The number "+ n +" has occured " + count+ " times." );
    }    
}
