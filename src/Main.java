import java.util.Scanner;
public class Main {
    public static boolean prime_number(int sayi){
        for (int i = 2 ; i<sayi ; i++) {
            if (sayi % i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        for (int i = 2 ; i<1000; i++){

            if (prime_number(i)){
                System.out.println(i);
            }
        }

    }
}