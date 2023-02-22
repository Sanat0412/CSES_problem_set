/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 21-02-2023 but able to did it on 22-02-2023
 *   Time: 22:26 , at 23:43 hours
 *   File: intoductory_problem.Number_spiral.java
 */
// it is a observation based problem so first try yourself.
package intoductory_problem;
import java.util.Scanner;

public class Number_spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder res=new StringBuilder();
        long t= sc.nextLong();
        while (t-->0){
            long a= sc.nextLong();
            long b= sc.nextLong();
            long ans=0;
            if(a==1 && b==1) {
               ans=1;
            }
            else if(a==b) ans=((a*a)-(a-1));
            else if (a>b) {
                if(a%2!=0) ans=(a-1)*(a-1)+b;
                else ans=(a*a)-b+1;
            }
            else {
                if(b%2!=0) ans=(b*b)-a+1;
                else ans=(b-1)*(b-1)+a;
            }
            res.append(ans).append("\n");
        }
        System.out.println(res.toString());
    }
}

