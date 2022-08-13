import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter three numbers seperated by space : ");
        int n1 = ip.nextInt();
        int n2 = ip.nextInt();
        int n3 = ip.nextInt();
        System.out.println("Maximum is: " + max(n1, n2, n3));
        System.out.println("Minimum is: " + min(n1, n2, n3));
    }

    static int min(int n1,int n2, int n3){
        return Math.min(n1,Math.min(n2,n3));
    }

    static int max(int n1, int n2, int n3){
        return Math.max(n1,Math.max(n2, n3));
    }
}
