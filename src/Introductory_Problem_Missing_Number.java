/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
// It is also a basic problem based upon hashmap but i used frequency array to count the frequency of the elements if the frequency of any number is zero then that's the answer.
import java.util.Scanner;

public class Introductory_Problem_Missing_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n-1];
        int[] freq=new int[n+5];
        for (int i = 0; i < n-1; i++) {
            arr[i]= sc.nextInt();
            freq[arr[i]]++;
        }
        int res=0;
        for (int i = 1; i <=freq.length; i++) {
            if(freq[i]!=1) {
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}

