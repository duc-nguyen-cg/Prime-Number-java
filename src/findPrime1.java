import java.util.Scanner;

public class findPrime1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = 2;
        while (count < 20){
            if (checkPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean checkPrime(int num){
        boolean check = true;
        int i = 2;
        while (i < num){
            if (num%i == 0){
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
