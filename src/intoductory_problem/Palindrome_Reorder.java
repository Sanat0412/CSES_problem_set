package intoductory_problem;/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 06-07-2023
 *   Time: 08:08
 *   File: intoductory_problem.Palindrome_Reorder.java
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palindrome_Reorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder res=new StringBuilder();
        String str= sc.next();
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
        }
        boolean mone=true;
        boolean odd=true;
        if(str.length()%2!=0){
            int count=0;
            for(Map.Entry<Character,Integer> ent:mp.entrySet()){
                if(ent.getValue()%2!=0) count++;
            }
            if(count>1) mone=false;
        }
        else{
            for(Map.Entry<Character,Integer> ent:mp.entrySet()){
                if(ent.getValue()%2!=0) odd=false;
            }
        }
        if(!mone || !odd) res.append("NO SOLUTION");
        else{
            if(str.length()%2==0){
                StringBuilder ans=new StringBuilder();
                for(Map.Entry<Character,Integer> ent:mp.entrySet()){
                    int a= ent.getValue()/2;
                    for (int i = 0; i < a; i++) {
                        ans.append(ent.getKey());
                    }
                }
                StringBuilder fin=new StringBuilder(ans);
                fin.reverse();
                res.append(ans+""+fin);
            }
            else{
                StringBuilder ans=new StringBuilder();
                StringBuilder dumm=new StringBuilder();
                for(Map.Entry<Character,Integer> ent:mp.entrySet()) {
                    if (ent.getValue() % 2 != 0) {
                        if (ent.getValue() > 1){
                            long fin=(long) Math.floor(ent.getValue()*1.0/2.0);
                            for (long i = 0; i < fin; i++) {
                                ans.append(ent.getKey());
                            }
                        }
                            dumm.append(ent.getKey());
                    }
                    else {
                        int a = ent.getValue() / 2;
                        for (int i = 0; i < a; i++) {
                            ans.append(ent.getKey());
                        }
                    }
                }
                    res.append(ans);
                    res.append(dumm);
                    res.append(ans.reverse());

            }
        }
        System.out.println(res.toString());
    }
}

