import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo2
{
    public static void main(String[] args) {
        String str= " the quick999999jdbc abc@gmail.com brown787878 foxx ju234523mps jdbc";
      //  Pattern p= Pattern.compile("[0-9A-za-z]+@gmail.com");//pattern provided here
        Pattern p= Pattern.compile("\\W");//special characters
//        Pattern p= Pattern.compile("\\w");//Alphanumeric except special char
//        Pattern p= Pattern.compile("\\s");//only space
//        Pattern p= Pattern.compile("\\W");//everything except space
        Matcher m= p.matcher(str); //target string provided here
        int ctr=0;
        while (m.find())
        {
            System.out.println(m.start() + "---------"+m.end()+ "---------"+ m.group());
            ctr++;
        }
        System.out.println("no of counts==" + ctr);
    }

}
