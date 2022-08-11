import java.util.Scanner;

public class Greet {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = ip.nextLine();
        System.out.println("Welcome " + name);
    }    
}
