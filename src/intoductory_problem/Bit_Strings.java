/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 20-02-2023
 *   Time: 19:32
 *   File: intoductory_problem.Bit_Strings.java
 */
// in these problem we have to find the way we can write n length of bit String so, I've used simple approach
// and just find 2^n value ,it may be very long so doing mod at every step.
package intoductory_problem;
import java.util.Scanner;
public class Bit_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder res=new StringBuilder();
        int n= sc.nextInt();
        int mod=(int) 1e9+7;
        long ans=1;
        for (int i = 0; i < n; i++) {
            ans=(ans*2)%mod;
        }
        res.append(ans);
        System.out.println(res.toString());
    }
}

