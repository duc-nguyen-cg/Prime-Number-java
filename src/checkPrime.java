import java.util.Scanner;

public class checkPrime {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 2){
            System.out.println(num + " is NOT a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is NOT a prime");
            }
        }
    }
}
