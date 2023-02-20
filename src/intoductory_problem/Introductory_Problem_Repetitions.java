package intoductory_problem;/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
import java.util.Scanner;
public class Introductory_Problem_Repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
       long count=1;
       long res=1;
        for (int i = 1; i < str.length();i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
             count++;
             res=Math.max(count,res);
            } else {
                res=Math.max(res,count);
                count=1;
            }
        }
        System.out.println(res);
    }
}

