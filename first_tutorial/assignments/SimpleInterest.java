import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        float principal = ip.nextFloat();
        System.out.println();
        System.out.print("Enter time in years: ");
        float time = ip.nextFloat();
        System.out.println();
        System.out.print("Enter rate of interest in percentages: ");
        float rate = ip.nextFloat();
        System.out.println("Your Simple Interest is: " + ((principal * time * rate)/100));

    }
}
