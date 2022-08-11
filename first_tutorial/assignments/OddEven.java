import java.util.Scanner;

public class OddEven {
    public static void main (String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int num = ip.nextInt();

        if(num % 2 == 0){
            System.out.println("You have entered an Even Integer.");
        }else{
            System.out.println("You have entered an Odd Integer");
        }

    }
}
