package searching_and_sorting;/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
// this is a basic problem you just have to count the distinct number, so with the help of hashset you can find
// the distinct number.

import java.util.HashSet;
import java.util.Scanner;

public class Distinct_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder res=new StringBuilder();
        HashSet<Long> mp=new HashSet<>();
        long n= sc.nextLong();
        for (long i = 0; i < n; i++) {
            long a= sc.nextLong();
            mp.add(a);
        }
        res.append(mp.size());
        System.out.println(res.toString());
    }
}

