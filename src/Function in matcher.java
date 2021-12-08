/* Use of function of Matcher 
 1) find()
 2) start()
 3) end()
 4) group()
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo2 {
    public static void main(String[] args) {
        String str = "the quick999999jdbc brown787878 foxx ju234523mmps jdbc";
        Pattern p = Pattern.compile("[0-9]{6}");   // pattern provided here
        // Pattern p1 = Pattern.compile("",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);   // target string provided here
        int c=0;
        while(m.find())
        {
            System.out.println(m.start() + " -------- "+m.end() +" ----- "+m.group());
            c++;
        }
        System.out.println("number of counts = "+c);
    }
}
