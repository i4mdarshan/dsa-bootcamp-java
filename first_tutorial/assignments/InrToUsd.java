import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int rupees = ip.nextInt();
        int dollars = (rupees/79);
        int cents = (rupees % 79);
        System.out.println("Amount in USD is " + dollars + " dollars and "+ cents + " cents.");
    }    
}
