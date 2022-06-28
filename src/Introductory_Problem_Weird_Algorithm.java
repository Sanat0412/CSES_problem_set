/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
// It is just a basic problem you just have to check whether the given number is odd or even.
import java.util.Scanner;
public class Introductory_Problem_Weird_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(" " + n);
            } else {
                n = (n * 3) + 1;
                System.out.print(" " + n);
            }
        }
    }
}


