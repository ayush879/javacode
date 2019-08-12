import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim().replaceAll("\\t", "");
        String[] arr = {};
        if( s != null && !s.isEmpty() && s.length() < 400000) {
          arr = s.split("[ !,?.\\_'@]+");
        }
        System.out.println(arr.length);
        for (String a : arr) {
            System.out.println(a);
        }
        /*char c =' ' ; 
        String p ="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
             if((c!=' ')&&(c!=',')&&(c!='.')&&(c!='`')&&(c!='?')&&(c!='_')&&(c!='@'))
            {
            if((c!=' ')&&(c!=',')&&(c!='?')&&(c!='.')&&(c!='_')&&(c!='`')&&(c!='@')&&(c!='!'))
            {
                p=p+c;
            }
            else{
                System.out.println(p);
                count++;
                p="";
            }
            System.out.println(count);
        }
        System.out.println(count);
        p="";
        System.out.println(p);*/
        scan.close();
    }
}


