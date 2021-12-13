import java.util.regex.Pattern;
import java.util.regex.Matcher;
//ww
public class REdemo
{
    public static void main(String[] args) {
        String str= " the quick jdbc brown foxx jumps jdbc";
        Pattern p= Pattern.compile("jdbc");//pattern provided here
        Matcher m= p.matcher(str); //target string provided here
        int c=0;
        while (m.find())
        {
            System.out.println(m.start() + "---------"+m.end()+ "---------"+ m.group());
            c++;
        }
        System.out.println("no of counts==" + c);
    }

}
