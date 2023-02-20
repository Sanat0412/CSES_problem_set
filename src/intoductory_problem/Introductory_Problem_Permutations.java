package intoductory_problem;/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */


/* in this problem we have just make a permutation where none of the adjacent element have
// the difference equal to 1 so for that I print all the even element upto given N first and
// the odd elements upto N in the end here one thing is when the N==2 or N==3 then here in this
// case it is impossible to make that permutation and the reason behind storing the result into
// the StringBuilder is on testcase 16-21 it gives TLE without using StringBuilder that's what is
 in this problem*/
import java.util.Scanner;

public class Introductory_Problem_Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        StringBuilder res=new StringBuilder();
        //if(n==1) res.append(1);
        if(n==2 || n==3) res.append("NO SOLUTION");
        else{
            for(int i=1;i<=n;i++){
                if(i%2==0) res.append(i+" ");
            }
            for (int i = 1; i <=n ; i++) {
                if(i%2!=0) res.append(i+" ");
            }
            res.append("\n");
        }
        System.out.println(res.toString());
    }
}

