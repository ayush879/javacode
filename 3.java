

import java.util.Arrays;
/*class CharExample {
    public static void main(String[] args) {
    	
    	char letter1 = '9';
    	System.out.println(letter1);
    	
    	char letter2 = 65;
    	System.out.println(letter2);

    }
}*/
import java.util.Scanner;

public class CharExample {
//import java.util.Arrays;
    static boolean isAnagram(String A, String B) {
        // Complete the function
        if(A.length() != B.length()){
            return false;
        }
        else{
            char a[]=A.toLowerCase().toCharArray();
            char b[]=B.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String sortedA=String.valueOf(a);
            String sortedB=String.valueOf(b);
        
        if(sortedA.equals(sortedB))
        {
            return true;
        }
        }
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


