import java.util.Scanner;

public class FindArmstrong {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("enter two nums seperated by space: ");
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();

        for (int i = num1; i <= num2; i++) {
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }
    }
}
