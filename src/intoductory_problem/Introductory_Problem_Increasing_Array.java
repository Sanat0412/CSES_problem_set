/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */

/*
in this problem you have to make an increasing array means if the adjacent elements are common then it is
acceptable so, I just check if the current element is greater than to its next element then just add
their difference into new variable and assigned the value of current element to the next element.
 */
package intoductory_problem;
import java.util.Scanner;
public class Introductory_Problem_Increasing_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        long res=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]) {
                res+=(arr[i]-arr[i+1]);
                 arr[i+1]=arr[i];
            }
        }
        System.out.println(res);
    }
}

