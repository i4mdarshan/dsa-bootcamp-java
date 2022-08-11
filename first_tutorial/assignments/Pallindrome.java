import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = ip.nextLine();
        String ans = "";
        for (int i = str.length() - 1; i >=0; i--) {
            ans += str.charAt(i);
        }
        if (str.compareTo(ans) == 0) {
            System.out.println("Entered string is Pallindrome");
        } else {
            System.out.println("Entered string is NOT Pallindrome");
        }
    }
}
