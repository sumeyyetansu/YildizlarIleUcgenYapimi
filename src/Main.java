import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");

        int n = scanner.nextInt();
        for(int i = 0 ; i <= n  ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k ++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
       for(int k = (n - 1 ) ; k >= 0  ; k--) {

            for (int m = 1; m <= (n - k); m++) {
                System.out.print(" ");

            }
            for (int x = 1;  x <= (2 * k + 1); x ++){
                System.out.print("*");

            }
            System.out.println(" ");
       }
    }
}