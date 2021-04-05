public class findPrime2 {
    public static void main(String[] args){
        int number = 2;
        while (number < 100){
            if (checkPrime(number)){
                System.out.println(number);
            }
            number++;
        }
    }

    public static boolean checkPrime(int num){
        boolean check = true;
        int i = 2;
        while (i <= Math.sqrt(num)){
            if (num%i == 0){
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
