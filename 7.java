import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
   // public String pattern="([0-1]?2[0-4]?25[0-5]).([0-1]?2[0-4]?25[0-5]).([0-1]?2[0-4]?25[0-5]).([0-1]?2[0-4]?25[0-5])";
   // public String pattern = "([0-2]?[0-5]?[0-5]{1}).([0-2]?[0-5]?[0-5]{1}).([0-2]?[0-5]?[0-5]{1}).([0-2]?[0-5]?[0-5]{1})";
     String pattern="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

}